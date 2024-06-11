package org.example;

import org.example.singleton.SampleBean;
import org.example.singleton.SingletonBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSingletonApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SingletonBeanConfig.class);
        context.refresh();
        SampleBean sb = context.getBean(SampleBean.class);
        System.out.println(sb.hashCode());

        SampleBean sb1 = context.getBean(SampleBean.class);
        System.out.println(sb1.hashCode());
        context.close();
    }
}
