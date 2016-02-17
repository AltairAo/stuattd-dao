package com.stuattd.dao.sys.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.stuattd.dao.sys.StuattdDao;
import com.stuattd.model.sys.Stuattd;

import core.dao.BaseDao;

/**
 * @开发商:jit.gwm
 */
@Repository
public class StuattdDaoImpl extends BaseDao<Stuattd> implements StuattdDao {

	public StuattdDaoImpl() {
		super(Stuattd.class);
	}

	@Override
	public List<Object[]> queryExportedStuattd(Long[] ids) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ids.length; i++) {
			sb.append(ids[i] + ",");
		}
		Query query = getSession().createSQLQuery(
				"select f.epc_id,f.name fn,f.plant_time,f.entry_time,ft.name ftn from stuattd_type ft,stuattd f where ft.id = f.type_id and f.id in (" + sb.deleteCharAt(sb.toString().length() - 1).toString() + ")");
		return query.list();
	}

}
