package com.stuattd.dao.sys;

import java.util.List;

import com.stuattd.model.sys.Stuattd;

import core.dao.Dao;

/**
 * @开发商:jit.gwm
 */
public interface StuattdDao extends Dao<Stuattd> {

	List<Object[]> queryExportedStuattd(Long[] ids);

}
