package com.gmell.springlabone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.gmell.springlabone")
public class MyConfig {
    @Bean
    public Pet petBean() {
        return new Pet();
    }

    @Bean
    @Scope("singleton")
    public Car carBean() {
        return new Car();
    }

    @Bean
    public Employee employeeBean() {
        return new Employee(petBean(), carBean());
    }
}

