package com.flk.cloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

/**
 * <p class="detail">
 * 功能：Web服务应用启动类
 * </p>
 *
 * @author fanlikuo
 * Copyright 2020 youx.com, Inc. All rights reserved
 * @version V1.0
 * @ClassName: CloudWebApplication
 * @date 2020年05月22日 10:11
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.flk.cloud.**")
public class CloudWebApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(CloudWebApplication.class, args);
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
