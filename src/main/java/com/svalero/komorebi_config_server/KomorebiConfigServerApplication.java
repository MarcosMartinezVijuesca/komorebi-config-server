package com.svalero.komorebi_config_server;
import org.springframework.cloud.config.server.EnableConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConfigServer
@SpringBootApplication
public class KomorebiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KomorebiConfigServerApplication.class, args);
	}

}
