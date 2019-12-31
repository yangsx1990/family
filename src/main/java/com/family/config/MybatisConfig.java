package com.family.config;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:58 2017/11/10
 */
//@Configuration
//@ConditionalOnClass({ EnableTransactionManagement.class })
//@AutoConfigureAfter({ DataSourceConfig.class })
public class MybatisConfig{//} implements EnvironmentAware {



 /*   @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
*//*
    //@Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        // SET dataSource
        sessionFactory.setDataSource(dataSource);

        *//** 设置Mybatis 实体类别名扫描包路径 *//*
        sessionFactory.setTypeAliasesPackage(propertyResolver.getProperty("typeAliasesPackage"));

        Resource[] mapperLocation = new PathMatchingResourcePatternResolver().getResources(propertyResolver.getProperty("mapperLocations"));
        sessionFactory.setMapperLocations(mapperLocation);
        //sessionFactory.setPlugins(new Interceptor[]{pageHelper});

        return sessionFactory;
    }

    // Spring 事务
    @Bean(name = "txManager")
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
        txManager.setDataSource(dataSource);
        return txManager;
    }


    @Bean(name = "mapperScannerConfigurer")
    public MapperScannerConfigurer MapperScannerConfigurer1() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.family.mapper");
        Properties properties = new Properties();
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");
        properties.setProperty("mappers", Mapper.class.getName());
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }

    private RelaxedPropertyResolver propertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver=new RelaxedPropertyResolver(environment,"mybatis.");
    }*/
}
