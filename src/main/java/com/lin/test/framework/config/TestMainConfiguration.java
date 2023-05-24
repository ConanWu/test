package com.lin.test.framework.config;

import com.lin.test.framework.services.Service1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestMainConfiguration {

//    public
    @Bean
    public Service1 service1() {
        Service1 a = new Service1();
        a.setA("asdfasf");
        return a;
    }
}
