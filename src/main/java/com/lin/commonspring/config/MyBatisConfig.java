package com.lin.commonspring.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.HashSet;

//@Configuration
//@MapperScan(basePackages = {"com.lin.commonspring.dao"}, annotationClass = PrimaryRespority.class,
//        sqlSessionTemplateRef = "sqlSessionTemplate")
//选择自己想要的primaryRepository
public class MyBatisConfig {

    @Value("${datasource.jdbcUrl}")
    private String jdbcUrl;

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.maximumPoolSize}")
    private Integer maximumPoolSize;

    @Bean(name = "primaryDatasource")
    @Primary
    public DataSource dataSource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl(jdbcUrl);
        hikariDataSource.setPassword(password);
        hikariDataSource.setUsername(username);
        hikariDataSource.setMaximumPoolSize(maximumPoolSize);
        hikariDataSource.setMinimumIdle(5);
        hikariDataSource.setConnectionTimeout(30000);
        hikariDataSource.setMaxLifetime(20000);
        hikariDataSource.setIdleTimeout(10000);
        hikariDataSource.setLeakDetectionThreshold(10000);
        return hikariDataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("primaryDatasource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setAggressiveLazyLoading(false);
        configuration.setLazyLoadingEnabled(true);
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setLazyLoadTriggerMethods(new HashSet<>());
        bean.setConfiguration(configuration);
        return bean.getObject();
    }

    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("primaryDatasource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
