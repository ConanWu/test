package com.lin.test.framework.config;

import com.lin.test.framework.services.Service1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan会自动扫描对应的包下面的带有@Component/@Service的类 自动注入到Sprint的IoC容器中 这样就省去了一个一个的装配Bean
@ComponentScan("com.lin.test.framework.*")
public class TestMainConfiguration {

//    public

}
