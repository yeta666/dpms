/*
Navicat MySQL Data Transfer

Source Server         : localhsot
Source Server Version : 50544
Source Host           : localhost:3306
Source Database       : dpms_aba

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2017-12-07 16:33:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for people2016
-- ----------------------------
DROP TABLE IF EXISTS `people2016`;
CREATE TABLE `people2016` (
  `id_` int(11) NOT NULL,
  `id_number` varchar(255) DEFAULT NULL,
  `last_name_code` int(11) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender_` tinyint(1) DEFAULT NULL,
  `age_range_code` int(11) DEFAULT NULL,
  `age_` int(11) DEFAULT NULL,
  `nation_code` int(11) DEFAULT NULL,
  `nation_` varchar(255) DEFAULT NULL,
  `province_code` int(11) DEFAULT NULL,
  `province_` varchar(255) DEFAULT NULL,
  `city_code` int(11) DEFAULT NULL,
  `city_` varchar(255) DEFAULT NULL,
  `region_code` int(11) DEFAULT NULL,
  `region_` varchar(255) DEFAULT NULL,
  `profession_code` int(11) DEFAULT NULL,
  `profession_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
