package org.example.application;

import org.example.model.entities.Department;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        System.out.println(department);
    }
}