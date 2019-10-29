package com.madhu.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages  = { "com.madhu" })
public class InventoryManagementSystemApplication {

	public static void main(String[] args) {
		System.out.println("Madhu Neeraj");
		SpringApplication.run(InventoryManagementSystemApplication.class, args);
	}

}
