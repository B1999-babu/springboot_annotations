package com.annotations;


import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"mypackage"})
public class configuration {

    @Bean("Student1")
    @Lazy
    public Student getstudent() {
        System.out.println("Creating first Student Object");
        return new Student("Student1");
    }

    @Bean("Student2")
    @Lazy
    public Student createstudent(){
        System.out.println("Creating second student object");
        return new Student("Student2");
    }


}
