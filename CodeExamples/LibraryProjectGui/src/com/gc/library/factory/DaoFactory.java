package com.gc.library.factory;

import com.gc.library.dao.Dao;
import com.gc.library.dao.HibernateDao;
import com.gc.library.dao.JDBCDao;

/**
 * Created by maurice on 5/10/17.
 */
public class DaoFactory {
    public static final int JDBC = 1;//we could also use enums here
    private static final int HIBERNATE = 2;

    /*
    * Return a concrete instance of the requested dao type
     */
    public static Dao getInstance(int daoType) {

        Dao dao = null;//this is bad, change later

        switch (daoType){
            case JDBC:
                dao = new JDBCDao();
                break;
            case HIBERNATE:
                dao = new HibernateDao();
                break;
            default:
                //TODO null for now
                break;
        }
        return dao;
    }
}
