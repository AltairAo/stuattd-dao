package com.stuattd.dao.sys;

import java.util.List;

import com.stuattd.model.sys.SensorData;

import core.dao.Dao;

/**
 * @开发商:jit.gwm
 */
public interface SensorDataDao extends Dao<SensorData> {

	List<Object[]> doGetSensorDataStatistics(Short sensorType);

}
