package com.manash.beans;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.manash.beans")
public class AppConfig {
	static {
		System.out.println("AppConfig:static block");
	}
	public AppConfig() {
	System.out.println("AppConfig:0-param constructor");
	}
	@Bean
	public Date createDate() {
		System.out.println("AppConfig.createDate()");
		return new Date();
	}
}
