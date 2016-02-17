package com.stuattd.dao.sys;

import java.util.List;

import jit.gwm.stuattd.model.Sbjjbxx;
import core.dao.Dao;

/**
 * @开发商:jit.gwm
 */
public interface ClassManagementDao extends Dao<Sbjjbxx> {
	List<Sbjjbxx> getClassType();

	boolean saveClass(Sbjjbxx entity);
	// public void save(Sbjjbxx Sbjjbxx);
}
