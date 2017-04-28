package com.sample.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@EnableConfigServer 
//@EnableDiscoveryClient
//@EnableAutoConfiguration
/*@PropertySources({
	@PropertySource({"file:/opt/proserv/properties/2.0/charge-services.properties",
		"file:/opt/proserv/properties/2.0/common.properties","file:/opt/proserv/properties/2.0/dashboard.properties"})
})*/
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class);
	}
}
