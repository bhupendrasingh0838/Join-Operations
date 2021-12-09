package com.joins.Joins.Operations.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int s_id;
    private String name;
    private String fName;
    private String address;
    private String state;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "std_id")
    private List<College> colleges;

    public Student() {
    }

    public Student(int s_id, String name, String fName, String address, String state, List<College> colleges) {
        this.s_id = s_id;
        this.name = name;
        this.fName = fName;
        this.address = address;
        this.state = state;
        this.colleges = colleges;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<College> getColleges() {
        return colleges;
    }

    public void setColleges(List<College> colleges) {
        this.colleges = colleges;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", name='" + name + '\'' +
                ", fName='" + fName + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", colleges=" + colleges +
                '}';
    }
}
