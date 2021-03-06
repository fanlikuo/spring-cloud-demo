package com.flk.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <p class="detail">
 * 功能：SpringCloud Config服务类
 * </p>
 *
 * @ClassName: ConfigServerApplication
 * @author fanlikuo
 * @version V1.0
 * @date 2020年03月22日 18:31
 */
@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
