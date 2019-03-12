package com.algaworks.curso.main;

import com.algaworks.curso.modelo.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MiseAjourDuPremierObjet {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplePU");
		EntityManager em = emf.createEntityManager();
		
		Customer customer = em.find(Customer.class, 0);
		
		try {
			em.getTransaction().begin();
			customer.setName("zinou");
			customer.setAge(25);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			e.getMessage();
		}
		System.out.println("update successfull!");

		em.close();
		
	}

}
