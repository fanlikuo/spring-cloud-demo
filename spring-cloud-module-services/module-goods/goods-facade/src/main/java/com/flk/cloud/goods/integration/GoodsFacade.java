package com.flk.cloud.goods.integration;

import com.flk.cloud.goods.dto.GoodsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p class="detail">
 * 功能：商品接口定义类
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: GoodsFacade
 * @date 2020年05月22日 15:45
 */
@FeignClient(name = "goods-service")
public interface GoodsFacade {

    /**
     * <p >
     * 功能：获取商品信息
     * </p>
     * @param goodsId 商品ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @GetMapping("/getByGoodsId")
    GoodsDTO getByGoodsId(@RequestParam("goodsId") Long goodsId);
    /**
     * <p >
     * 功能：扣减商品库存
     * </p>
     * @param goodsId 商品ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @GetMapping("/substractStock")
    void substractStock(@RequestParam("goodsId") Long goodsId);
}
