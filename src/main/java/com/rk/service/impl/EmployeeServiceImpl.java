package com.rk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rk.dao.IEmployeeDao;
import com.rk.model.Address;
import com.rk.model.Employee;
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

}
