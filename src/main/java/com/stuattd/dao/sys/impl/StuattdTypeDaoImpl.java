package com.stuattd.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.stuattd.dao.sys.StuattdTypeDao;
import com.stuattd.model.sys.StuattdType;

import core.dao.BaseDao;

/**
 * @开发商:jit.gwm
 */
@Repository
public class StuattdTypeDaoImpl extends BaseDao<StuattdType> implements StuattdTypeDao {

	public StuattdTypeDaoImpl() {
		super(StuattdType.class);
	}

}
