package com.algaworks.curso.main;

import com.algaworks.curso.modelo.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EnregistrementDuPremierObjet {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplePU");
		EntityManager em = emf.createEntityManager();
		
		Customer client = new Customer();
		client.setName("lisandro zinou");
		client.setAge(24);

		
		try {
			em.getTransaction().begin();
			em.persist(client);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			e.getMessage();
		}
		em.close();
		
		System.out.println("Client enregistré avec succès!");
		
	}

}