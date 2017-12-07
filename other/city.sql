/*
Navicat MySQL Data Transfer

Source Server         : localhsot
Source Server Version : 50544
Source Host           : localhost:3306
Source Database       : dpms_info

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2017-12-06 16:27:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `city_code` int(11) unsigned NOT NULL,
  `city_` varchar(255) NOT NULL,
  `province_code` int(11) NOT NULL,
  PRIMARY KEY (`city_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('510100', '成都市', '510000');
INSERT INTO `city` VALUES ('510300', '自贡市', '510000');
INSERT INTO `city` VALUES ('510400', '攀枝花市', '510000');
INSERT INTO `city` VALUES ('510500', '泸州市', '510000');
INSERT INTO `city` VALUES ('510600', '德阳市', '510000');
INSERT INTO `city` VALUES ('510700', '绵阳市', '510000');
INSERT INTO `city` VALUES ('510800', '广元市', '510000');
INSERT INTO `city` VALUES ('510900', '遂宁市', '510000');
INSERT INTO `city` VALUES ('511000', '内江市', '510000');
INSERT INTO `city` VALUES ('511100', '乐山市', '510000');
INSERT INTO `city` VALUES ('511300', '南充市', '510000');
INSERT INTO `city` VALUES ('511400', '眉山市', '510000');
INSERT INTO `city` VALUES ('511500', '宜宾市', '510000');
INSERT INTO `city` VALUES ('511600', '广安市', '510000');
INSERT INTO `city` VALUES ('511700', '达州市', '510000');
INSERT INTO `city` VALUES ('511800', '雅安市', '510000');
INSERT INTO `city` VALUES ('511900', '巴中市', '510000');
INSERT INTO `city` VALUES ('512000', '资阳市', '510000');
INSERT INTO `city` VALUES ('513200', '阿坝州', '510000');
INSERT INTO `city` VALUES ('513300', '甘孜州', '510000');
INSERT INTO `city` VALUES ('513400', '凉山州', '510000');
