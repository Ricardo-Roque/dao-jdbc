package org.example.application;

import org.example.db.DB;
import org.example.model.dao.DAOFactory;
import org.example.model.dao.SellerDAO;
import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDAO sellerDao = DAOFactory.createSellerDAO(DB.getConnection());

        System.out.println("=== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> sellerList = sellerDao.findByDepartment(department);

        for (Seller obj : sellerList) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll ====");
        sellerList = sellerDao.findAll();

        for (Seller obj : sellerList) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: seller insert ====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);

        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller update ====");
        Seller sellerUpdate = sellerDao.findById(1);
        sellerUpdate.setBaseSalary(16000.00);
        sellerDao.update(sellerUpdate);

        System.out.println("Update completed!");
    }
}