package com.algaworks.curso.main;

import com.algaworks.curso.modelo.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InterrogationDuPremierObjet {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplePU");
		EntityManager em = emf.createEntityManager();
		
		try {

			Customer customer = em.find(Customer.class, 0);
			
			if(customer != null){
				System.out.println("name: " + customer.getName());
				System.out.println("age: " + customer.getAge());

			}else{
				System.out.println("pas de resultat!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
