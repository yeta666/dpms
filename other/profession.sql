/*
Navicat MySQL Data Transfer

Source Server         : localhsot
Source Server Version : 50544
Source Host           : localhost:3306
Source Database       : dpms_info

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2017-12-06 16:27:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for profession
-- ----------------------------
DROP TABLE IF EXISTS `profession`;
CREATE TABLE `profession` (
  `profession_code` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `profession_` varchar(255) NOT NULL,
  PRIMARY KEY (`profession_code`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of profession
-- ----------------------------
INSERT INTO `profession` VALUES ('1', '农、林、牧、渔业');
INSERT INTO `profession` VALUES ('2', '采矿业');
INSERT INTO `profession` VALUES ('3', '制造业');
INSERT INTO `profession` VALUES ('4', '电力、热水、燃气及生产和供应业');
INSERT INTO `profession` VALUES ('5', '建筑业');
INSERT INTO `profession` VALUES ('6', '批发和零售业');
INSERT INTO `profession` VALUES ('7', '交通运输、仓储和邮政业');
INSERT INTO `profession` VALUES ('8', '住宿和餐饮业');
INSERT INTO `profession` VALUES ('9', '信息传输、软件和信息技术服务业');
INSERT INTO `profession` VALUES ('10', '金融业');
INSERT INTO `profession` VALUES ('11', '房地产业');
INSERT INTO `profession` VALUES ('12', '租贷和商务服务业');
INSERT INTO `profession` VALUES ('13', '科学研究和技术服务业');
INSERT INTO `profession` VALUES ('14', '水利、环境和公共设施管理业');
INSERT INTO `profession` VALUES ('15', '居民服务、修理和其他服务业');
INSERT INTO `profession` VALUES ('16', '教育');
INSERT INTO `profession` VALUES ('17', '卫生和社会工作');
INSERT INTO `profession` VALUES ('18', '文化、体育和娱乐业');
INSERT INTO `profession` VALUES ('19', '公共管理、社会保障和社会组织');
INSERT INTO `profession` VALUES ('20', '国际组织');
INSERT INTO `profession` VALUES ('21', '其他');
