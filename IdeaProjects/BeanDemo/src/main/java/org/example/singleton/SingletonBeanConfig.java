package org.example.singleton;

import org.example.singleton.SampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SingletonBeanConfig {

    @Bean
    @Scope(value = "prototype")
    public SampleBean getBean(){
        return new SampleBean();
    }

}
