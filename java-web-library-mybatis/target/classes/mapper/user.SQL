CREATE TABLE `system_user` (
  `user_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(128) DEFAULT NULL COMMENT '用户名字',
  `user_age` int(8) DEFAULT NULL COMMENT '用户年龄',
  `disabled` tinyint(2) NOT NULL DEFAULT '0' COMMENT '逻辑删除标志 0未删除 1已删除',
  `created` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT '创建时间',
  `modified` timestamp(6) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT '用户';