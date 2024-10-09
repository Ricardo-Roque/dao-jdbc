package org.example.model.dao;

import org.example.model.dao.impl.SellerDAOImpl;

public class DAOFactory {

    public static SellerDAO createSellerDAO() {
        return new SellerDAOImpl();
    }
}
