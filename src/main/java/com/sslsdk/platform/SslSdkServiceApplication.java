package com.sslsdk.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class SslSdkServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslSdkServiceApplication.class, args);
	}
}
