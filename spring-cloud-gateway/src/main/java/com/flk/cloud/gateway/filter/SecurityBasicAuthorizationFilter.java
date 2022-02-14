package com.flk.cloud.gateway.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import java.nio.charset.Charset;

@Component
public class SecurityBasicAuthorizationFilter implements GlobalFilter, Ordered {

    /**授权访问用户名*/
    @Value("${spring.security.user.name}")
    private String username;
    /**授权访问密码*/
    @Value("${spring.security.user.password}")
    private String password;

    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        /**spring security basic认证授权*/
        String auth = username.concat(":").concat(password);
        String encodedAuth = new sun.misc.BASE64Encoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic " +encodedAuth;
        //headers中增加授权信息
        ServerHttpRequest serverHttpRequest = exchange.getRequest().mutate().header("Authorization", authHeader).build();
        ServerWebExchange build = exchange.mutate().request(serverHttpRequest).build();
        return chain.filter(build);
    }

    /**
     * 优先级
     * 数字越大优先级越低
     * @return
     */
    public int getOrder() {
        return -1;
    }
}

