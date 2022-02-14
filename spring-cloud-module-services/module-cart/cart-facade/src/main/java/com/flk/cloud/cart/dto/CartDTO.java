package com.flk.cloud.cart.dto;

import java.io.Serializable;

/**
 * <p class="detail">
 * 功能：购物车数据类
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: CartDTO
 * @date 2020年05月22日 11:08
 */
public class CartDTO implements Serializable{

    private static final long serialVersionUID = 7670993446634402003L;

    /**用户id**/
    private Long userId;
    /**商品id**/
    private Long goodsId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}
