package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.DemoBean;
import com.example.demo.component.EmployeeBean;
import com.example.demo.controller.HelloRestController;

@SpringBootApplication
public class DemoApplication {
	public static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		logger.debug("Hello these is base Package");
		ApplicationContext context =   SpringApplication.run(DemoApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean = " + demoBean.toString());
		System.out.print(context.getBean(HelloRestController.class));
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Chetan");
		employeeBean.showEmployeeDetails();
	}

}
