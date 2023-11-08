package com.demo.JPAHib1toMUniMapping;

/**
 * Hello world!
 *
 */
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

import com.demo.JPAHib1toMUniMapping.model.Department;
import com.demo.JPAHib1toMUniMapping.model.Employee;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePU2");
        EntityManager em = emf.createEntityManager();

        // Create a Department with Employees
        Department department = new Department(30,"IT");
        Employee employee1 = new Employee(104,"logi", "sarvanan");
        Employee employee2 = new Employee(105,"dhruv", "elango");
       employee1.setDepartment(department);
       employee2.setDepartment(department);
     
       
        em.getTransaction().begin();
        em.persist(employee1);
        em.persist(employee2);
        em.getTransaction().commit();
        System.out.println("saved");
  
        /*
       System.out.println("retreiving employee 100 details");
        
        Employee emp=em.find(Employee.class,100);
        		System.out.println(emp);
        		Department d=emp.getDepartment();
        		System.out.println(d);
      */  		

        // Clean up
        em.close();
        emf.close();
    }
}

