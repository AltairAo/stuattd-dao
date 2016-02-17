package jit.gwm.stuattd.dao.apply.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import core.dao.BaseDao;
import jit.gwm.stuattd.dao.apply.AqjxxDao;
import jit.gwm.stuattd.model.Aqjxx;

@Repository
public class AqjxxDaoImpl extends BaseDao<Aqjxx> implements AqjxxDao {

	public AqjxxDaoImpl() {
		super(Aqjxx.class);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean doUpdate(Aqjxx aqjxx) {
		try {
			SQLQuery query = getSession().createSQLQuery(
					"update aqjxx a set a.jzgjbxxId=?,a.qjly=?,a.kssj=?,a.jssj=?,a.qjzt=? where a.id=?");
			query.setParameter(0, aqjxx.getJzgjbxxId());
			query.setParameter(1, aqjxx.getQjly());
			query.setParameter(2, aqjxx.getKssj());
			query.setParameter(3, aqjxx.getJssj());
			query.setParameter(4, aqjxx.getQjzt());
			query.setParameter(5, aqjxx.getId());
			query.addEntity(Aqjxx.class);
			query.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	@Override
	public boolean doSave(Aqjxx aqjxx) {
		try {
			SQLQuery query = getSession().createSQLQuery(
					"insert into aqjxx(xsjbxxId,jzgjbxxId,qjly,kssj,jssj,qjzt) values(?,?,?,?,?,?)");
			query.setParameter(0, aqjxx.getXsjbxxId());
			query.setParameter(1, aqjxx.getJzgjbxxId());
			query.setParameter(2, aqjxx.getQjly());
			query.setParameter(3, aqjxx.getKssj());
			query.setParameter(4, aqjxx.getJssj());
			query.setParameter(5, aqjxx.getQjzt());
			query.addEntity(Aqjxx.class);
			query.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	
}
