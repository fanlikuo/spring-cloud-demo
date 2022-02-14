package com.flk.cloud.goods.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p class="detail">
 * 功能：商品数据类
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: GoodsDTO
 * @date 2020年05月22日 16:01
 */
public class GoodsDTO implements Serializable{

    private static final long serialVersionUID = -897229871858294985L;

    private Long id;

    private String name;

    private Long stockNum;

    private BigDecimal money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStockNum() {
        return stockNum;
    }

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
