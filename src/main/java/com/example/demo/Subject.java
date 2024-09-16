package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Subject {
    private String subjectName = "Software Technology";

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}