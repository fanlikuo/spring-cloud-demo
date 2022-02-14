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

 Date: 04/07/2020 17:46:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_cart
-- ----------------------------
DROP TABLE IF EXISTS `tb_cart`;
CREATE TABLE `tb_cart`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) NULL DEFAULT NULL COMMENT '用户ID',
  `goods_id` bigint(20) NULL DEFAULT NULL COMMENT '商品ID',
  `create_time` bigint(20) NULL DEFAULT NULL COMMENT '创建时间戳',
  `update_time` bigint(20) NULL DEFAULT NULL COMMENT '更新时间戳',
  `is_deleted` tinyint(4) NULL DEFAULT 0 COMMENT '删除标志 0：未删除；1：已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '购物车表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_cart
-- ----------------------------
INSERT INTO `tb_cart` VALUES (1, 1, 1, 1590114829756, 1590114829756, 0);

SET FOREIGN_KEY_CHECKS = 1;
