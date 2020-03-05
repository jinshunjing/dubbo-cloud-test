package org.jim.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyDubboConsumer {
    public static void main(String[] args) {
        SpringApplication.run(MyDubboConsumer.class, args);
    }
}
