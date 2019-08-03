CREATE DATABASE demo2 DEFAULT CHARACTER
SET utf8;
USE demo2;
CREATE TABLE
IF
	NOT EXISTS `tb_area` (
		`area_id` INT ( 2 ) NOT NULL AUTO_INCREMENT,
		`area_name` VARCHAR ( 200 ) NOT NULL,
		`priority` INT ( 2 ) NOT NULL DEFAULT '0' COMMENT '权重排序',
		`create_time` datetime DEFAULT NULL,
		`last_edit_time` datetime DEFAULT NULL,
		PRIMARY KEY ( `area_id` ),
	UNIQUE KEY `UK_AREA` ( `area_name` )
	) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;