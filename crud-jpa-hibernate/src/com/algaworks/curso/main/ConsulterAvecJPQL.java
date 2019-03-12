package com.algaworks.curso.main;

import com.algaworks.curso.modelo.Customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConsulterAvecJPQL {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplePU");
        EntityManager em = emf.createEntityManager();

        List<Customer> clientes = em.createQuery("from Customer c", Customer.class).getResultList();
        for (Customer cliente : clientes) {
            System.out.println("ID: " + cliente.getId());
            System.out.println("nom: " + cliente.getName());
            System.out.println("age: " + cliente.getAge());
            System.out.println("---------------------------");
        }
    }

}
