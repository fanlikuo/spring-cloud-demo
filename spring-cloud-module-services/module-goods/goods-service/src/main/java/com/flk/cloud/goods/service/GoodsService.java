package com.flk.cloud.goods.service;

import com.flk.cloud.goods.data.bean.TbGoods;
import com.flk.cloud.goods.data.mapper.TbGoodsMapper;
import com.flk.cloud.goods.dto.GoodsDTO;
import com.flk.cloud.goods.integration.GoodsFacade;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p class="detail">
 * 功能：商品接口定义实现类
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: GoodsService
 * @date 2020年05月22日 16:04
 */
@RestController
public class GoodsService implements GoodsFacade {

    @Autowired
    private TbGoodsMapper tbGoodsMapper;
    /**
     * <p >
     * 功能：获取商品信息
     * </p>
     * @param goodsId 商品ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @Override
    public GoodsDTO getByGoodsId(Long goodsId) {
        GoodsDTO goodsDTO = null;
        TbGoods goods = tbGoodsMapper.selectById(goodsId);
        if (null != goods) {
            goodsDTO = new GoodsDTO();
            BeanUtils.copyProperties(goods,goodsDTO);
        }
        return goodsDTO;
    }
    /**
     * <p >
     * 功能：扣减商品库存
     * </p>
     * @param goodsId 商品ID
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @Override
    public void substractStock(@RequestParam("goodsId") Long goodsId) {
        if (tbGoodsMapper.updateSubstractStockNumById(goodsId) != 1) {
            throw new RuntimeException("扣减库存异常");
        }
    }
}
