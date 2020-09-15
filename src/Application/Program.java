/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author PC
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department obj = new Department(1, "Rafu");
        System.out.println(obj);
        
        Seller seller = new Seller(2, "jojo","Jojo@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);
        
        SellerDao sellerDao = DaoFactory.CreateSellerDao();
    }
    
}
