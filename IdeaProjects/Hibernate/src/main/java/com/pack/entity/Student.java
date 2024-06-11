package com.pack.entity;

public class Student {
    private int sid;
    private String stname;

    public Student(){

    }
    public Student(int sid, String stname){
        this.sid = sid;
        this.stname = stname;
    }

    public int getSid() {
        return sid;
    }

    public String getStname() {
        return stname;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }
}
