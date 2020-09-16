package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

/**
 *
 * @author Rafu
 */
public class DaoFactory {
    public static SellerDao CreateSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
