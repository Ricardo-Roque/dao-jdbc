package org.example.application;

import org.example.db.DB;
import org.example.model.dao.DAOFactory;
import org.example.model.dao.SellerDAO;
import org.example.model.entities.Seller;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {

        SellerDAO sellerDao = DAOFactory.createSellerDAO(DB.getConnection());

        System.out.println("=== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}