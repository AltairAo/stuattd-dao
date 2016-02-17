package com.stuattd.dao.sys;

import java.util.List;

import com.stuattd.model.sys.Attachment;

import core.dao.Dao;

/**
 * @开发商:jit.gwm
 */
public interface AttachmentDao extends Dao<Attachment> {

	List<Object[]> queryFlowerList(String epcId);

	void deleteAttachmentByStuattdTypeId(Long stuattdTypeId);

}
