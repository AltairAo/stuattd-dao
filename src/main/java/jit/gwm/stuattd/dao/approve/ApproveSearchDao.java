package jit.gwm.stuattd.dao.approve;

import java.util.List;

import core.dao.Dao;
import jit.gwm.stuattd.model.Aqjxx;
import jit.gwm.stuattd.model.Sxsjbxx;

public interface ApproveSearchDao extends Dao<Aqjxx> {
	List<Aqjxx> getTotalFromCgx();

	List<Aqjxx> getInfoByClass(int classId);

	List<Aqjxx> getInfoByCondition(int classId, String stuName);

	List<Sxsjbxx> getStuName(Long xsjbxxId);
}
