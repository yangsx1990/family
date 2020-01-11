package com.family.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;


import javax.sql.DataSource;
import java.util.Properties;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/12/31 上午11:05
 * @modified By:
 */
@Configuration
public class MybatisConfig implements EnvironmentAware {
/*    @Value("${a}")
    private String a;

    @Value("${mybatis.typeAliasesPackage}")
    private String typeAliasesPackage;


    @Value("${mybatis.mapperLocations}")
    private String mapperLocations;*/

    private RelaxedPropertyResolver propertyResolver;


    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "mybatis.");
    }


    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        // SET dataSource
        sessionFactory.setDataSource(dataSource);

        /** 设置Mybatis 实体类别名扫描包路径 */
        sessionFactory.setTypeAliasesPackage(propertyResolver.getProperty("typeAliasesPackage"));

        Resource[] mapperLocation = new PathMatchingResourcePatternResolver().getResources(propertyResolver.getProperty("mapperLocations"));
        sessionFactory.setMapperLocations(mapperLocation);
        //sessionFactory.setPlugins(new Interceptor[]{pageHelper});

        return sessionFactory;
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
}
