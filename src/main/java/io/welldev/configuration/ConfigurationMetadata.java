package io.welldev.configuration;

import io.welldev.configuration.beans.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("io.welldev.configuration.beans")
public class ConfigurationMetadata {
    /**
     * @Bean method name will be the bean/object name
     * @Bean can create bean/object of a class which is outside the scope of @ComponentScan
     */
    @Bean
    public Waiter waiteRRR() {
        return new Waiter();
    }
}
