package org.example.application;

import org.example.db.DB;
import org.example.model.dao.DAOFactory;
import org.example.model.dao.SellerDAO;
import org.example.model.entities.Seller;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {

        Connection connection = DB.getConnection();

        SellerDAO sellerDao = DAOFactory.createSellerDAO(connection);

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}