package com.stuattd.dao.sys;

import java.util.List;

import com.stuattd.model.sys.MonitorLog;

import core.dao.Dao;

/**
 * @开发商:jit.gwm
 */
public interface MonitorLogDao extends Dao<MonitorLog> {

	List<MonitorLog> querySensorMonitorLog();

}
