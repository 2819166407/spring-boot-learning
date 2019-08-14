DROP DATABASE
IF
	EXISTS `demo4`;
CREATE DATABASE `demo4`;
USE demo4;
CREATE TABLE
IF
	NOT EXISTS `user` (
		`id` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT '主键',
		`name` VARCHAR ( 30 ) NULL DEFAULT NULL COMMENT '姓名',
		`age` INT ( 11 ) NULL DEFAULT NULL COMMENT '年龄',
		`email` VARCHAR ( 50 ) NULL DEFAULT NULL COMMENT '邮箱',
		PRIMARY KEY ( `id` )
	) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET utf8;
INSERT INTO `user` ( NAME, age, email )
VALUES
	( '张三', 18, 'zhangsan@qq.com' ),
	( '李四', 22, 'lisi@qq.com' ),
	( '王五', 36, 'wangwu@qq.com' ),
	( '老六', 52, 'laoliu@qq.com' );