/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : 127.0.0.1:3306
 Source Schema         : spring-cloud

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 04/07/2020 17:38:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_goods
-- ----------------------------
DROP TABLE IF EXISTS `tb_goods`;
CREATE TABLE `tb_goods`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `stock_num` bigint(20) NULL DEFAULT NULL COMMENT '商品库存数量',
  `money` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品金额',
  `create_time` bigint(20) NULL DEFAULT NULL COMMENT '创建时间戳',
  `update_time` bigint(20) NULL DEFAULT NULL COMMENT '更新时间戳',
  `is_deleted` tinyint(4) NULL DEFAULT NULL COMMENT '删除标志 0：未删除；1：已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '商品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_goods
-- ----------------------------
INSERT INTO `tb_goods` VALUES (1, '键盘', 100, 100.00, 1590132270000, 1590377130, 0);

SET FOREIGN_KEY_CHECKS = 1;
