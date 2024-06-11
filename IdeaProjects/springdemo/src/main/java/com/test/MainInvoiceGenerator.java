package com.test;

import com.test.innerbean.InvoiceGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainInvoiceGenerator {
    public static  void main(String args []){
        ApplicationContext context = new ClassPathXmlApplicationContext("Innerbean.xml");
        InvoiceGenerator invoice = (InvoiceGenerator) context.getBean("invoicebean");
        invoice.generateInvoice();
    }
}