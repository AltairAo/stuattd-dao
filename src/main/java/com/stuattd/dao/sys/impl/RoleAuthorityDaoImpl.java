package com.stuattd.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.stuattd.dao.sys.RoleAuthorityDao;
import com.stuattd.model.sys.RoleAuthority;

import core.dao.BaseDao;

/**
 * @开发商:jit.gwm
 */
@Repository
public class RoleAuthorityDaoImpl extends BaseDao<RoleAuthority> implements RoleAuthorityDao {

	public RoleAuthorityDaoImpl() {
		super(RoleAuthority.class);
	}
}
