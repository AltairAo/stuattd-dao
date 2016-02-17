package com.stuattd.dao.sys.impl;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import jit.gwm.stuattd.model.Sxsjbxx;

import com.stuattd.dao.sys.SxsjbxxDao;

import core.dao.BaseDao;
import core.support.BaseParameter;
import core.support.QueryResult;

@Repository("sxsjbxxDao")
public class SxsjbxxDaoImpl extends BaseDao<Sxsjbxx> implements SxsjbxxDao {
	
	public SxsjbxxDaoImpl() {
		super(Sxsjbxx.class);
	}

	@Override
	public void save(Sxsjbxx sxsjbxx) {
		//String hql = "";
		getSession().save(sxsjbxx);
	}
}
