package com.lin.commonspring.interceptor;

import com.lin.commonspring.annotation.AdminRequired;
import com.lin.commonspring.annotation.HostRequired;
import com.lin.commonspring.annotation.LoginRequired;
import com.lin.commonspring.annotation.SignRequired;
import com.lin.commonspring.exception.UserStateException;
import com.lin.commonspring.exception.UserStateException.UserStateExceptionEnum;
import com.lin.commonspring.model.biz.account.LoginUser;
import com.lin.commonspring.model.entity.UserEntity;
import com.lin.commonspring.service.UserService;
import com.lin.commonspring.util.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        LoginRequired loginRequired = handlerMethod.getMethodAnnotation(LoginRequired.class);
        AdminRequired adminRequired = handlerMethod.getMethodAnnotation(AdminRequired.class);
        HostRequired hostRequired = handlerMethod.getMethodAnnotation(HostRequired.class);
        SignRequired signRequired = handlerMethod.getMethodAnnotation(SignRequired.class);

        if (loginRequired != null) {
            if (AccountUtils.getUserLoginInfo(request) == null) {
                throw new UserStateException(UserStateExceptionEnum.USER_NOT_EXIST);
            }
            if (AccountUtils.isCookieValid(request.getHeader("cookie"))) {
                throw new UserStateException(UserStateExceptionEnum.USER_COOKIE_EXPIRED);
            }
        }

        if (adminRequired != null) {
            if (AccountUtils.getSsoUserInfo(request) == null) {
                throw new UserStateException(UserStateExceptionEnum.USER_ADMIN_NEEDED);
            }
        }

        if (hostRequired != null) {
            LoginUser loginUser = AccountUtils.getUserLoginInfo(request);
            if (loginUser == null) {
                throw new UserStateException(UserStateExceptionEnum.USER_NOT_EXIST);
            }
            if (AccountUtils.getSsoUserInfo(request) == null) {
                throw new UserStateException(UserStateExceptionEnum.USER_ADMIN_NEEDED);
            }
            UserEntity userEntity = userService.getById(loginUser.getUid());
            if (userEntity == null) {
                throw new UserStateException(UserStateExceptionEnum.USER_HOST_APPLICATION_NEEDED);
            }
            switch (userEntity.getStatus()) {
                case 1:
                    throw new UserStateException(UserStateExceptionEnum.USER_HOST_APPLICATION_NEEDED);
                case 2:
                    return true;
                case 3:
                    throw new UserStateException(UserStateExceptionEnum.USER_HOST_APPLICATION_NEEDED);
                case 4:
                    throw new UserStateException(UserStateExceptionEnum.USER_FROZEN);
                case 5:
                    throw new UserStateException(UserStateExceptionEnum.USER_HOST_APPLICATION_NEEDED);
                case 6:
                    throw new UserStateException(UserStateExceptionEnum.USER_PROTOCOL_LOCK);
                default:
                    break;
            }
        }

        if (signRequired != null) {
            //TODO
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
}
