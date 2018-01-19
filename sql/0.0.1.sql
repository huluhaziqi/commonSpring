drop TABLE IF EXISTS focus_live.mini_video;
CREATE TABLE focus_live.mini_video(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '小视频id',
  `type` TINYINT DEFAULT 1 COMMENT '小视频类型，来自剪切，还是来自直接录制',
  `liveroom_id` BIGINT NULL COMMENT '来源直播间id',
  `host_id` BIGINT(20) NOT NULL COMMENT '小视频作者',
  `status` TINYINT NOT NULL  COMMENT  '小视频状态',
  `title` VARCHAR(200) NOT NULL COMMENT '小视频标题',
  `info` varchar(1024) DEFAULT NULL,
  `img_path` VARCHAR(200) DEFAULT NULL COMMENT '小视频封面',
  `city_id` INT NOT NULL COMMENT '小视频所在城市',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

drop TABLE IF EXISTS focus_live.mini_video_record;
CREATE TABLE focus_live.mini_video_record(
  `mini_video_id` BIGINT NOT NULL COMMENT '小视频id',
  `file_id` VARCHAR(200) DEFAULT NULL COMMENT '小视频file_id',
  `url` VARCHAR(200) DEFAULT NULL COMMENT '小视频播放链接',
  `origin_url` VARCHAR(200) DEFAULT NULL COMMENT '小视频原始视频',
  `mp4_10_url` VARCHAR(200) DEFAULT NULL COMMENT '小视频mp4_10',
  `mp4_20_url` VARCHAR(200) DEFAULT NULL COMMENT '小视频mp4_20',
  `mp4_30_url` VARCHAR(200) DEFAULT NULL COMMENT '小视频mp4_30',
  `mp4_40_url` VARCHAR(200) DEFAULT NULL COMMENT '小视频mp4_40',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NULL DEFAULT NULL,
  `duration` BIGINT(20) DEFAULT 0 COMMENT '小视频时长',
  PRIMARY KEY (`mini_video_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

drop TABLE IF EXISTS focus_live.stat_mini_video;
CREATE TABLE focus_live.stat_mini_video(
  `mini_video_id` BIGINT NOT NULL COMMENT '小视频id',
  `total_vv` BIGINT DEFAULT 0 COMMENT '小视频总观看量',
  `app_vv` BIGINT DEFAULT 0 COMMENT '小视频app观看量',
  `wap_vv` BIGINT DEFAULT 0 COMMENT '小视频wap观看量',
  `pc_vv` BIGINT DEFAULT 0 COMMENT '小视频pc观看量',
  `robot_vv` BIGINT DEFAULT 0 COMMENT '小视频灌水',
  `like_count` BIGINT DEFAULT 0 COMMENT '小视频点赞量',
  PRIMARY KEY (`mini_video_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS focus_live.mini_video_tag;
CREATE TABLE focus_live.mini_video_tag(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `mini_video_id` BIGINT NOT NULL COMMENT '小视频id',
  `tag_id` BIGINT NOT NULL COMMENT 'tag_id',
  `status` TINYINT NOT NULL COMMENT '是否有效',
  PRIMARY KEY (`id`),
  UNIQUE INDEX id_index (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS focus_live.mini_video_building;
CREATE TABLE focus_live.mini_video_building(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `mini_video_id` BIGINT(20) NOT NULL COMMENT '小视频id',
  `building_id` VARCHAR(200) NOT NULL COMMENT '楼盘id',
  `status` TINYINT NOT NULL COMMENT '状态',
  `update_time` datetime NOT NULL DEFAULT current_timestamp,
  `building_type` TINYINT(4) not NULL COMMENT '楼盘类型，新房、二手房、海外置业',
  PRIMARY KEY (`id`),
  KEY mini_video_building_index (`mini_video_id`,`building_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE = utf8_general_ci;

DROP TABLE IF EXISTS focus_live.video_tag;
CREATE TABLE focus_live.video_tag(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `status` tinyint(4) NOT NULL,
  `type` tinyint(3) unsigned NOT NULL,
  `name` varchar(40) NOT NULL,
  `create_time` datetime NULL DEFAULT current_timestamp,
  `seq` TINYINT(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE = utf8_general_ci;

-- 精选视频审核队列
DROP TABLE IF EXISTS focus_live.mini_video_review;
CREATE TABLE `focus_live`.`mini_video_review`(
  `mini_video_id` BIGINT NOT NULL COMMENT '小视频id',
  `status` TINYINT NOT NULL COMMENT '状态',
  `reviewer_name` VARCHAR(50) COMMENT '操作人姓名',
  `info` VARCHAR(100) COMMENT '备注/原因',
  `create_time` DATETIME NOT NULL COMMENT '创建日期',
  `update_time` DATETIME COMMENT '更新日期',
  PRIMARY KEY (`mini_video_id`)
) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;

-- 精选视频审核日志记录
DROP TABLE IF EXISTS focus_live.mini_video_review_log;
CREATE TABLE `focus_live`.`mini_video_review_log`(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `mini_video_id` BIGINT NOT NULL COMMENT '小视频id',
  `status` TINYINT NOT NULL COMMENT '状态',
  `reviewer_name` VARCHAR(50) COMMENT '操作人姓名',
  `info` VARCHAR(100) COMMENT '备注/原因',
  `create_time` DATETIME NOT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;

drop TABLE IF EXISTS focus_live.mini_video_cut_record;
CREATE TABLE focus_live.mini_video_cut_record(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `liveroom_id` BIGINT(20) NOT NULL COMMENT '直播间 id ',
  `mini_video_id` BIGINT(20) DEFAULT NULL COMMENT '小视频id',
  `vod_task_id` VARCHAR(200) COMMENT 'vod_task_id',
  `origin_file_id` VARCHAR(200) NOT NULL COMMENT '源fileId',
  `new_file_id` VARCHAR(200) COMMENT '新fileId',
  `status` TINYINT NOT NULL comment '状态',
  `create_time` DATETIME NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  `update_time` DATETIME COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY liveroom_vod_task_index (`liveroom_id`,`vod_task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE = utf8_general_ci;