package com.stuattd.dao.sys;

import java.util.List;

import com.stuattd.model.sys.Authority;

import core.dao.Dao;

/**
 * @开发商:jit.gwm
 */
public interface AuthorityDao extends Dao<Authority> {

	List<Authority> queryByParentIdAndRole(Short role);

	List<Authority> queryChildrenByParentIdAndRole(Long parentId, Short role);

}
