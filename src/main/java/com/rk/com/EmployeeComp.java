package com.rk.com;

import java.util.List;

import javax.print.attribute.standard.Severity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rk.model.Address;
import com.rk.model.Employee;
import com.rk.service.IEmployeeService;

@Component
public class EmployeeComp {
	@Autowired
	private IEmployeeService service;

	/*
	 * public void SaveObj() { Employee e1 = new Employee(); e1.setEmpId(101);
	 * e1.setEmpName("Prsoona"); e1.setEmpSal(30.0); service.saveEmpObject(e1);
	 * Employee e2 = new Employee(); e2.setEmpId(102); e2.setEmpName("Ravi");
	 * e2.setEmpSal(40.0); service.saveEmpObject(e2); Employee e3 = new Employee();
	 * e3.setEmpId(103); e3.setEmpName("Pankaj"); e3.setEmpSal(40.0);
	 * service.saveEmpObject(e3); System.out.println("Object Is Save"); }
	 * 
	 * public void updateEmp() { Employee e = new Employee(); e.setEmpId(102);
	 * e.setEmpName("Ravikant"); e.setEmpSal(50.0); service.updateEmpObject(e);
	 * System.out.println("Object is Updated"); }
	 * 
	 * public void deletObject(Integer id) { service.deleteObject(id);
	 * System.out.println("Object is Deleted"); }
	 * 
	 * public void getOneObject(Integer id) { Employee e = service.getOneEmp(id);
	 * System.out.println(e); }
	 * 
	 * public void listOfEmp() { List<Employee> emp = service.getAllObj();
	 * emp.forEach(e -> System.out.println(e)); }
	 */
	public void ManyToOne() {
		Address a1 = new Address();
		a1.setAddrId(101);
		a1.setAddrLoc("Mysore");
		a1.setAddrPin("1245");

		Address a2 = new Address();
		a2.setAddrId(102);
		a2.setAddrLoc("Md");
		a2.setAddrPin("6548");

		Address a3 = new Address();
		a3.setAddrId(103);
		a3.setAddrLoc("Up");
		a3.setAddrPin("6589");

		Employee e1 = new Employee();
		e1.setEmpId(201);
		e1.setEmpName("Ravi");
		e1.setEmpAddr(a1);
		Employee e2 = new Employee();
		e2.setEmpId(202);
		e2.setEmpName("Amit");
		e2.setEmpAddr(a2);
		Employee e3 = new Employee();
		e3.setEmpId(203);
		e3.setEmpName("Pankaj");
		e3.setEmpAddr(a1);
		service.saveManyToOneAddr(a1);
		service.saveManyToOneAddr(a2);
		service.saveManyToOneAddr(a3);
		service.saveManyToOne(e1);
		service.saveManyToOne(e2);
		service.saveManyToOne(e3);

	}

}
