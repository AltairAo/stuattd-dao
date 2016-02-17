package com.stuattd.dao.sys;

import java.util.List;

import com.stuattd.model.sys.Sensor;

import core.dao.Dao;
import core.support.QueryResult;

/**
 * @开发商:jit.gwm
 */
public interface SensorDao extends Dao<Sensor> {

	List<Sensor> querySensorBySensorType(Short sensorType);

	List<Sensor> querySensorLastData();

	QueryResult<Sensor> querySensorList(Sensor sensor);

	List<Sensor> querySensorLastDataWithEpcId();

	List<Sensor> queryStuattdSensorLastData();

}
