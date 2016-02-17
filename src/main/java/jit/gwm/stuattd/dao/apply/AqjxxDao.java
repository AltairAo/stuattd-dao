package jit.gwm.stuattd.dao.apply;

import jit.gwm.stuattd.model.Aqjxx;

import com.stuattd.model.sys.SysUser;

import core.dao.Dao;

/**
 * @开发商:jit.gwm
 */
public interface AqjxxDao extends Dao<Aqjxx> {

	boolean doUpdate(Aqjxx aqjxx);

	boolean doSave(Aqjxx aqjxx);
}
