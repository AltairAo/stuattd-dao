package jit.gwm.stuattd.dao.approve.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import core.dao.BaseDao;
import jit.gwm.stuattd.dao.approve.ApproveSearchDao;
import jit.gwm.stuattd.model.Aqjxx;
import jit.gwm.stuattd.model.Sxsjbxx;
@Repository
public class ApproveSearchDaoImpl extends BaseDao<Aqjxx> implements
		ApproveSearchDao {

	public ApproveSearchDaoImpl() {
		super(Aqjxx.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aqjxx> getTotalFromCgx() {
		SQLQuery query = getSession().createSQLQuery(
				"select a.* from aqjxx a where a.sfpj=1 or a.sfpj=2");
		query.addEntity(Aqjxx.class);
		return query.list();
	}

	@Override
	public List<Aqjxx> getInfoByClass(int classId) {
		SQLQuery query = getSession()
				.createSQLQuery(
						"select a.* from aqjxx a where a.xsjbxxId in (select b.xh from sxsjbxx b where b.bjjbxxId=?) and (a.sfpj=1 or a.sfpj=2)");
		query.setParameter(0, classId);
		query.addEntity(Aqjxx.class);
		return query.list();
	}

	@Override
	public List<Aqjxx> getInfoByCondition(int classId, String stuName) {
		SQLQuery query = getSession()
				.createSQLQuery(
						"select a.* from aqjxx a where a.xsjbxxId in "
								+ "(select b.xh from sxsjbxx b where b.bjjbxxId=?)"
								+ "and (a.xsjbxxId in (select b.xh from sxsjbxx b where b.xm like ?))"
								+ "and (a.sfpj=1 or a.sfpj=2)");
		String VstuName = stuName + "%";
		query.setParameter(0, classId);
		query.setParameter(1, VstuName);
		query.addEntity(Aqjxx.class);
		return query.list();
	}

	@Override
	public List<Sxsjbxx> getStuName(Long xsjbxxId) {
		SQLQuery query = getSession().createSQLQuery(
				"select a.* from sxsjbxx a where xh=? ");
		query.setParameter(0, xsjbxxId);
		query.addEntity(Sxsjbxx.class);
		return query.list();

	}

}
