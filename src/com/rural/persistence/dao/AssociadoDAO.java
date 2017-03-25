/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.persistence.dao;

import com.rural.model.Associado;
import com.rural.uteis.ValidatorUtil;
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
                
                if (!ValidatorUtil.isNullOrEmpty(nomeAssociado)) {
                    where += " AND a.nome = :nome ";
                }
                
		Query q = em.createQuery(select + where);
		
                if (!ValidatorUtil.isNullOrEmpty(nomeAssociado)) {
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
                
                if (!ValidatorUtil.isNullOrEmpty(nome)) {
                    where += " AND a.nome = :nome ";
                }
                
                if (!ValidatorUtil.isNullOrEmpty(cpf)) {
                    where += " AND a.cpf = :cpf ";
                }
                
                if (!ValidatorUtil.isNullOrEmpty(matricula)) {
                    where += " AND a.matricula = :matricula ";
                }
                
                String orderBy = " ORDER BY a.nome ";
                
		Query q = em.createQuery(select + where + orderBy);
		
                if (!ValidatorUtil.isNullOrEmpty(nome)) {
                    q.setParameter("nome", nome);
                }
                
                if (!ValidatorUtil.isNullOrEmpty(cpf)) {
                    q.setParameter("cpf", cpf);
                }
                
                if (!ValidatorUtil.isNullOrEmpty(matricula)) {
                    q.setParameter("matricula", matricula);
                }
                
		retorno = q.getResultList();
		
		return retorno;
	}
}
