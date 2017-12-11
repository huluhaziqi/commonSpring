package com.lin.commonspring.util;

import com.lin.commonspring.model.biz.account.LoginUser;
import com.lin.commonspring.model.biz.account.SsoUserInfo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;

public class AccountUtils {

    private static Logger logger = LoggerFactory.getLogger(AccountUtils.class);

    /**
     * 获取用户登录信息
     *
     * @param request
     * @return
     */
    public static LoginUser getUserLoginInfo(HttpServletRequest request) {
        LoginUser loginUser = null;
        if (request == null) {
            return loginUser;
        }
        String userId = request.getHeader("UserId");
        String uid = request.getHeader("Uid");
        String uuid = request.getHeader("UUid");
        if (StringUtils.isBlank(userId) && (StringUtils.isNotBlank(uid) || StringUtils.isNotBlank(uuid))) {
            logger.debug("解析错误");
        }
        if (StringUtils.isNotBlank(userId)) {
            loginUser = new LoginUser();
            loginUser.setUserId(userId);
            loginUser.setUid(Long.parseLong(uid));
            loginUser.setUuuid(uuid);
            loginUser.setCookie(request.getHeader("cookie"));
        }
        return loginUser;
    }

    public static SsoUserInfo getSsoUserInfo(HttpServletRequest request){
        SsoUserInfo ssoUserInfo = new SsoUserInfo();
        //todo
        return  ssoUserInfo;
    }

    public static Boolean isCookieValid(String cookie) {
        if (StringUtils.isEmpty(cookie)) {
            return false;
        }
        cookie = cookie.replace("；", ";");
        String[] cookieParams = cookie.split(";");
        String ppinf = null;
        for (String cookieParam : cookieParams) {
            String[] raw = cookieParam.trim().split("=");
            if (raw[0].equals("ppinf")) {
                ppinf = raw[1];
                break;
            }
        }
        if (StringUtils.isEmpty(ppinf)) {
            return false;
        }
        String inf = new String(Base64.getDecoder().decode(ppinf));
        String[] userInfos = inf.split("\\|");
        if (StringUtils.isEmpty(userInfos[2])) {
            return false;
        }
        Long expireTime = Long.valueOf(userInfos[2]);
        return expireTime > System.currentTimeMillis();
    }


}
