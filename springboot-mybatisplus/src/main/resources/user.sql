DROP DATABASE
IF
	EXISTS `demo3`;
CREATE DATABASE `demo3` DEFAULT CHARACTER
SET utf8;
USE demo3;
CREATE TABLE
IF
	NOT EXISTS `tb_user` (
		`id` BIGINT ( 20 ) NOT NULL AUTO_INCREMENT COMMENT '主键',
		`name` VARCHAR ( 30 ) DEFAULT NULL COMMENT '姓名',
		`age` INT ( 11 ) DEFAULT NULL COMMENT '年龄',
		`email` VARCHAR ( 50 ) DEFAULT NULL COMMENT '邮箱',
		`manager_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '直属上级id',
		`create_time` datetime DEFAULT NULL COMMENT '创建时间',
		PRIMARY KEY ( `id` ),
		CONSTRAINT manager_fk FOREIGN KEY ( manager_id ) REFERENCES tb_user ( id )
	) ENGINE = INNODB DEFAULT CHARSET = utf8;
INSERT INTO tb_user ( id, NAME, age, email, manager_id, create_time )
VALUES
	( 1000000001, "boss", 40, "boss@qq.com", NULL, "2019-05-03 10:10:16" ),
	( 1000000002, "张三", 30, "zhangsan@qq.com", 1000000001, "2019-05-03 10:10:16" ),
	( 1000000003, "李四", 20, "lisi@qq.com", 1000000002, "2019-05-03 10:10:16" ),
	( 1000000004, "王五", 10, "wangwu@qq.com", 1000000002, "2019-05-03 10:10:16" ),
	( 1000000005, "老刘", 5, "laoliu@qq.com", 1000000002, "2019-05-03 10:10:16" );