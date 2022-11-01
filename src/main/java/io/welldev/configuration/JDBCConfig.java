package io.welldev.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("io.welldev.configuration.beans")
public class JDBCConfig {

    @Bean("dataSource")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource dmd = new DriverManagerDataSource();
        dmd.setDriverClassName("org.postgresql.Driver");
        dmd.setUrl("jdbc:postgresql://localhost:5432/myfirstdb");
        dmd.setUsername("rawnakyazdani");
//        dmd.setPassword("****"); //here you set the password of your user

        return dmd;
    }

}
