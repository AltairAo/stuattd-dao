package jit.gwm.stuattd.dao.apply.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import core.dao.BaseDao;
import jit.gwm.stuattd.dao.apply.TjzgjbxxDao;
import jit.gwm.stuattd.model.Tjzgjbxx;;


@Repository
public class TjzgjbxxDaoImpl extends BaseDao<Tjzgjbxx> implements TjzgjbxxDao {

	public TjzgjbxxDaoImpl() {
		super(Tjzgjbxx.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Tjzgjbxx> getApproveTeachers(Long xsjbxxId) {
		// MySQL
		SQLQuery query = getSession().createSQLQuery(
				"select a.* from Tjzgjbxx a, Sxsjbxx b, Sbjjbxx c  " +
			    "  where b.xh = ? and b.bjjbxxId = c.bh " +
				" and (c.jzgjbxxIdBzr = a.gh or c.jzgjbxxIdFdy = a.gh ) " );
		// Oracle
		// SQLQuery query = getSession().createSQLQuery("select distinct a.* from authority a,role_authority ra where to_char(a.id) = ra.authority_id and a.parent_id is null and ra.role = ?");
		// SQL Server
		// SQLQuery query = getSession().createSQLQuery("select distinct a.* from authority a,role_authority ra where convert(char(8),a.id) = ra.authority_id and a.parent_id is null and ra.role = ?");
		query.setParameter(0, xsjbxxId);
		query.addEntity(Tjzgjbxx.class);
		return query.list();
	}
}
