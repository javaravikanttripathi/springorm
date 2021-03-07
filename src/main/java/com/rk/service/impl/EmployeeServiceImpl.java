package com.rk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rk.dao.IEmployeeDao;
import com.rk.model.Address;
import com.rk.model.Course;
import com.rk.model.Employee;
import com.rk.model.Module;
import com.rk.model.Product;
import com.rk.model.Students;
import com.rk.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeDao dao;

	@Override
	@Transactional
	public void saveEmpObject(Employee emp) {
		dao.saveEmpObject(emp);
	}

	@Override
	@Transactional
	public void updateEmpObject(Employee emp) {
		dao.updateObject(emp);

	}

	@Override
	@Transactional
	public void deleteObject(Integer id) {
		dao.deleteObject(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Employee getOneEmp(Integer id) {
		Employee e = dao.getOneObject(id);
		return e;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getAllObj() {
		List<Employee> list = dao.getAllObj();
		return list;
	}

	@Override
	@Transactional
	public void saveManyToOne(Employee e) {
		dao.saveEmpObjectInManytoOne(e);
	}

	@Override
	@Transactional
	public void saveManyToOneAddr(Address ad) {
		dao.saveAddrObjectManyToOne(ad);
	}

	@Override
	@Transactional
	public void saveModuleOneToMany(Module m) {
		dao.saveModObjectOneToMany(m);
	}

	@Override
	@Transactional
	public void saveProdOneToMany(Product p) {
		dao.saveProdObjOntToMany(p);
	}

	@Override
	@Transactional
	public void saveStudendsManyToMany(Students s) {
		dao.saveStudentAsManyToManyOp(s);
	}

	@Override
	@Transactional()
	public void saveCourseAsManyToMany(Course c) {
		dao.saveCourseAsManyToManyOp(c);
	}

}
