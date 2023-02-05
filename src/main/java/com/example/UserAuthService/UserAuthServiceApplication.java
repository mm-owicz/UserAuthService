package com.example.UserAuthService;
import com.netflix.discovery.shared.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = {"com.example.UserAuthService.Model"})
@EnableConfigurationProperties
public class UserAuthServiceApplication {

	private static ConfigurableApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(UserAuthServiceApplication.class, args);

	}

}
