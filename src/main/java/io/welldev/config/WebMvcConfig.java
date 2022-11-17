package io.welldev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan({"io.welldev"})
public class WebMvcConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean("dataSource")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource dmd = new DriverManagerDataSource();
        dmd.setDriverClassName("org.postgresql.Driver");
        dmd.setUrl("jdbc:postgresql://localhost:5432/myfirstdb");
        dmd.setUsername("rawnakyazdani");
        dmd.setPassword("2222"); //here you set the password of your user

        return dmd;
    }
}
