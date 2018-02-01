package com.cloud.serviceturbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine // 开启turbine
@SpringBootApplication
public class ServiceTurbineApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceTurbineApplication.class).web(true).run(args);
	}
}
