package jit.gwm.stuattd.dao.apply;

import java.util.List;

import jit.gwm.stuattd.model.Aqjxx;
import core.dao.Dao;

public interface AttdSearchDao extends Dao<Aqjxx> {
	
	List<Aqjxx>  getTotalFromCgx(Long xsjbxxId);
	List<Aqjxx>  getInfoByCondition(Long xsjbxxId,String kssj,String jssj);

}
