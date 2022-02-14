package com.flk.cloud.cart.integration;

import com.flk.cloud.cart.dto.CartDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p class="detail">
 * 功能：购物车接口定义
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: CartFacade
 * @date 2020年05月22日 10:14
 */
@FeignClient(name = "cart-service")
public interface CartFacade {

    /**
     * <p >
     * 功能：增加商品至购物车
     * </p>
     * @param userId 用户ID
     * @param goodsId 商品ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @GetMapping(path = "/add")
    String addCart(@RequestParam("userId") Long userId,@RequestParam("goodsId") Long goodsId);
    /**
     * <p >
     * 功能：获取购物车信息
     * </p>
     * @param cartId 购物车ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @GetMapping(path = "/getCartById")
    CartDTO getCartById(@RequestParam("cartId") Long cartId);
    /**
     * <p >
     * 功能：删除购物车信息
     * </p>
     * @param cartId 购物车ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @GetMapping(path = "/deleteCartById")
    void deleteCartById(@RequestParam("cartId") Long cartId);
}
