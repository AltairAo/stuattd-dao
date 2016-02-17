package com.stuattd.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.stuattd.dao.sys.ConfigDao;
import com.stuattd.model.sys.Config;

import core.dao.BaseDao;

/**
 * @开发商:jit.gwm
 */
@Repository
public class ConfigDaoImpl extends BaseDao<Config> implements ConfigDao {

	public ConfigDaoImpl() {
		super(Config.class);
	}

}
