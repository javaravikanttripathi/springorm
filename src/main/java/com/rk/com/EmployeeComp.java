package com.rk.com;

import java.util.List;

import javax.print.attribute.standard.Severity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rk.model.Address;
import com.rk.model.Course;
import com.rk.model.Employee;
import com.rk.model.Module;
import com.rk.model.Product;
import com.rk.model.Students;
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
	/*
	 * public void ManyToOne() { Address a1 = new Address(); a1.setAddrId(101);
	 * a1.setAddrLoc("Mysore"); a1.setAddrPin("1245");
	 * 
	 * Address a2 = new Address(); a2.setAddrId(102); a2.setAddrLoc("Md");
	 * a2.setAddrPin("6548");
	 * 
	 * Address a3 = new Address(); a3.setAddrId(103); a3.setAddrLoc("Up");
	 * a3.setAddrPin("6589");
	 * 
	 * Employee e1 = new Employee(); e1.setEmpId(201); e1.setEmpName("Ravi");
	 * e1.setEmpAddr(a1); Employee e2 = new Employee(); e2.setEmpId(202);
	 * e2.setEmpName("Amit"); e2.setEmpAddr(a2); Employee e3 = new Employee();
	 * e3.setEmpId(203); e3.setEmpName("Pankaj"); e3.setEmpAddr(a1);
	 * service.saveManyToOneAddr(a1); service.saveManyToOneAddr(a2);
	 * service.saveManyToOneAddr(a3); service.saveManyToOne(e1);
	 * service.saveManyToOne(e2); service.saveManyToOne(e3);
	 */
	/*
	 * public void oneToManyOper() { Module m1 = new Module(); m1.setModId(101);
	 * m1.setModName("M1"); m1.setModType("U");
	 * 
	 * Module m2 = new Module(); m2.setModId(102); m2.setModName("M2");
	 * m2.setModType("E");
	 * 
	 * Module m3 = new Module(); m3.setModId(103); m3.setModName("M3");
	 * m3.setModType("A");
	 * 
	 * Product p = new Product(); p.setProdId(101); p.setProdName("Hp");
	 * p.setProdCost(20000.0); p.getProdMod().add(m1); p.getProdMod().add(m2);
	 * service.saveModuleOneToMany(m1); service.saveModuleOneToMany(m2); //
	 * service.saveModuleOneToMany(m3); service.saveProdOneToMany(p);
	 * 
	 * }
	 */
	public void manyToManyOp() {
		Course c1 = new Course();
		c1.setCrsId(201);
		c1.setCrsName("Core java");
		c1.setCrsCost(100.0);

		Course c2 = new Course();
		c2.setCrsId(202);
		c2.setCrsName(" Adv Core java");
		c2.setCrsCost(200.0);

		Course c3 = new Course();
		c3.setCrsId(203);
		c3.setCrsName("Oracle");
		c3.setCrsCost(50.0);

		Students s1 = new Students();
		s1.setStdId(101);
		s1.setStdName("Pankaj");
		s1.setStdMarks(7.5);
		s1.getStdCrsObj().add(c1);
		s1.getStdCrsObj().add(c2);

		Students s2 = new Students();
		s2.setStdId(102);
		s2.setStdName("Padma");
		s2.setStdMarks(8.98);
		s2.getStdCrsObj().add(c3);

		Students s3 = new Students();
		s3.setStdId(103);
		s3.setStdName("Raj");
		s3.setStdMarks(6.0);
		s3.getStdCrsObj().add(c1);
		s3.getStdCrsObj().add(c2);
		s3.getStdCrsObj().add(c3);
		service.saveCourseAsManyToMany(c1);
		service.saveCourseAsManyToMany(c2);
		service.saveCourseAsManyToMany(c3);
		service.saveStudendsManyToMany(s1);
		service.saveStudendsManyToMany(s2);
		service.saveStudendsManyToMany(s3);
	}

}
