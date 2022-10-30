package io.welldev.configuration;

import io.welldev.configuration.beans.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("io.welldev.configuration.beans")
public class ConfigurationMetadata {
    @Bean
    public Waiter waiteRRR() {
        return new Waiter();
    }
}
