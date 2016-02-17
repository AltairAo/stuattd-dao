package com.stuattd.dao.sys.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.stuattd.dao.sys.AttachmentDao;
import com.stuattd.model.sys.Attachment;

import core.dao.BaseDao;

/**
 * @开发商:jit.gwm
 */
@Repository
public class AttachmentDaoImpl extends BaseDao<Attachment> implements AttachmentDao {

	public AttachmentDaoImpl() {
		super(Attachment.class);
	}

	@Override
	public List<Object[]> queryFlowerList(String epcId) {
		Query query = this
				.getSession()
				.createSQLQuery(
						"select ft.name,group_concat(a.file_path),ft.description,f.epc_id from stuattd_type ft inner join stuattd f on ft.id=f.type_id left join attachment a on a.stuattdtype_id=ft.id where f.epc_id=? group by a.file_name");
		query.setParameter(0, epcId);
		return query.list();
	}

	@Override
	public void deleteAttachmentByStuattdTypeId(Long stuattdTypeId) {
		Query query = this.getSession().createSQLQuery("delete from attachment where stuattdtype_id = :stuattdTypeId");
		query.setParameter("stuattdTypeId", stuattdTypeId);
		query.executeUpdate();
	}

}
