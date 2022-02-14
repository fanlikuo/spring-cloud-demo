package com.flk.cloud.cart.data.mapper;

import com.flk.cloud.cart.data.bean.TbCart;

public interface TbCartMapper {

    TbCart selectById(Long id);

    int insert(TbCart record);

    int deleteById(Long id);
}