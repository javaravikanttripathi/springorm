package com.rk.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.rk.dao.IEmployeeDao;
import com.rk.model.Address;
import com.rk.model.Course;
import com.rk.model.Employee;
import com.rk.model.Module;
import com.rk.model.Product;
import com.rk.model.Students;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public void saveEmpObject(Employee emp) {
		ht.save(emp);
	}

	@Override
	public void updateObject(Employee emp) {
		ht.update(emp);

	}

	@Override
	public void deleteObject(Integer id) {
		Employee e = new Employee();
		e.setEmpId(id);
		ht.delete(e);
	}

	@Override
	public Employee getOneObject(Integer id) {
		Employee e = ht.get(Employee.class, id);
		return e;
	}

	@Override
	public List<Employee> getAllObj() {
		List<Employee> list = ht.loadAll(Employee.class);
		return list;
	}

	@Override
	public void saveEmpObjectInManytoOne(Employee e) {
		ht.save(e);

	}

	@Override
	public void saveAddrObjectManyToOne(Address ad) {
		ht.save(ad);
	}

	@Override
	public void saveModObjectOneToMany(Module mod) {
		ht.save(mod);
	}

	@Override
	public void saveProdObjOntToMany(Product p) {
		ht.save(p);
	}

	@Override
	public void saveStudentAsManyToManyOp(Students std) {
		ht.save(std);

	}

	@Override
	public void saveCourseAsManyToManyOp(Course srs) {
		ht.save(srs);
	}

}
