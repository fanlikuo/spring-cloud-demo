package com.flk.cloud.wallet.data.mapper;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface TbWalletMapper {

    int updateSubstractMoney(@Param("userId") Long userId, @Param("money") BigDecimal money);
}