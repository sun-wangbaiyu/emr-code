package pkuhit.org.dao.auto;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2017-01-01T01:49:41.674+0800")
public class OrgEmpDeptDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements pkuhit.org.dao.auto.OrgEmpDeptDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.org.dao.auto.OrgEmpDeptDao.class, "insert", pkuhit.org.dao.auto.entity.OrgEmpDept.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.org.dao.auto.OrgEmpDeptDao.class, "insertExludeNull", pkuhit.org.dao.auto.entity.OrgEmpDept.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.org.dao.auto.OrgEmpDeptDao.class, "update", pkuhit.org.dao.auto.entity.OrgEmpDept.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.org.dao.auto.OrgEmpDeptDao.class, "updateExcludeNull", pkuhit.org.dao.auto.entity.OrgEmpDept.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.org.dao.auto.OrgEmpDeptDao.class, "markDelete", pkuhit.org.dao.auto.entity.OrgEmpDept.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.org.dao.auto.OrgEmpDeptDao.class, "delete", pkuhit.org.dao.auto.entity.OrgEmpDept.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.org.dao.auto.OrgEmpDeptDao.class, "batchInsert", java.util.List.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.org.dao.auto.OrgEmpDeptDao.class, "batchUpdate", java.util.List.class);

    private static final java.lang.reflect.Method __method9 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.org.dao.auto.OrgEmpDeptDao.class, "batchDelete", java.util.List.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public OrgEmpDeptDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public pkuhit.org.dao.auto.entity.OrgEmpDept selectById(java.lang.String empDeptCd) {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "selectById", empDeptCd);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/pkuhit/org/dao/auto/OrgEmpDeptDao/selectById.sql");
            __query.addParameter("empDeptCd", java.lang.String.class, empDeptCd);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<pkuhit.org.dao.auto.entity.OrgEmpDept> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<pkuhit.org.dao.auto.entity.OrgEmpDept>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<pkuhit.org.dao.auto.entity.OrgEmpDept>(pkuhit.org.dao.auto.entity._OrgEmpDept.getSingletonInternal()));
            pkuhit.org.dao.auto.entity.OrgEmpDept __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int insert(pkuhit.org.dao.auto.entity.OrgEmpDept entity) {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<pkuhit.org.dao.auto.entity.OrgEmpDept> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<pkuhit.org.dao.auto.entity.OrgEmpDept>(pkuhit.org.dao.auto.entity._OrgEmpDept.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int insertExludeNull(pkuhit.org.dao.auto.entity.OrgEmpDept entity) {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "insertExludeNull", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<pkuhit.org.dao.auto.entity.OrgEmpDept> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<pkuhit.org.dao.auto.entity.OrgEmpDept>(pkuhit.org.dao.auto.entity._OrgEmpDept.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("insertExludeNull");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "insertExludeNull", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "insertExludeNull", __e);
            throw __e;
        }
    }

    @Override
    public int update(pkuhit.org.dao.auto.entity.OrgEmpDept entity) {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.org.dao.auto.entity.OrgEmpDept> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.org.dao.auto.entity.OrgEmpDept>(pkuhit.org.dao.auto.entity._OrgEmpDept.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int updateExcludeNull(pkuhit.org.dao.auto.entity.OrgEmpDept entity) {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "updateExcludeNull", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.org.dao.auto.entity.OrgEmpDept> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.org.dao.auto.entity.OrgEmpDept>(pkuhit.org.dao.auto.entity._OrgEmpDept.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("updateExcludeNull");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "updateExcludeNull", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "updateExcludeNull", __e);
            throw __e;
        }
    }

    @Override
    public int markDelete(pkuhit.org.dao.auto.entity.OrgEmpDept entity) {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "markDelete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.org.dao.auto.entity.OrgEmpDept> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.org.dao.auto.entity.OrgEmpDept>(pkuhit.org.dao.auto.entity._OrgEmpDept.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("markDelete");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "markDelete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "markDelete", __e);
            throw __e;
        }
    }

    @Override
    public int delete(pkuhit.org.dao.auto.entity.OrgEmpDept entity) {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<pkuhit.org.dao.auto.entity.OrgEmpDept> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<pkuhit.org.dao.auto.entity.OrgEmpDept>(pkuhit.org.dao.auto.entity._OrgEmpDept.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] batchInsert(java.util.List<pkuhit.org.dao.auto.entity.OrgEmpDept> entities) {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "batchInsert", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.internal.jdbc.query.AutoBatchInsertQuery<pkuhit.org.dao.auto.entity.OrgEmpDept> __query = new org.seasar.doma.internal.jdbc.query.AutoBatchInsertQuery<pkuhit.org.dao.auto.entity.OrgEmpDept>(pkuhit.org.dao.auto.entity._OrgEmpDept.getSingletonInternal());
            __query.setMethod(__method7);
            __query.setConfig(config);
            __query.setEntities(entities);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("batchInsert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.BatchInsertCommand __command = new org.seasar.doma.internal.jdbc.command.BatchInsertCommand(__query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "batchInsert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "batchInsert", __e);
            throw __e;
        }
    }

    @Override
    public int[] batchUpdate(java.util.List<pkuhit.org.dao.auto.entity.OrgEmpDept> entities) {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "batchUpdate", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.internal.jdbc.query.AutoBatchUpdateQuery<pkuhit.org.dao.auto.entity.OrgEmpDept> __query = new org.seasar.doma.internal.jdbc.query.AutoBatchUpdateQuery<pkuhit.org.dao.auto.entity.OrgEmpDept>(pkuhit.org.dao.auto.entity._OrgEmpDept.getSingletonInternal());
            __query.setMethod(__method8);
            __query.setConfig(config);
            __query.setEntities(entities);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("batchUpdate");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.BatchUpdateCommand __command = new org.seasar.doma.internal.jdbc.command.BatchUpdateCommand(__query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "batchUpdate", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "batchUpdate", __e);
            throw __e;
        }
    }

    @Override
    public int[] batchDelete(java.util.List<pkuhit.org.dao.auto.entity.OrgEmpDept> entities) {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "batchDelete", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.internal.jdbc.query.AutoBatchDeleteQuery<pkuhit.org.dao.auto.entity.OrgEmpDept> __query = new org.seasar.doma.internal.jdbc.query.AutoBatchDeleteQuery<pkuhit.org.dao.auto.entity.OrgEmpDept>(pkuhit.org.dao.auto.entity._OrgEmpDept.getSingletonInternal());
            __query.setMethod(__method9);
            __query.setConfig(config);
            __query.setEntities(entities);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("batchDelete");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.BatchDeleteCommand __command = new org.seasar.doma.internal.jdbc.command.BatchDeleteCommand(__query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "batchDelete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "batchDelete", __e);
            throw __e;
        }
    }

    @Override
    public java.sql.Clob createClob() {
        entering("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "createClob");
        try {
            org.seasar.doma.internal.jdbc.query.ClobCreateQuery __query = new org.seasar.doma.internal.jdbc.query.ClobCreateQuery();
            __query.setConfig(config);
            __query.setCallerClassName("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl");
            __query.setCallerMethodName("createClob");
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.CreateCommand<java.sql.Clob> __command = new org.seasar.doma.internal.jdbc.command.CreateCommand<java.sql.Clob>(__query);
            java.sql.Clob __result = __command.execute();
            __query.complete();
            exiting("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "createClob", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.org.dao.auto.OrgEmpDeptDaoImpl", "createClob", __e);
            throw __e;
        }
    }

}
