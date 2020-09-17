/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
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
        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.CreateSellerDao();
        System.out.println("==== TEST 1: seller findById==== ");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("==== TEST 2: seller findByDepartment==== ");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }
        System.out.println("==== TEST 3: seller findByAll==== ");
        List<Seller> list2 = sellerDao.findAll();
        for(Seller obj : list2){
            System.out.println(obj);
        }
        System.out.println("==== TEST 4: seller insert==== ");
            Seller newSeller = new Seller(null,"Greg","greg@gmsil.com",new Date(), 4000.0, department);
            sellerDao.insert(newSeller);
            System.out.println("Inserted! new id = "+newSeller.getId());
            System.out.println("==== TEST 5: seller insert==== ");
            seller = sellerDao.findById(1);
            seller.setName("Martha mãe do Batman");
            sellerDao.update(seller);
            System.out.println("Update completed");
            System.out.println("==== TEST 6: seller delete=== ");
            System.out.println("Enter id for delete test:");
            int id = sc.nextInt();
            sellerDao.deleteById(id);
            System.out.println("Delete completed");
            
            sc.close();
    }
}
