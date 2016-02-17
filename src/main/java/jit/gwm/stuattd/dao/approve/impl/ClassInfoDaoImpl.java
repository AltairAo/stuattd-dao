package jit.gwm.stuattd.dao.approve.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import core.dao.BaseDao;
import core.support.BaseParameter;
import core.support.QueryResult;
import jit.gwm.stuattd.dao.approve.ClassInfoDao;
import jit.gwm.stuattd.model.Aqjxx;
import jit.gwm.stuattd.model.Sbjjbxx;
@Repository
public class ClassInfoDaoImpl extends BaseDao<Sbjjbxx> implements ClassInfoDao {

	public ClassInfoDaoImpl( ) {
		super(Sbjjbxx.class);
		
	}
	@Override
	public List<Sbjjbxx> getClassInfo(){
		SQLQuery query = getSession().createSQLQuery("select a.* from sbjjbxx a ");
		query.addEntity(Sbjjbxx.class);
		return query.list();
	}
	@Override
	public List<Sbjjbxx> getClassInfo(int classId){
		SQLQuery query = getSession().createSQLQuery("select a.* from sbjjbxx a ");
		query.addEntity(Sbjjbxx.class);
		return query.list();
	}
}
