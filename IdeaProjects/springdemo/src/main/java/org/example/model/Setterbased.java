package org.example.model;

public class Setterbased {
    private int stdid;
    private String name;
    private String coursename;

    public int getStdid() {
        return stdid;
    }

    public String getName() {
        return name;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
