package jit.gwm.stuattd.dao.approve;

import java.util.List;

import jit.gwm.stuattd.model.Aqjxx;
import jit.gwm.stuattd.model.Sxsjbxx;
import com.stuattd.model.sys.SysUser;

import core.dao.Dao;

/**
 * @开发商:jit.gwm
 */
public interface AttdApproveDao extends Dao<Aqjxx> {
	List<Aqjxx> getTotalFromCgx();

	List<Aqjxx> getInfoByClass(int classId);

	List<Aqjxx> getInfoByCondition(int classId, String stuName);

	List<Sxsjbxx> getStuName(Long xsjbxxId);

	boolean Withdraw(int id);

	boolean Negative(int id, String bpyy);

	boolean Pass(int id);
}
