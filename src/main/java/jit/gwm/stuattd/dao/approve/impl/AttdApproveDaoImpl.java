package jit.gwm.stuattd.dao.approve.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import core.dao.BaseDao;
import jit.gwm.stuattd.dao.approve.AttdApproveDao;
import jit.gwm.stuattd.model.Aqjxx;
import jit.gwm.stuattd.model.Sxsjbxx;

@Repository
public class AttdApproveDaoImpl extends BaseDao<Aqjxx> implements
		AttdApproveDao {

	public AttdApproveDaoImpl() {
		super(Aqjxx.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aqjxx> getTotalFromCgx() {
		SQLQuery query = getSession().createSQLQuery(
				"select a.* from aqjxx a where a.qjzt=1");
		query.addEntity(Aqjxx.class);
		return query.list();
	}

	@Override
	public List<Sxsjbxx> getStuName(Long xh) {
		SQLQuery query = getSession().createSQLQuery(
				"select a.* from sxsjbxx a where xh=? ");
		query.setParameter(0, xh);
		query.addEntity(Sxsjbxx.class);
		return query.list();

	}

	@Override
	public List<Aqjxx> getInfoByClass(int classId) {
		SQLQuery query = getSession()
				.createSQLQuery(
						"select a.* from aqjxx a where a.xsjbxxId in (select b.xh from sxsjbxx b where b.bjjbxxId=?) and a.qjzt=1 ");
		query.setParameter(0, classId);
		query.addEntity(Aqjxx.class);
		return query.list();

	}

	@Override
	public List<Aqjxx> getInfoByCondition(int classId, String stuName) {
		SQLQuery query = getSession()
				.createSQLQuery(
						"select a.* from aqjxx a where a.xsjbxxId in "
								+ "(select b.xh from sxsjbxx b where b.bjjbxxId=?) and (a.qjzt=1) "
								+ "and (a.xsjbxxId in (select b.xh from sxsjbxx b where b.xm like ?))");
		String VstuName = stuName + "%";
		query.setParameter(0, classId);
		query.setParameter(1, VstuName);
		query.addEntity(Aqjxx.class);
		return query.list();

	}

	@Override
	public boolean Withdraw(int id) {
		try {
			SQLQuery query = getSession().createSQLQuery(
					"update aqjxx a set a.qjzt=3 where a.id=?");
			query.setParameter(0, id);
			query.executeUpdate();
			query.addEntity(Aqjxx.class);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public boolean Negative(int id,String bpyy) {
		try {
			SQLQuery query = getSession().createSQLQuery(
					//sjpj=2:否决该请假单
					"update aqjxx a set a.qjzt=2,a.sfpj=2,a.bpyy=? where a.id=?");
			query.setParameter(0, bpyy);
			query.setParameter(1, id);
			query.executeUpdate();
			query.addEntity(Aqjxx.class);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public boolean Pass(int id) {
		try {
			SQLQuery query = getSession().createSQLQuery(
					//sjpj=1:批准该请假单
					"update aqjxx a set a.qjzt=2,a.sfpj=1 where a.id=?");
			query.setParameter(0, id);
			query.executeUpdate();
			query.addEntity(Aqjxx.class);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
