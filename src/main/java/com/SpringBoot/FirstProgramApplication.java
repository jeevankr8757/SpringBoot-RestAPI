package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProgramApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext context=	SpringApplication.run(FirstProgramApplication.class, args);
//		StudentBean s=context.getBean(StudentBean.class);
//		s.disp();
//		StudentBean s1=context.getBean(StudentBean.class);
//		s.disp();
		SpringApplication.run(FirstProgramApplication.class, args);
		System.out.println("spring boot Welcome");
	}

}