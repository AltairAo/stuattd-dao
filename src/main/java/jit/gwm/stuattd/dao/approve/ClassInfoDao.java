package jit.gwm.stuattd.dao.approve;

import java.util.List;

import jit.gwm.stuattd.model.Sbjjbxx;

import com.stuattd.model.sys.SysUser;

import core.dao.Dao;

/**
 * @开发商:jit.gwm
 */
public interface ClassInfoDao extends Dao<Sbjjbxx> {
	List<Sbjjbxx> getClassInfo();

	List<Sbjjbxx> getClassInfo(int classId);
}
