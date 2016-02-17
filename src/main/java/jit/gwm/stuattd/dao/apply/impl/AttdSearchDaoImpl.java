package jit.gwm.stuattd.dao.apply.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import core.dao.BaseDao;
import core.support.BaseParameter;
import core.support.QueryResult;
import jit.gwm.stuattd.dao.apply.AttdSearchDao;
import jit.gwm.stuattd.model.Aqjxx;

@Repository
public class AttdSearchDaoImpl extends BaseDao<Aqjxx> implements AttdSearchDao {

	public AttdSearchDaoImpl() {
		super(Aqjxx.class);
	}
	
	@Override
	public List<Aqjxx> getTotalFromCgx(Long xsjbxxId) {
	
		SQLQuery query = getSession().createSQLQuery("select a.* from aqjxx a where a.xsjbxxId=? and (a.qjzt=0 or a.qjzt=3) ");
		query.setParameter(0, xsjbxxId);
		query.addEntity(Aqjxx.class);
		return query.list();
	}
	
	@Override
	public List<Aqjxx> getInfoByCondition(Long xsjbxxId,String kssj,String jssj) {
		SQLQuery query = getSession().createSQLQuery("select a.* from aqjxx a where a.xsjbxxId=?"+
													" and kssj=? and jssj=? and (a.qjzt=0 or a.qjzt=3) ");
		query.setParameter(0, xsjbxxId);
		query.setParameter(1, kssj);
		query.setParameter(2, jssj);
		query.addEntity(Aqjxx.class);
		return query.list();
	}

}
