package com.rk.service;

import java.util.List;

import com.rk.model.Address;
import com.rk.model.Course;
import com.rk.model.Employee;
import com.rk.model.Module;
import com.rk.model.Product;
import com.rk.model.Students;

public interface IEmployeeService {
	public void saveEmpObject(Employee emp);

	public void updateEmpObject(Employee emp);

	public void deleteObject(Integer id);

	public Employee getOneEmp(Integer id);

	public List<Employee> getAllObj();

	public void saveManyToOne(Employee e);

	public void saveManyToOneAddr(Address ad);

	public void saveModuleOneToMany(Module m);

	public void saveProdOneToMany(Product p);

	public void saveStudendsManyToMany(Students s);

	public void saveCourseAsManyToMany(Course c);

}
