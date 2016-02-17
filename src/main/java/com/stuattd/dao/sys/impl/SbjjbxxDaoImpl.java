package com.stuattd.dao.sys.impl;

import jit.gwm.stuattd.model.Sbjjbxx;

import org.springframework.stereotype.Repository;

import com.stuattd.dao.sys.SbjjbxxDao;

import core.dao.BaseDao;


@Repository("sbjjbxxDao")
public class SbjjbxxDaoImpl extends BaseDao<Sbjjbxx> implements SbjjbxxDao {
	
	public SbjjbxxDaoImpl() {
		super(Sbjjbxx.class);
	}

	@Override
	public void save(Sbjjbxx sbjjbxx) {
		getSession().save(sbjjbxx);
	}
}
