package pkuhit.iih.qa.dao.auto.entity;

import java.sql.Timestamp;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

import pkuhit.xap.ac.Session;

/**
 * 
 */
public class QaItemMrTpListener implements EntityListener<QaItemMrTp> {

    @Override
    public void preInsert(QaItemMrTp entity, PreInsertContext<QaItemMrTp> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
      	entity.crtDeptCd = session.getDeptId();
    }

    @Override
    public void preUpdate(QaItemMrTp entity, PreUpdateContext<QaItemMrTp> context) {
		Session session = Session.get();
		entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdDeptCd = session.getDeptId();    	
    }

    @Override
    public void preDelete(QaItemMrTp entity, PreDeleteContext<QaItemMrTp> context) {
    }

    @Override
    public void postInsert(QaItemMrTp entity, PostInsertContext<QaItemMrTp> context) {
    }

    @Override
    public void postUpdate(QaItemMrTp entity, PostUpdateContext<QaItemMrTp> context) {
    }

    @Override
    public void postDelete(QaItemMrTp entity, PostDeleteContext<QaItemMrTp> context) {
    }
}