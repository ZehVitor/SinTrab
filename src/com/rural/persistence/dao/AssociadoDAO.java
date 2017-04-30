/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.persistence.dao;

import com.rural.model.Associado;
import com.rural.uteis.ValidatorUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author JoseVitor
 */
public class AssociadoDAO extends GenericDAO {

    public List<Associado> findAssociadoByNome(String nomeAssociado) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        EntityManager em = getEntityManager();
        List<Associado> retorno = new ArrayList<Associado>();
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }

        String select = "Select a from Associado as a ";
        String where = " where 1=1 ";

        if (!ValidatorUtil.isNullOrEmpty(nomeAssociado)) {
            where += " AND a.nome LIKE :nome% ";
        }

        Query q = em.createQuery(select + where);

        if (!ValidatorUtil.isNullOrEmpty(nomeAssociado)) {
            q.setParameter("nome", nomeAssociado);
        }

        retorno = q.getResultList();

        return retorno;
    }

    public List<Associado> findAssociadoByFiltros(String nome, String cpf, Integer id) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        EntityManager em = getEntityManager();
        List<Associado> retorno = new ArrayList<Associado>();
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }

        String select = "Select a from Associado as a ";
        String where = " where 1=1 ";

        if (!ValidatorUtil.isNullOrEmpty(nome)) {
            where += " AND a.nome LIKE '" + nome + "%' ";
        }

        if (!ValidatorUtil.isNullOrEmpty(cpf)) {
            where += " AND a.cpf LIKE '" + cpf + "%' ";
        }

        if (id != null && id > 0) {
            where += " AND a.id = " + id;
        }

        String orderBy = " ORDER BY a.id DESC";
        
        Query q = em.createQuery(select + where + orderBy);
        if (ValidatorUtil.isNullOrEmpty(nome) && ValidatorUtil.isNullOrEmpty(cpf) && (id == null || id <= 0)) {
          q.setMaxResults(50);
        }
        
        if ((!ValidatorUtil.isNullOrEmpty(nome) && nome.equals("*")) || (!ValidatorUtil.isNullOrEmpty(cpf) && cpf.equals("*"))) {
            retorno = findAllAssociados();
        }
        else {
            retorno = q.getResultList();
        }

        return retorno;
    }

    public List<Associado> findAllAssociados() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        EntityManager em = getEntityManager();
        List<Associado> retorno = new ArrayList<Associado>();
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }

        String sql = "SELECT a from Associado as a ORDER BY a.id";
        Query q = em.createQuery(sql);
        retorno = q.getResultList();

        return retorno;
    }
    
    /** </summary>
     * Método para buscar um ID, que também é utilizado como matrícula
     * </summary>
     */
    public Associado findById(int id) {
        Associado as = null;

        try {
            as = (Associado) super.findById(id, Associado.class);
        } catch (Exception ex) {
            System.out.println("Erro ao procurar o ID");
        }

        return as;
    }

    public void atualizaExpedicao(String data, int id) {
        EntityManager em = getEntityManager();
        String sql = "UPDATE Associado SET dataExpedicao = '" + data + "' WHERE id_Associado = " + id;
        
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
         
        em.createQuery(sql).executeUpdate();
        
        em.getTransaction().commit();

    }
}
