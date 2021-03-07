package com.rk.test;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rk.com.EmployeeComp;
import com.rk.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeComp emp = ac.getBean("employeeComp", EmployeeComp.class);
		// emp.SaveObj();
		// emp.updateEmp();
		// emp.deletObject(102);
		// emp.getOneObject(103);
		// emp.listOfEmp();
		// emp.ManyToOne();
		// emp.oneToManyOper();
		emp.manyToManyOp();
	}

}
