package com.test.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@configuration
public class SingletonBeanConfig {

    @Bean
    @Scope(value = "Singleton")
    public SampleBean getBean(){
        return new SampleBean();
    }

}
