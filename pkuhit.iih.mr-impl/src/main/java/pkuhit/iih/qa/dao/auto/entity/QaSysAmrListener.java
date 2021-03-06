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
public class QaSysAmrListener implements EntityListener<QaSysAmr> {

    @Override
    public void preInsert(QaSysAmr entity, PreInsertContext<QaSysAmr> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
      	entity.crtDeptCd = session.getDeptId();
    }

    @Override
    public void preUpdate(QaSysAmr entity, PreUpdateContext<QaSysAmr> context) {
		Session session = Session.get();
		entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdDeptCd = session.getDeptId();    	
    }

    @Override
    public void preDelete(QaSysAmr entity, PreDeleteContext<QaSysAmr> context) {
    }

    @Override
    public void postInsert(QaSysAmr entity, PostInsertContext<QaSysAmr> context) {
    }

    @Override
    public void postUpdate(QaSysAmr entity, PostUpdateContext<QaSysAmr> context) {
    }

    @Override
    public void postDelete(QaSysAmr entity, PostDeleteContext<QaSysAmr> context) {
    }
}