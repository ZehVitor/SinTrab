package com.rural.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Banco {
	private static EntityManager em;

	public static EntityManager getInstance(){
		if (em == null) {
			EntityManagerFactory emf =
					Persistence.createEntityManagerFactory("SinTrab");
			em = emf.createEntityManager();
		}
		
		return em;
	}
	
	public static void closeInstance(){
		if (em != null && em.isOpen()) {
			em.close();	
		}
	}
}