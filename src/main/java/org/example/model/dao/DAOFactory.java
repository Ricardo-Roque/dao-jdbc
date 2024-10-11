package org.example.model.dao;

import org.example.model.dao.impl.SellerDAOImpl;

import java.sql.Connection;

public class DAOFactory {

    public static SellerDAO createSellerDAO(Connection connection) {
        return new SellerDAOImpl(connection);
    }
}
