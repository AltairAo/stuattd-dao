package jit.gwm.stuattd.dao.apply;

import java.util.List;

import jit.gwm.stuattd.model.Tjzgjbxx;
import core.dao.Dao;


public interface TjzgjbxxDao extends Dao<Tjzgjbxx> {

	List<Tjzgjbxx> getApproveTeachers(Long xsjbxxId);

}
