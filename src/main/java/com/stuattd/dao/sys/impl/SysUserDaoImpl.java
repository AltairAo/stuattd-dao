package com.stuattd.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.stuattd.dao.sys.SysUserDao;
import com.stuattd.model.sys.SysUser;

import core.dao.BaseDao;

/**
 * @开发商:jit.gwm
 */
@Repository
public class SysUserDaoImpl extends BaseDao<SysUser> implements SysUserDao {

	public SysUserDaoImpl() {
		super(SysUser.class);
	}

}
