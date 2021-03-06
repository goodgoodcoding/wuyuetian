package com.xnt.dhq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan({"com.xnt.dhq.mapper","com.xnt.dhq.dao"})
//@EnableTransactionManagement
public class  DhqAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhqAdminApplication.class, args);
	}

}
