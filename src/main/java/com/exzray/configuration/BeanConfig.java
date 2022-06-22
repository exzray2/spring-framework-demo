package com.exzray.configuration;

import com.exzray.model.Doctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.exzray.model")
public class BeanConfig {

    @Bean
    public Doctor doctor() {
        return new Doctor("Crazy Doctor");
    }

}
