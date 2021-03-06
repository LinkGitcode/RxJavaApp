package com.jiang.android.rxjavaapp.database;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig operatorsDaoConfig;
    private final DaoConfig alloperatorsDaoConfig;

    private final operatorsDao operatorsDao;
    private final alloperatorsDao alloperatorsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        operatorsDaoConfig = daoConfigMap.get(operatorsDao.class).clone();
        operatorsDaoConfig.initIdentityScope(type);

        alloperatorsDaoConfig = daoConfigMap.get(alloperatorsDao.class).clone();
        alloperatorsDaoConfig.initIdentityScope(type);

        operatorsDao = new operatorsDao(operatorsDaoConfig, this);
        alloperatorsDao = new alloperatorsDao(alloperatorsDaoConfig, this);

        registerDao(operators.class, operatorsDao);
        registerDao(alloperators.class, alloperatorsDao);
    }
    
    public void clear() {
        operatorsDaoConfig.getIdentityScope().clear();
        alloperatorsDaoConfig.getIdentityScope().clear();
    }

    public operatorsDao getOperatorsDao() {
        return operatorsDao;
    }

    public alloperatorsDao getAlloperatorsDao() {
        return alloperatorsDao;
    }

}
