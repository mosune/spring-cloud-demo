package com.cloud.eurekaservercluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // 开启注册中心服务
@SpringBootApplication
public class EurekaServerClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerClusterApplication.class, args);
	}
}
