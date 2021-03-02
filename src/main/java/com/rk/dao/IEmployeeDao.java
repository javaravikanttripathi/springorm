package com.rk.dao;

import java.util.List;

import com.rk.model.Address;
import com.rk.model.Employee;

public interface IEmployeeDao {
	public void saveEmpObject(Employee emp);

	public void updateObject(Employee emp);

	public void deleteObject(Integer id);

	public Employee getOneObject(Integer id);

	public List<Employee> getAllObj();

	public void saveEmpObjectInManytoOne(Employee e);

	public void saveAddrObjectManyToOne(Address ad);

}
