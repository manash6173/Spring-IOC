package com.manash.config;

import javax.activation.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.manash.dao","com.manash.service","com.manash.controler"})
public class AppConfig {
    @Bean
	public DataSource createDataSource() {
		BasicDataSource bs= new BasicDataSource();
		bs.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bs.setUsername("system");
		bs.setPassword("manash");
		return (DataSource) bs;
	}
}
