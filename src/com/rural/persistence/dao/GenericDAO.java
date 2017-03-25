package com.rural.persistence.dao;

import com.rural.persistence.Banco;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class GenericDAO {

	public void inserir (Object entidade){
		EntityManager em = getEntityManager();
		if (!em.getTransaction().isActive()) {
                    em.getTransaction().begin();
                }
		em.persist(entidade);
		em.getTransaction().commit();
	}
	
	public void alterar (Object entidade){
		EntityManager em = getEntityManager();
		if (!em.getTransaction().isActive()) {
                    em.getTransaction().begin();
                }
		em.merge(entidade);
		em.getTransaction().commit();
	}
	
	public void deletar (Object entidade){
		EntityManager em = getEntityManager();
		if (!em.getTransaction().isActive()) {
                    em.getTransaction().begin();
                }
		em.remove(entidade);
		em.getTransaction().commit();
	}
	
	public void inserirLog(Object log){
		EntityManager em = getEntityManager();
		try {
                    if (!em.getTransaction().isActive()) {
                        em.getTransaction().begin();
                    }
                    
                    em.persist(log);
                    em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		finally {
			em.close();
		}
	}
        
        public void inserirAlterar (Object entidade){
            EntityManager em = getEntityManager();
            if (!em.getTransaction().isActive()) {
                    em.getTransaction().begin();
                }
                
            try {
                em.persist(entidade);
            } catch (EntityExistsException e) {
                em.merge(entidade);
            }
            
            em.getTransaction().commit();
        }
	
	public <T> Object findById (int id, Class<T> objClass) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		EntityManager em = getEntityManager();
		T obj = (T) Class.forName(objClass.getName()).newInstance();
		if (!em.getTransaction().isActive()) {
                    em.getTransaction().begin();
                }
		Query q = em.createQuery("Select o from "+ objClass.getName() +" as o " + "where o.id = :param");
		q.setParameter("param", id);
		obj = (T) q.getSingleResult();
		
		return obj;
	}
	
	protected EntityManager getEntityManager(){
		return Banco.getInstance();
	}
}
