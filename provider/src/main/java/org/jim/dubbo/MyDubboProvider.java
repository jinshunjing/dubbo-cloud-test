package org.jim.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyDubboProvider {
    public static void main(String[] args) {
        SpringApplication.run(MyDubboProvider.class, args);
    }
}
