package com.joins.Joins.Operations.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int c_id;
    private String collegeName;
    private String branch;
    private int year;

    public College() {
    }

    public College(int c_id, String collegeName, String branch, int year) {
        this.c_id = c_id;
        this.collegeName = collegeName;
        this.branch = branch;
        this.year = year;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "College{" +
                "c_id=" + c_id +
                ", collegeName='" + collegeName + '\'' +
                ", branch='" + branch + '\'' +
                ", year=" + year +
                '}';
    }
}
