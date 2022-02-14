package com.flk.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p class="detail">
 * 功能：SpringCloud eureka服务端
 * </p>
 *
 * @ClassName: EurekaServerApplication
 * @author fanlikuo
 * @version V1.0
 * @date 2020年03月28日 10:27
 * Copyright 2020 youx.com, Inc. All rights reserved
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
