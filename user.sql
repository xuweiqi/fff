/*
Navicat MySQL Data Transfer

Source Server         : ha
Source Server Version : 50528
Source Host           : 127.0.0.1:3306
Source Database       : user

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-09-24 23:02:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bname` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `price` double DEFAULT NULL,
  `press` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `author` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '计算机', '12', '人民出版社', '小明');
INSERT INTO `book` VALUES ('2', '政治', '12', '人民出版社', '王晓晓');
INSERT INTO `book` VALUES ('3', '数学', '34', '人民出版社', '李希');
INSERT INTO `book` VALUES ('4', '英语', '89', '人民出版社', '慕容豆豆');
INSERT INTO `book` VALUES ('5', '语文', '56', '人民出版社', '张自忠');
INSERT INTO `book` VALUES ('6', '文言文', '789', '人民出版社', '张傻');
INSERT INTO `book` VALUES ('7', 'ps', '234', '人民出版社', '李雪');
INSERT INTO `book` VALUES ('8', 'dw', '45', '人民出版社', '欧欧阳');
INSERT INTO `book` VALUES ('10', '凉生，我们可不可以不忧伤', '12', '人民出版社', '夏桥');
INSERT INTO `book` VALUES ('11', '夏有乔木，仰望天堂', '23', '人民出版社', '潇潇');
INSERT INTO `book` VALUES ('12', '何所冬暖，何所夏凉', '77', '人民出版社', '席郗辰');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `id` int(11) NOT NULL,
  `bname` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `press` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '白娘子', '123', '0', null, null, null, null);
INSERT INTO `user` VALUES ('2', '小青', '123', '0', null, null, null, null);
INSERT INTO `user` VALUES ('3', '青山', '12', '0', null, null, null, null);
INSERT INTO `user` VALUES ('4', '全球', '111', '0', null, null, null, null);
INSERT INTO `user` VALUES ('5', '许仙', '111', '0', null, null, null, null);
INSERT INTO `user` VALUES ('6', 'admin', '123', '0', null, null, null, null);
