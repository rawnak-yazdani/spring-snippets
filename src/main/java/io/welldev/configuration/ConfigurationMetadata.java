package io.welldev.configuration;

import io.welldev.configuration.beans.Waiter;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.DataBinder;

@Configuration
@ComponentScan("io.welldev.configuration.beans")
public class ConfigurationMetadata {
    @Bean
    public Waiter waiteRRR() {
        return new Waiter();
    }

    @Bean
    public DataBinder dataBinder() {
        return new DataBinder(waiteRRR());
    }

    @Bean
    public MutablePropertyValues mutablePropertyValues() {
        return new MutablePropertyValues();
    }
}
