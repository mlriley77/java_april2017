package com.test.factory;

import com.test.dao.Dao;
import com.test.dao.HibernateDao;
import com.test.dao.JDBCDao;

/**
 * Created by maurice on 5/9/17.
 * Dao factory using the DAO factory design pattern
 */
public class DaoFactory {
    public static final int JDBC = 1;//This is a good case for enums use here
    public static final int HIBERNATE = 2;

    /*
    * Return instance of request dao object
     */
    public static Dao getInstance(int daoType) {
        Dao dao = null;//TODO need alternative to null here

        switch (daoType){
            case JDBC:
                dao = new JDBCDao();
                break;
            case HIBERNATE:
                dao = new HibernateDao();
                break;
            default:
                //null for now
                break;
        }
        return dao;
    }
}
