package com.flk.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p class="detail">
 * 功能：订单服务应用启动类
 * </p>
 *
 * @ClassName: CartServiceApplication
 * @version V1.0
 * @author fanlikuo
 * @date 2020年05月22日 17:00
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.flk.cloud.cart.*","com.flk.cloud.goods.*","com.flk.cloud.wallet.*"})
@EnableAutoConfiguration
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
