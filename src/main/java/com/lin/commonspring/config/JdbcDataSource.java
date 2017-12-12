package com.lin.commonspring.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbcDataSource {

    @Value("${datasource.jdbcUrl}")
    private String jdbcUrl;

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.maximumPoolSize}")
    private Integer maximumPoolSize;

    @Bean
    public DataSource dataSource() {
        HikariDataSource datasource = new HikariDataSource();
        datasource.setJdbcUrl(jdbcUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setMaximumPoolSize(maximumPoolSize);
        datasource.setMaxLifetime(1800000);
        datasource.setIdleTimeout(600000);
        datasource.setConnectionTimeout(30000);
        datasource.setLeakDetectionThreshold(60000);
        return datasource;
    }

}
