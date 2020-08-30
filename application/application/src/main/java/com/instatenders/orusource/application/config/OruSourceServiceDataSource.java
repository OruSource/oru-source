package com.instatenders.orusource.application.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.instatenders.orusource.domain.service.repositories",
        entityManagerFactoryRef = "serviceEntityManagerFactory",
        transactionManagerRef = "serviceTransactionManager"
)
public class OruSourceServiceDataSource {
    @Autowired
    private Environment env;

    @Bean
    @ConfigurationProperties(prefix="spring.datasource.service")
    public DataSourceProperties serviceDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource serviceDataSource() {
        DataSourceProperties dataSourceProperties = serviceDataSourceProperties();
        return DataSourceBuilder.create()
                .driverClassName(dataSourceProperties.getDriverClassName())
                .url(dataSourceProperties.getUrl())
                .username(dataSourceProperties.getUsername())
                .password(dataSourceProperties.getPassword())
                .build();
    }

    @Bean
    public PlatformTransactionManager serviceTransactionManager()
    {
        EntityManagerFactory factory = serviceEntityManagerFactory().getObject();
        return new JpaTransactionManager(factory);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean serviceEntityManagerFactory()
    {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(serviceDataSource());
        factory.setPackagesToScan(new String[]{"com.instatenders.orusource.domain.service.entities"});
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
        jpaProperties.put("hibernate.show-sql", env.getProperty("spring.jpa.show-sql"));
        jpaProperties.put("hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
        factory.setJpaProperties(jpaProperties);

        return factory;
    }
}
