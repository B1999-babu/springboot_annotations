package com.annotations.Controller;

import com.annotations.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @Autowired
    @Qualifier("Student1")
    private Student student;

    @RequestMapping("/hello" )
    @ResponseBody
    public Student hello(){
        
        System.out.println("this is hello method");
        this.student.setName("Baburao kadappa doog");
        return this.student;

    }
}
