package com.flk.cloud.cart.service;

import com.flk.cloud.cart.data.bean.TbCart;
import com.flk.cloud.cart.data.mapper.TbCartMapper;
import com.flk.cloud.cart.dto.CartDTO;
import com.flk.cloud.cart.integration.CartFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p class="detail">
 * 功能：购物车服务类
 * </p>
 *
 * @ClassName: DCartServiceImpl
 * @version V1.0
 * @author fanlikuo
 * @date 2020年04月22日 16:36
 */
@RestController
public class CartService implements CartFacade {

    Logger LOGGER = LoggerFactory.getLogger(CartService.class);

    @Autowired
    private TbCartMapper tbCartMapper;
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
    @Override
    public String addCart(Long userId,Long goodsId) {
        TbCart cart = new TbCart();
        cart.setUserId(userId);
        cart.setGoodsId(goodsId);
        cart.setCreateTime(System.currentTimeMillis());
        cart.setUpdateTime(cart.getCreateTime());
        cart.setIsDeleted(Byte.valueOf("0"));
        tbCartMapper.insert(cart);
        return null;
    }
    /**
     * <p >
     * 功能：获取购物车信息
     * </p>
     * @param cartId 购物车ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @Override
    public CartDTO getCartById(Long cartId) {
        CartDTO cartDTO = null;
        TbCart cart = tbCartMapper.selectById(cartId);
        if (null != cart) {
            cartDTO = new CartDTO();
            cartDTO.setUserId(cart.getUserId());
            cartDTO.setGoodsId(cart.getGoodsId());
        }
        return cartDTO;
    }
    /**
     * <p >
     * 功能：删除购物车信息
     * </p>
     * @param cartId 购物车ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @Override
    public void deleteCartById(Long cartId) {
        tbCartMapper.deleteById(cartId);
    }
}
