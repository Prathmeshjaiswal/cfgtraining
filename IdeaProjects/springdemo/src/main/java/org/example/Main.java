package org.example;

import org.example.model.Setterbased;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
//        Ticket obj = (Ticket) context.getBean("ticket");
//        obj.display();

//        Message m = (Message) context.getBean("msg");
//        System.out.println(m.getMessage());

        Setterbased s = (Setterbased) context.getBean("student");
        System.out.println(s.getCoursename());
        System.out.println(s.getName());
        System.out.println(s.getStdid());
    }
}

