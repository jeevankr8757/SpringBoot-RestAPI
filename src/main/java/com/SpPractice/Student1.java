package com.SpPractice;

import org.springframework.stereotype.Component;

@Component
public class Student1 {
    private String name;
    public Student1(String name, String mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	private String mark;

    // Constructor to initialize name and mark
    public Student1() {
        this.name = name;
        this.mark = mark;
    }

    // Getters and Setters (optional)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    // You can add any methods for business logic here if needed
}
