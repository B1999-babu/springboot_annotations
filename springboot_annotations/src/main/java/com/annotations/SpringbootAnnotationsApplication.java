package com.annotations;

import com.annotations.mypackage.elephant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAnnotationsApplication implements CommandLineRunner {


	@Autowired
	@Qualifier("Student1")
	private Student student;

	@Autowired
	private employee emp;

	@Autowired
	private elephant elephant;

	public static void main(String[] args) {

		SpringApplication.run(SpringbootAnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       student.student();
	   this.emp.company();
	   this.elephant.eating();
	}
}
