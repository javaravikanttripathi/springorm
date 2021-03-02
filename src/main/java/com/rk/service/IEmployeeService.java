package com.rk.service;

import java.util.List;

import com.rk.model.Address;
import com.rk.model.Employee;

public interface IEmployeeService {
	public void saveEmpObject(Employee emp);

	public void updateEmpObject(Employee emp);

	public void deleteObject(Integer id);

	public Employee getOneEmp(Integer id);

	public List<Employee> getAllObj();

	public void saveManyToOne(Employee e);

	public void saveManyToOneAddr(Address ad);

}
