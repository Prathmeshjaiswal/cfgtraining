package org.example.model;

public class Ticket {
    public static class Ticket {
        private int id;
        private String ticketdate;
        public Ticket(int id, String ticketdate){
            System.out.println(id+" "+ticketdate);

        }

        public Ticket(int id){
            System.out.println("Ticket id is "+id);
        }

        public Ticket(String ticketdate) {
            System.out.println("Ticket is " + ticketdate);
        }
    }
}
