/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : ssmp

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 23/09/2022 17:19:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_book
-- ----------------------------
DROP TABLE IF EXISTS `tbl_book`;
CREATE TABLE `tbl_book`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deleted` int NOT NULL DEFAULT 1 COMMENT '0代表删除，1代表未删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_book
-- ----------------------------
INSERT INTO `tbl_book` VALUES (1, '计算机理论', 'Java编程思想（第4版）', 'Java学习经典,殿堂级著作！赢得了全球程序员的广泛赞誉。', 1);
INSERT INTO `tbl_book` VALUES (2, '计算机理论', '计算机组成原理', '资深的计算机体系结构教育家Alan Clements博士编写，涵盖计算机系统的组成和体系结构的基本概念、指令系统以及处理器实现等涉及计算机组成原理课程的内容。', 1);
INSERT INTO `tbl_book` VALUES (3, '程序设计', 'C++ Primer Plus 第6版 中文版', 'C++程序设计经典教程，畅销30年的C++大百科全书全新升级，经典C++入门教程十年新版再现', 1);
INSERT INTO `tbl_book` VALUES (4, '程序设计', 'RocketMQ技术内幕：RocketMQ架构设计与实现原理（第2版）', '畅销书升级，RocketMQ创始人高度评价，深入源码分析技术架构和实现原理，打造高性能、高可用、高吞吐量、低延迟RocketMQ', 1);
INSERT INTO `tbl_book` VALUES (5, '程序设计', ' 深入理解Java虚拟机：JVM高级特性与实践（第3版）', '周志明虚拟机新作，第3版新增内容近50%，5个维度全面剖析JVM，大厂面试知识点全覆盖。与 Java编程思想、Effective Java、Java核心技术 堪称：Java四大名著', 1);
INSERT INTO `tbl_book` VALUES (6, '历史', '见识城邦·人类简史：从动物到上帝（新版）', '以色列新锐历史学家尤瓦尔·赫拉利代表作，第十届文津图书奖获奖作品', 1);
INSERT INTO `tbl_book` VALUES (7, '历史', '中国通史', '吕思勉先生写给普通读者的中国通史入门书，用白话文写成的中国通史，把历史从“帝王的家谱”转变为人类的进化史', 1);
INSERT INTO `tbl_book` VALUES (8, '哲学', '理想国（柏拉图代表作）', '奠定西方哲学史的源流之作。2021新译本，以斯灵斯校勘本为底本，遵照“字对字”的原则，从古希腊原文直译，兼顾准确性和语言通顺性，助你读懂理想国。', 1);
INSERT INTO `tbl_book` VALUES (9, '哲学', '苏格拉底的申辩', '《柏拉图注疏集:苏格拉底的申辩》记述的是公元前399年，一个叫莫勒图斯的年轻人在雅典状告哲学家苏格拉底，说他不信城邦诸神，引进新的精灵之事，败坏青年。 于是，苏格拉底被传讯，在500人组成的陪审团面前作了著名的申辩。', 1);
INSERT INTO `tbl_book` VALUES (10, '文学', '鲁迅全集', '大师全集，完整收录，鲁迅毕生之心血尽归于此.鲁迅是中国20世纪的文学家、思想家、革命家，中国近代文学巨匠。他早年留学于日本，后来弃医从文，他用笔耕不辍的文字为新一代青年们指引方向，在国内外思想文化领域有着极高的声誉。', 1);
INSERT INTO `tbl_book` VALUES (11, '文学', '人间清醒', '茅盾文学奖获得者梁晓声2021全新力作', 1);
INSERT INTO `tbl_book` VALUES (12, '经济', '八次危机：中国的真实经验1949-2009', '著名“三农”专家温铁军，用经济的独特视角，重新审视中国的1949-2009，历史给我了我们怎样的真实经验？', 1);

SET FOREIGN_KEY_CHECKS = 1;
