package com.family.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


import javax.sql.DataSource;
/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/12/31 上午11:05
 * @modified By:
 */
@Configuration
public class MybatisConfigTest {
    @Value("${a}")
    private String a;

    @Value("${mybatis.typeAliasesPackage}")
    private String typeAliasesPackage;


    @Value("${mybatis.mapperLocations}")
    private String mapperLocations;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        // SET dataSource
        sessionFactory.setDataSource(dataSource);

        /** 设置Mybatis 实体类别名扫描包路径 */
        sessionFactory.setTypeAliasesPackage(typeAliasesPackage);

        Resource[] mapperLocation = new PathMatchingResourcePatternResolver().getResources(mapperLocations);
        sessionFactory.setMapperLocations(mapperLocation);
        //sessionFactory.setPlugins(new Interceptor[]{pageHelper});

        return sessionFactory;
    }
}
