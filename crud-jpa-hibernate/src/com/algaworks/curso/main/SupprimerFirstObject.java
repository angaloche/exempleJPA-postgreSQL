package com.algaworks.curso.main;

import com.algaworks.curso.modelo.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SupprimerFirstObject {
	
	public static void main(String args[]){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplePU");
		EntityManager em = emf.createEntityManager();
		
		Customer client = em.find(Customer.class, 1);
		
		try {
			em.getTransaction().begin();
			em.remove(client);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			e.getMessage();
		}
		
		em.close();
		
		System.out.println("Supprimé avec succès!");
		
	}
}
