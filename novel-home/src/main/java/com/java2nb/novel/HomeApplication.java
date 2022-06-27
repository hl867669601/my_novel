package com.java2nb.novel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 首页微服务启动器
 * @author xiongxiaoyang
 * @version 1.0
 * @since 2020/5/27
 */
@SpringBootApplication
@EnableFeignClients
public class HomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeApplication.class);
    }
}
