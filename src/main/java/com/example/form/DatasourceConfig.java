package com.example.form;



import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfig {
	/*
	@Bean
    public DataSource datasource() {
        return (DataSource) DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/myDb")
                .username("root")
                .password("pass")
                .build();
    }*/
}
