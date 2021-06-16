package ru.ibs.internship.spring.appCont.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public SomeComponentConfig someComponentConfig(){
        return new SomeComponentImplConfig();
    }
}
