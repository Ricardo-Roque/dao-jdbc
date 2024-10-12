package org.example.model.dao;

import org.example.db.DB;
import org.example.model.dao.impl.DepartmentDAOImpl;
import org.example.model.dao.impl.SellerDAOImpl;

import java.sql.Connection;

public class DAOFactory {

    public static SellerDAO createSellerDAO(Connection connection) {
        return new SellerDAOImpl(connection);
    }

    public static DepartmentDAO createDepartmentDao() {
        return new DepartmentDAOImpl(DB.getConnection());
    }
}
