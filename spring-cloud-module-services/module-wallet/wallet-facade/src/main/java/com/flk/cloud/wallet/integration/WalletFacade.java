package com.flk.cloud.wallet.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * <p class="detail">
 * 功能：钱包接口定义类
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: WalletFacade
 * @date 2020年05月22日 16:29
 */
@FeignClient(name = "wallet-service")
public interface WalletFacade {

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
    @GetMapping("/substractMoney")
    void substractMoney(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);

}
