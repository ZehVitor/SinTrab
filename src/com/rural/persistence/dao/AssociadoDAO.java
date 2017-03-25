/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.persistence.dao;

import com.rural.model.Associado;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author JoseVitor
 */
public class AssociadoDAO extends GenericDAO {
    
    public List<Associado> findAssociadoByNome (String nomeAssociado) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		EntityManager em = getEntityManager();
		List<Associado> retorno = new ArrayList<Associado>();
		if (!em.getTransaction().isActive()) {
                    em.getTransaction().begin();
                }
                
                String select = "Select a from Associado as a ";
                String where = " where 1=1 ";
                
                if (!nomeAssociado.isEmpty()) {
                    where += " AND a.nome = :nome ";
                }
                
		Query q = em.createQuery(select + where);
		
                if (!nomeAssociado.isEmpty()) {
                    q.setParameter("nome", nomeAssociado);
                }
                
		retorno = q.getResultList();
		
		return retorno;
	}
    
    public List<Associado> findAssociadoByFiltros (String nome, String cpf, String matricula) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		EntityManager em = getEntityManager();
		List<Associado> retorno = new ArrayList<Associado>();
                if (!em.getTransaction().isActive()) {
                    em.getTransaction().begin();
                }
                
                String select = "Select a from Associado as a ";
                String where = " where 1=1 ";
                
                if (!nome.isEmpty()) {
                    where += " AND a.nome = :nome ";
                }
                
                if (!cpf.isEmpty()) {
                    where += " AND a.cpf = :cpf ";
                }
                
                if (!matricula.isEmpty()) {
                    where += " AND a.matricula = :matricula ";
                }
                
                String orderBy = " ORDER BY a.nome ";
                
		Query q = em.createQuery(select + where + orderBy);
		
                if (!nome.isEmpty()) {
                    q.setParameter("nome", nome);
                }
                
                if (!cpf.isEmpty()) {
                    q.setParameter("cpf", cpf);
                }
                
                if (!matricula.isEmpty()) {
                    q.setParameter("matricula", matricula);
                }
                
		retorno = q.getResultList();
		
		return retorno;
	}
}
