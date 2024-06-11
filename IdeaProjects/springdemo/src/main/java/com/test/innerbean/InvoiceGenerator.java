package com.test.innerbean;

public class InvoiceGenerator {
    private Product prod_order;

    public InvoiceGenerator(Product prod_order){
        this.prod_order = prod_order;
    }

//    public void setProd_order(Product prod_order) {
//        this.prod_order = prod_order;
//    }

    public void generateInvoice(){
       System.out.println("Getting Orders details...: "+prod_order.getAddress());
 }

}


