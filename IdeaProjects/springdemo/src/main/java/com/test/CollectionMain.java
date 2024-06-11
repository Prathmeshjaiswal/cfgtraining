package com.test;

import com.test.collection.ProductBean;
import org.springframework.context.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionBean.xml");
        ProductBean prod = (ProductBean) context.getBean("ProductBean");
        System.out.println(prod);
}

}

