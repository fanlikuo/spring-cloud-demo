package com.flk.cloud.goods.data.mapper;

import com.flk.cloud.goods.data.bean.TbGoods;

public interface TbGoodsMapper {

    TbGoods selectById(Long id);

    int updateSubstractStockNumById(Long id);
}