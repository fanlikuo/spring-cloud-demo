package com.flk.cloud.wallet.service;

import com.flk.cloud.wallet.data.mapper.TbWalletMapper;
import com.flk.cloud.wallet.integration.WalletFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * <p class="detail">
 * 功能：用户钱包接口实现类
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: WalletService
 * @date 2020年05月22日 16:34
 */

@RestController
public class WalletService implements WalletFacade {

    @Autowired
    private TbWalletMapper tbWalletMapper;

    /**
     * <p >
     * 功能：扣减用户钱包金额
     * </p>
     * @param userId 用户ID
     * @param money 金额
     * @author fanlikuo
     * @date  2020年05月22日
     * @return
     */
    @Override
    public void substractMoney(Long userId, BigDecimal money) {
        if (tbWalletMapper.updateSubstractMoney(userId,money) != 1) {
            throw new RuntimeException("用户金额异常");
        }
    }
}
