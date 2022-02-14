package com.flk.cloud.web.order;

import com.flk.cloud.order.integration.OrderFacade;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p class="detail">
 * 功能：订单服务控制层类
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: OrderController
 * @date 2020年05月22日 11:26
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    OrderFacade orderFacade;

    @GlobalTransactional
    @GetMapping("/add")
    public String add(@RequestParam("cartId") Long cartId){
        orderFacade.addOrder(cartId);
        return "OK";
    }

}
