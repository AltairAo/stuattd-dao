package com.stuattd.dao.sys.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import jit.gwm.stuattd.model.Aqjxx;
import jit.gwm.stuattd.model.Sbjjbxx;

import com.stuattd.dao.sys.ClassManagementDao;

import org.hibernate.SQLQuery;

import core.dao.BaseDao;

/**
 * @开发商:jit.gwm
 */
@Repository
public class ClassManagementDaoImpl extends BaseDao<Sbjjbxx> implements
		ClassManagementDao {

	public ClassManagementDaoImpl() {
		super(Sbjjbxx.class);
	}

	@Override
	public List<Sbjjbxx> getClassType() {
		SQLQuery query = getSession().createSQLQuery(
				"select a.* from sbjjbxx a");
		query.addEntity(Sbjjbxx.class);
		return query.list();
	}

	@Override
	public boolean saveClass(Sbjjbxx entity) {
		try {

			getSession().save(entity);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
