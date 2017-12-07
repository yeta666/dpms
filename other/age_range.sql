/*
Navicat MySQL Data Transfer

Source Server         : localhsot
Source Server Version : 50544
Source Host           : localhost:3306
Source Database       : dpms_info

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2017-12-06 16:27:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for age_range
-- ----------------------------
DROP TABLE IF EXISTS `age_range`;
CREATE TABLE `age_range` (
  `age_range_code` int(11) NOT NULL,
  `bottom_` int(11) DEFAULT NULL,
  `top_` int(11) DEFAULT NULL,
  PRIMARY KEY (`age_range_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of age_range
-- ----------------------------
INSERT INTO `age_range` VALUES ('1', '0', '4');
INSERT INTO `age_range` VALUES ('2', '5', '9');
INSERT INTO `age_range` VALUES ('3', '10', '14');
INSERT INTO `age_range` VALUES ('4', '15', '19');
INSERT INTO `age_range` VALUES ('5', '20', '24');
INSERT INTO `age_range` VALUES ('6', '25', '29');
INSERT INTO `age_range` VALUES ('7', '30', '34');
INSERT INTO `age_range` VALUES ('8', '35', '39');
INSERT INTO `age_range` VALUES ('9', '40', '44');
INSERT INTO `age_range` VALUES ('10', '45', '49');
INSERT INTO `age_range` VALUES ('11', '50', '54');
INSERT INTO `age_range` VALUES ('12', '55', '59');
INSERT INTO `age_range` VALUES ('13', '60', '64');
INSERT INTO `age_range` VALUES ('14', '65', '69');
INSERT INTO `age_range` VALUES ('15', '70', '74');
INSERT INTO `age_range` VALUES ('16', '75', '79');
INSERT INTO `age_range` VALUES ('17', '80', '84');
INSERT INTO `age_range` VALUES ('18', '85', '89');
INSERT INTO `age_range` VALUES ('19', '90', '94');
INSERT INTO `age_range` VALUES ('20', '95', '99');
INSERT INTO `age_range` VALUES ('21', '100', '100');
