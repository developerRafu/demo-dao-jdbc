package model.dao;

import model.dao.impl.SellerDaoImplJDBC;

/**
 *
 * @author Rafu
 */
public class DaoFactory {
    public static SellerDao CreateSellerDao(){
        return new SellerDaoImplJDBC();
    }
}
