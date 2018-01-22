package com.lin.commonspring.controller;


import com.lin.commonspring.annotation.HostRequired;
import com.lin.commonspring.dao.PlayBackConcatDao;
import com.lin.commonspring.enums.MiniVideoStatusEnum;
import com.lin.commonspring.enums.MiniVideoTypeEnum;
import com.lin.commonspring.exception.LiveroomStateException;
import com.lin.commonspring.exception.LiveroomStateException.LiveroomStateExceptionEnum;
import com.lin.commonspring.exception.MiniVideoStateException;
import com.lin.commonspring.exception.MiniVideoStateException.MiniVideoStateExceptionEnum;
import com.lin.commonspring.model.Response.QCloudVODVideoAddSimpleClipTaskResponse;
import com.lin.commonspring.model.biz.account.LoginUser;
import com.lin.commonspring.model.entity.MiniVideoEntity;
import com.lin.commonspring.model.request.MiniVideoCreateRequest;
import com.lin.commonspring.model.view.MiniVideoWithUploadCount;
import com.lin.commonspring.service.MiniVideoService;
import com.lin.commonspring.service.QCloudVODNetService;
import com.lin.commonspring.service.StatMiniVideoService;
import com.lin.commonspring.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = {"/api/miniVideo", "/ajax/miniVideo"})
public class MiniVideoController {

    @Autowired
    private MiniVideoService miniVideoService;


    @Autowired
    private UserService userService;

    @Autowired
    private PlayBackConcatDao playBackConcatDao;

    @Autowired
    private QCloudVODNetService qCloudVODNetService;

    @Autowired
    private StatMiniVideoService statMiniVideoService;

    @RequestMapping(value = "/create", method = POST)
    @HostRequired
    public MiniVideoWithUploadCount createMiniVideo(@Valid MiniVideoCreateRequest request, LoginUser loginUser,
                                                    HttpServletRequest httpServletRequest) {
        long uid = loginUser.getUid();
        //昵称检查

        //获取liveroom fileId
        String fileId = playBackConcatDao.getFileByLiveroomId(request.getLiveroomId());
        if (StringUtils.isEmpty(fileId)) {
            throw new LiveroomStateException(LiveroomStateExceptionEnum.LIVEROOM_FILE_ID_NOT_EXIST);
        }
        //标题检查

        //调用腾讯云视频剪辑的接口
        QCloudVODVideoAddSimpleClipTaskResponse clipTaskResponse = qCloudVODNetService.addVideoSimpleClipTaskByLiveroomId(request.getLiveroomId(),
                fileId, request.getStartTimeOffset(), request.getEndTimeOffset());
        //若调用成功，则将视频剪切的任务ID写入到数据库
        if (clipTaskResponse.getCode() == 0) {
            miniVideoService.createMiniVideoCutRecord(request.getLiveroomId(), fileId,
                    clipTaskResponse.getVodTaskId());
        } else {
            throw new MiniVideoStateException(MiniVideoStateExceptionEnum.MINI_VIDEO_CUT_TASK_FAIL);
        }

        //小视频保存
        MiniVideoEntity miniVideoEntity = new MiniVideoEntity();
        Date createTime = new Date(System.currentTimeMillis());
        miniVideoEntity.setCreateTime(createTime);
        miniVideoEntity.setStatus(MiniVideoStatusEnum.CUT.getValue());
        miniVideoEntity.setTitle(request.getTitle());
        miniVideoEntity.setHostId(uid);
        miniVideoEntity.setCityId(request.getCityId());
        miniVideoEntity.setLiveroomId(request.getLiveroomId());
        miniVideoEntity.setType(MiniVideoTypeEnum.FROM_CUT.getValue());

        Long miniVideoId = miniVideoService.createMiniVideo(miniVideoEntity, uid, request.getTagIds(),
                request.getBuildingIds(), request.getBuildingType(), clipTaskResponse.getVodTaskId());
        MiniVideoWithUploadCount miniVideoWithUploadCount = new MiniVideoWithUploadCount();
        miniVideoWithUploadCount.setMiniVideoId(miniVideoId);
        return miniVideoWithUploadCount;
    }
}
