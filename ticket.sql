/*
 Navicat Premium Data Transfer

 Source Server         : 33071
 Source Server Type    : MySQL
 Source Server Version : 50714
 Source Host           : localhost:3307
 Source Schema         : ticket

 Target Server Type    : MySQL
 Target Server Version : 50714
 File Encoding         : 65001

 Date: 13/12/2020 21:26:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dingdan
-- ----------------------------
DROP TABLE IF EXISTS `dingdan`;
CREATE TABLE `dingdan`  (
  `logname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `chufa` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `daoda` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `checi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of dingdan
-- ----------------------------
INSERT INTO `dingdan` VALUES ('3', '3', '3', '3', '3');
INSERT INTO `dingdan` VALUES ('weiqi', '香港', '北京', '2020.1.1', 'g2312');
INSERT INTO `dingdan` VALUES ('1', '北京', '上海', '2019.12.26', 'k532');
INSERT INTO `dingdan` VALUES ('4', '北京', '上海', '2019.12.26', 'k532');
INSERT INTO `dingdan` VALUES ('aaa', '北京', '上海', '2019.12.26', 'k532');
INSERT INTO `dingdan` VALUES ('aaa', 'null', 'null', 'null', '');
INSERT INTO `dingdan` VALUES ('aaa', 'null', 'null', 'null', '');
INSERT INTO `dingdan` VALUES ('aaa', 'null', 'null', 'null', '');
INSERT INTO `dingdan` VALUES ('aaa', 'null', 'null', 'null', '');
INSERT INTO `dingdan` VALUES ('aaa', '北京', '上海', '2019.12.26', 'k532');
INSERT INTO `dingdan` VALUES ('aaa', 'null', 'null', 'null', '');
INSERT INTO `dingdan` VALUES ('aaa', '石家庄北', '沧州', '2019.12.25', 'k7710');
INSERT INTO `dingdan` VALUES ('aaa', 'null', 'null', 'null', '');
INSERT INTO `dingdan` VALUES ('aaa', '北京', '上海', '2019.12.26', 'k532');

-- ----------------------------
-- Table structure for train
-- ----------------------------
DROP TABLE IF EXISTS `train`;
CREATE TABLE `train`  (
  `checi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `chufa` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `daoda` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of train
-- ----------------------------
INSERT INTO `train` VALUES ('k7710', '2019.12.25', '石家庄北', '沧州', '1');
INSERT INTO `train` VALUES ('k532', '2019.12.26', '北京', '上海', '2');
INSERT INTO `train` VALUES ('g2312', '2020.1.1', '香港', '北京', '3');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `logname` varchar(22) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(22) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `telephone` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`logname`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1');
INSERT INTO `user` VALUES ('2', '2', '2');
INSERT INTO `user` VALUES ('4', '4', '4');
INSERT INTO `user` VALUES ('aaa', '123', '123');
INSERT INTO `user` VALUES ('admin', 'da80912102', '18348882478');
INSERT INTO `user` VALUES ('weiqi', '123', '131');

SET FOREIGN_KEY_CHECKS = 1;
