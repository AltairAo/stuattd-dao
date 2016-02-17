package com.stuattd.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.stuattd.dao.sys.DepartmentDao;
import com.stuattd.model.sys.Department;

import core.dao.BaseDao;

/**
 * @开发商:jit.gwm
 */
@Repository
public class DepartmentDaoImpl extends BaseDao<Department> implements DepartmentDao {

	public DepartmentDaoImpl() {
		super(Department.class);
	}

}
