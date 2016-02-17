package com.stuattd.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.stuattd.dao.sys.SensorLastDataDao;
import com.stuattd.model.sys.SensorLastData;

import core.dao.BaseDao;

/**
 * @开发商:jit.gwm
 */
@Repository
public class SensorLastDataDaoImpl extends BaseDao<SensorLastData> implements SensorLastDataDao {

	public SensorLastDataDaoImpl() {
		super(SensorLastData.class);
	}

}
