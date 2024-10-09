package org.example.application;

import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");

        Seller seller = new Seller(21, "Ricardo Roque", "ricardodebonaroque@gmail.com", new Date(), 3000.00, department);

        System.out.println(department);
        System.out.println(seller);
    }
}