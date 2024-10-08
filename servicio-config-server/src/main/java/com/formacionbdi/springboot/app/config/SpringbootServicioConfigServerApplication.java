package com.formacionbdi.springboot.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringbootServicioConfigServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioConfigServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("**************************************");
		System.out.println("CONFIG V-241008 17:34");
	}

}
