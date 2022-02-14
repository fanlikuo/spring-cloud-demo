package com.flk.cloud.order.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p class="detail">
 * 功能：订单接口定义类
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: OrderFacade
 * @date 2020年05月22日 10:58
 */
@FeignClient(name="order-service")
public interface OrderFacade {

    /**
     * <p >
     * 功能：新增订单
     * </p>
     * @param cartId 购物车ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @GetMapping(path="addOrder")
    void addOrder(@RequestParam("cartId") Long cartId);

}
