package com.flk.cloud.order.service;

import com.flk.cloud.cart.dto.CartDTO;
import com.flk.cloud.cart.integration.CartFacade;
import com.flk.cloud.goods.dto.GoodsDTO;
import com.flk.cloud.goods.integration.GoodsFacade;
import com.flk.cloud.order.data.bean.TbOrder;
import com.flk.cloud.order.data.mapper.TbOrderMapper;
import com.flk.cloud.order.integration.OrderFacade;
import com.flk.cloud.wallet.integration.WalletFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p class="detail">
 * 功能：订单接口实现类
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: OrderService
 * @date 2020年05月22日 11:02
 */
@RestController
public class OrderService implements OrderFacade {

    @Autowired
    private TbOrderMapper tbOrderMapper;
    @Autowired
    private CartFacade cartFacade;
    @Autowired
    private GoodsFacade goodsFacade;
    @Autowired
    private WalletFacade walletFacade;

    /**
     * <p >
     * 功能：新增订单
     * </p>
     * @param cartId 购物车ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @Override
    public void addOrder(Long cartId) {
        CartDTO cart = cartFacade.getCartById(cartId);
        TbOrder order = new TbOrder();
        order.setUserId(cart.getUserId());
        order.setGoodsId(cart.getGoodsId());
        order.setOrderNo(String.valueOf(System.currentTimeMillis()));
        order.setCreateTime(System.currentTimeMillis());
        order.setUpdateTime(order.getCreateTime());
        order.setIsDeleted(Byte.valueOf("0"));
        // 新增订单
        tbOrderMapper.insert(order);
        // 删除购物车
        cartFacade.deleteCartById(cartId);
        GoodsDTO goods = goodsFacade.getByGoodsId(cart.getGoodsId());
        // 扣减库存
        goodsFacade.substractStock(goods.getId());
        // 扣减金额
        walletFacade.substractMoney(cart.getUserId(),goods.getMoney());
//        throw new RuntimeException();
    }
}
