package com.xnt.dhq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan({"com.xnt.dhq.mapper","com.xnt.dhq.dao"})
public class DhqDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DhqDbApplication.class, args);
    }

}
