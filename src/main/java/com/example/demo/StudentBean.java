package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class StudentBean {
    private int roll;
    private String sname;
    private String mob;
    private static int x;

    @Autowired
    private Subject subject;

    public StudentBean() {
        super();
        System.out.println("Object "+(++x));
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public void disp() {
        System.out.println("Student is  " + subject.getSubjectName());
    }
}