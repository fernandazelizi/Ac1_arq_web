package me.ac1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@SpringBootApplication
public class Ac1CertaApplication {

		public static void main(String[] args)
		{

			SpringApplication.run(Ac1CertaApplication.class, args);

//			@Configuration
//			public class DataSourceConfig {
//				@Bean
//				public DataSource getDataSource() {
//					return DataSourceBuilder.create()
//							.driverClassName("com.mysql.cj.jdbc.Driver")
//							.url("jdbc:mysql://localhost:3306/dBName")
//							.username("user")
//							.password("password")
//							.build();
//				}
			}

		}




