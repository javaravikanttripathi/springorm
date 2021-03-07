package com.rk.dao;

import java.util.List;

import com.rk.model.Address;
import com.rk.model.Course;
import com.rk.model.Employee;
import com.rk.model.Module;
import com.rk.model.Product;
import com.rk.model.Students;

public interface IEmployeeDao {
	public void saveEmpObject(Employee emp);

	public void updateObject(Employee emp);

	public void deleteObject(Integer id);

	public Employee getOneObject(Integer id);

	public List<Employee> getAllObj();

	public void saveEmpObjectInManytoOne(Employee e);

	public void saveAddrObjectManyToOne(Address ad);

	public void saveModObjectOneToMany(Module mod);

	public void saveProdObjOntToMany(Product p);

	public void saveStudentAsManyToManyOp(Students std);

	public void saveCourseAsManyToManyOp(Course srs);

}
