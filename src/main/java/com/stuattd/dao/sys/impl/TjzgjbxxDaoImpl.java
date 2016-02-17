package com.stuattd.dao.sys.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import jit.gwm.stuattd.model.Tjzgjbxx;

import com.stuattd.dao.sys.TjzgjbxxDao;

import core.dao.BaseDao;
import core.support.BaseParameter;
import core.support.QueryResult;

@Repository("tjzgjbxxDao1")
public class TjzgjbxxDaoImpl extends BaseDao<Tjzgjbxx>implements TjzgjbxxDao {

	public TjzgjbxxDaoImpl() {
		super(Tjzgjbxx.class);
	}

	@Override
	public void save(Tjzgjbxx tjzgjbxx) {
		getSession().save(tjzgjbxx);
	}

	

}
