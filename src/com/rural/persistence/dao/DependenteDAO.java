/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.persistence.dao;

import com.rural.model.Dependente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
public class DependenteDAO extends GenericDAO {

    /*
     * Método para buscar um ID, que também é utilizado como matrícula
     * @param id
     * @return 
     */
    public Dependente findById(int id) {
        Dependente dep = null;

        try {
            dep = (Dependente) super.findById(id, Dependente.class);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            System.out.println("Erro ao procurar o ID");
        }
        return dep;
    }

    public List<Dependente> findDependenteByAssociado(int idAssociado) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        EntityManager em = getEntityManager();
        List<Dependente> retorno = new ArrayList<Dependente>();
        
        
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }

        String select = "Select a from Dependente as a where 1=1 AND a.associado = " + idAssociado + " ORDER BY a.id ";

        Query q = em.createQuery(select);
        retorno = q.getResultList();

        return retorno;
    }

}
