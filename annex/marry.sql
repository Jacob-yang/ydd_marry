/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50733
Source Host           : localhost:3306
Source Database       : marry

Target Server Type    : MYSQL
Target Server Version : 50733
File Encoding         : 65001

Date: 2021-09-17 15:00:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bless
-- ----------------------------
DROP TABLE IF EXISTS `bless`;
CREATE TABLE `bless` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(255) DEFAULT NULL,
  `avatar_url` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1438695115426869251 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of bless
-- ----------------------------
INSERT INTO `bless` VALUES ('1438695115426869250', 'orgZZ5DKJvH1eDVsO41vup0njMgI', 'https://thirdwx.qlogo.cn/mmopen/vi_32/POgEwh4mIHO4nibH0KlMECNjjGxQUq24ZEaGT4poC6icRiccVGKSyXwibcPq4BWmiaIGuG1icwxaQX6grC9VemZoJ8rg/132', '微信用户', null);

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(255) DEFAULT NULL,
  `avatar_url` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `words` varchar(255) DEFAULT NULL COMMENT '评论',
  `color` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1438451166304927747 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES ('1', null, null, null, null, '恭喜恭喜', '#ff00ff');
INSERT INTO `comments` VALUES ('2', null, null, null, null, '恭喜阳哥', '#ff00ff');
INSERT INTO `comments` VALUES ('1438451166304927745', null, null, null, null, '新婚大喜！百年好合,琴瑟和鸣，岁月静好', null);
INSERT INTO `comments` VALUES ('1438451166304927746', null, null, null, null, '', null);

-- ----------------------------
-- Table structure for invitation
-- ----------------------------
DROP TABLE IF EXISTS `invitation`;
CREATE TABLE `invitation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `auto_play` tinyint(2) DEFAULT NULL COMMENT '0 不播放 1播放',
  `boy` varchar(50) DEFAULT NULL,
  `boy_phone` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `girl` varchar(255) DEFAULT NULL,
  `girl_phone` varchar(255) DEFAULT NULL,
  `hotel` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `latitude` varchar(255) DEFAULT NULL,
  `longitude` varchar(255) DEFAULT NULL,
  `lunar` varchar(255) DEFAULT NULL,
  `music` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of invitation
-- ----------------------------
INSERT INTO `invitation` VALUES ('1', '山西省宁武县', '1', '项阳阳', '15698343123', '2021-10-02 12:00:00', '亢楚媛', '15535002180', '宁武县宾馆', 'http://test1.djfy365.com:9000/wedding/xyk/bt2.jpg', '39.000155', '112.30701', '辛丑年八月廿六', 'http://test1.djfy365.com:9000/wedding/ctl.mp3');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` varchar(255) NOT NULL,
  `login_time` datetime DEFAULT NULL,
  `open_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of login
-- ----------------------------

-- ----------------------------
-- Table structure for photos
-- ----------------------------
DROP TABLE IF EXISTS `photos`;
CREATE TABLE `photos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `image` varchar(500) DEFAULT NULL,
  `flag` tinyint(2) DEFAULT '0' COMMENT 'img',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of photos
-- ----------------------------
INSERT INTO `photos` VALUES ('1', 'http://test1.djfy365.com:9000/wedding/ydd_kyy.mp4', '0');
INSERT INTO `photos` VALUES ('2', 'http://test1.djfy365.com:9000/wedding/xyk/bt1.jpg', null);
INSERT INTO `photos` VALUES ('3', 'http://test1.djfy365.com:9000/wedding/xyk/bt3.jpg', null);
INSERT INTO `photos` VALUES ('4', 'http://test1.djfy365.com:9000/wedding/xyk/bt4.jpg', null);
