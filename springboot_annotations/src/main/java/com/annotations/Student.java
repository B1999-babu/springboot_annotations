package com.annotations;

import org.springframework.boot.autoconfigure.SpringBootApplication;


public class Student {

     String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void student(){
        System.out.println(this.name+ "   i am studying in 10th standard");
    }
}
