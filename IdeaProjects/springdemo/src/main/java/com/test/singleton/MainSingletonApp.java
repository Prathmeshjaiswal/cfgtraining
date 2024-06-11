package com.test.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSingletonApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SingletonBeanConfig.class);
        SampleBean sb = (SampleBean) context.getBean(SampleBean.class);
    }
}
