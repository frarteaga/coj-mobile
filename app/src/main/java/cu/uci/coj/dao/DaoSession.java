package cu.uci.coj.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import cu.uci.coj.dao.DBProblemItem;
import cu.uci.coj.dao.DBProblem;
import cu.uci.coj.dao.DBEntries;
import cu.uci.coj.dao.DBJudgments;
import cu.uci.coj.dao.DBUserStanding;
import cu.uci.coj.dao.DBCountryStanding;
import cu.uci.coj.dao.DBInstitutionStanding;
import cu.uci.coj.dao.DBComingContest;
import cu.uci.coj.dao.DBPreviousContest;
import cu.uci.coj.dao.DBRunningContest;
import cu.uci.coj.dao.DBProfile;
import cu.uci.coj.dao.DBInboxMessage;
import cu.uci.coj.dao.DBOutboxMessage;
import cu.uci.coj.dao.DBDraftMessage;

import cu.uci.coj.dao.DBProblemItemDao;
import cu.uci.coj.dao.DBProblemDao;
import cu.uci.coj.dao.DBEntriesDao;
import cu.uci.coj.dao.DBJudgmentsDao;
import cu.uci.coj.dao.DBUserStandingDao;
import cu.uci.coj.dao.DBCountryStandingDao;
import cu.uci.coj.dao.DBInstitutionStandingDao;
import cu.uci.coj.dao.DBComingContestDao;
import cu.uci.coj.dao.DBPreviousContestDao;
import cu.uci.coj.dao.DBRunningContestDao;
import cu.uci.coj.dao.DBProfileDao;
import cu.uci.coj.dao.DBInboxMessageDao;
import cu.uci.coj.dao.DBOutboxMessageDao;
import cu.uci.coj.dao.DBDraftMessageDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dBProblemItemDaoConfig;
    private final DaoConfig dBProblemDaoConfig;
    private final DaoConfig dBEntriesDaoConfig;
    private final DaoConfig dBJudgmentsDaoConfig;
    private final DaoConfig dBUserStandingDaoConfig;
    private final DaoConfig dBCountryStandingDaoConfig;
    private final DaoConfig dBInstitutionStandingDaoConfig;
    private final DaoConfig dBComingContestDaoConfig;
    private final DaoConfig dBPreviousContestDaoConfig;
    private final DaoConfig dBRunningContestDaoConfig;
    private final DaoConfig dBProfileDaoConfig;
    private final DaoConfig dBInboxMessageDaoConfig;
    private final DaoConfig dBOutboxMessageDaoConfig;
    private final DaoConfig dBDraftMessageDaoConfig;

    private final DBProblemItemDao dBProblemItemDao;
    private final DBProblemDao dBProblemDao;
    private final DBEntriesDao dBEntriesDao;
    private final DBJudgmentsDao dBJudgmentsDao;
    private final DBUserStandingDao dBUserStandingDao;
    private final DBCountryStandingDao dBCountryStandingDao;
    private final DBInstitutionStandingDao dBInstitutionStandingDao;
    private final DBComingContestDao dBComingContestDao;
    private final DBPreviousContestDao dBPreviousContestDao;
    private final DBRunningContestDao dBRunningContestDao;
    private final DBProfileDao dBProfileDao;
    private final DBInboxMessageDao dBInboxMessageDao;
    private final DBOutboxMessageDao dBOutboxMessageDao;
    private final DBDraftMessageDao dBDraftMessageDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dBProblemItemDaoConfig = daoConfigMap.get(DBProblemItemDao.class).clone();
        dBProblemItemDaoConfig.initIdentityScope(type);

        dBProblemDaoConfig = daoConfigMap.get(DBProblemDao.class).clone();
        dBProblemDaoConfig.initIdentityScope(type);

        dBEntriesDaoConfig = daoConfigMap.get(DBEntriesDao.class).clone();
        dBEntriesDaoConfig.initIdentityScope(type);

        dBJudgmentsDaoConfig = daoConfigMap.get(DBJudgmentsDao.class).clone();
        dBJudgmentsDaoConfig.initIdentityScope(type);

        dBUserStandingDaoConfig = daoConfigMap.get(DBUserStandingDao.class).clone();
        dBUserStandingDaoConfig.initIdentityScope(type);

        dBCountryStandingDaoConfig = daoConfigMap.get(DBCountryStandingDao.class).clone();
        dBCountryStandingDaoConfig.initIdentityScope(type);

        dBInstitutionStandingDaoConfig = daoConfigMap.get(DBInstitutionStandingDao.class).clone();
        dBInstitutionStandingDaoConfig.initIdentityScope(type);

        dBComingContestDaoConfig = daoConfigMap.get(DBComingContestDao.class).clone();
        dBComingContestDaoConfig.initIdentityScope(type);

        dBPreviousContestDaoConfig = daoConfigMap.get(DBPreviousContestDao.class).clone();
        dBPreviousContestDaoConfig.initIdentityScope(type);

        dBRunningContestDaoConfig = daoConfigMap.get(DBRunningContestDao.class).clone();
        dBRunningContestDaoConfig.initIdentityScope(type);

        dBProfileDaoConfig = daoConfigMap.get(DBProfileDao.class).clone();
        dBProfileDaoConfig.initIdentityScope(type);

        dBInboxMessageDaoConfig = daoConfigMap.get(DBInboxMessageDao.class).clone();
        dBInboxMessageDaoConfig.initIdentityScope(type);

        dBOutboxMessageDaoConfig = daoConfigMap.get(DBOutboxMessageDao.class).clone();
        dBOutboxMessageDaoConfig.initIdentityScope(type);

        dBDraftMessageDaoConfig = daoConfigMap.get(DBDraftMessageDao.class).clone();
        dBDraftMessageDaoConfig.initIdentityScope(type);

        dBProblemItemDao = new DBProblemItemDao(dBProblemItemDaoConfig, this);
        dBProblemDao = new DBProblemDao(dBProblemDaoConfig, this);
        dBEntriesDao = new DBEntriesDao(dBEntriesDaoConfig, this);
        dBJudgmentsDao = new DBJudgmentsDao(dBJudgmentsDaoConfig, this);
        dBUserStandingDao = new DBUserStandingDao(dBUserStandingDaoConfig, this);
        dBCountryStandingDao = new DBCountryStandingDao(dBCountryStandingDaoConfig, this);
        dBInstitutionStandingDao = new DBInstitutionStandingDao(dBInstitutionStandingDaoConfig, this);
        dBComingContestDao = new DBComingContestDao(dBComingContestDaoConfig, this);
        dBPreviousContestDao = new DBPreviousContestDao(dBPreviousContestDaoConfig, this);
        dBRunningContestDao = new DBRunningContestDao(dBRunningContestDaoConfig, this);
        dBProfileDao = new DBProfileDao(dBProfileDaoConfig, this);
        dBInboxMessageDao = new DBInboxMessageDao(dBInboxMessageDaoConfig, this);
        dBOutboxMessageDao = new DBOutboxMessageDao(dBOutboxMessageDaoConfig, this);
        dBDraftMessageDao = new DBDraftMessageDao(dBDraftMessageDaoConfig, this);

        registerDao(DBProblemItem.class, dBProblemItemDao);
        registerDao(DBProblem.class, dBProblemDao);
        registerDao(DBEntries.class, dBEntriesDao);
        registerDao(DBJudgments.class, dBJudgmentsDao);
        registerDao(DBUserStanding.class, dBUserStandingDao);
        registerDao(DBCountryStanding.class, dBCountryStandingDao);
        registerDao(DBInstitutionStanding.class, dBInstitutionStandingDao);
        registerDao(DBComingContest.class, dBComingContestDao);
        registerDao(DBPreviousContest.class, dBPreviousContestDao);
        registerDao(DBRunningContest.class, dBRunningContestDao);
        registerDao(DBProfile.class, dBProfileDao);
        registerDao(DBInboxMessage.class, dBInboxMessageDao);
        registerDao(DBOutboxMessage.class, dBOutboxMessageDao);
        registerDao(DBDraftMessage.class, dBDraftMessageDao);
    }
    
    public void clear() {
        dBProblemItemDaoConfig.getIdentityScope().clear();
        dBProblemDaoConfig.getIdentityScope().clear();
        dBEntriesDaoConfig.getIdentityScope().clear();
        dBJudgmentsDaoConfig.getIdentityScope().clear();
        dBUserStandingDaoConfig.getIdentityScope().clear();
        dBCountryStandingDaoConfig.getIdentityScope().clear();
        dBInstitutionStandingDaoConfig.getIdentityScope().clear();
        dBComingContestDaoConfig.getIdentityScope().clear();
        dBPreviousContestDaoConfig.getIdentityScope().clear();
        dBRunningContestDaoConfig.getIdentityScope().clear();
        dBProfileDaoConfig.getIdentityScope().clear();
        dBInboxMessageDaoConfig.getIdentityScope().clear();
        dBOutboxMessageDaoConfig.getIdentityScope().clear();
        dBDraftMessageDaoConfig.getIdentityScope().clear();
    }

    public DBProblemItemDao getDBProblemItemDao() {
        return dBProblemItemDao;
    }

    public DBProblemDao getDBProblemDao() {
        return dBProblemDao;
    }

    public DBEntriesDao getDBEntriesDao() {
        return dBEntriesDao;
    }

    public DBJudgmentsDao getDBJudgmentsDao() {
        return dBJudgmentsDao;
    }

    public DBUserStandingDao getDBUserStandingDao() {
        return dBUserStandingDao;
    }

    public DBCountryStandingDao getDBCountryStandingDao() {
        return dBCountryStandingDao;
    }

    public DBInstitutionStandingDao getDBInstitutionStandingDao() {
        return dBInstitutionStandingDao;
    }

    public DBComingContestDao getDBComingContestDao() {
        return dBComingContestDao;
    }

    public DBPreviousContestDao getDBPreviousContestDao() {
        return dBPreviousContestDao;
    }

    public DBRunningContestDao getDBRunningContestDao() {
        return dBRunningContestDao;
    }

    public DBProfileDao getDBProfileDao() {
        return dBProfileDao;
    }

    public DBInboxMessageDao getDBInboxMessageDao() {
        return dBInboxMessageDao;
    }

    public DBOutboxMessageDao getDBOutboxMessageDao() {
        return dBOutboxMessageDao;
    }

    public DBDraftMessageDao getDBDraftMessageDao() {
        return dBDraftMessageDao;
    }

}
