/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.persistence.dao;

import com.rural.model.Associado;
import com.rural.model.Usuario;
import com.rural.persistence.Banco;
import com.rural.uteis.ValidatorUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author JoseVitor
 */
public class UsuarioDAO extends GenericDAO {

    public Usuario findByLoginSenha(String login, String senha) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        EntityManager em = getEntityManager();
        Usuario retorno = new Usuario();
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }

        String select = "Select u from Usuario as u ";
        String where = " where 1=1 AND u.login = '" + login + "' AND u.senha = '" + senha + "' ";

        Query q = em.createQuery(select + where);
        retorno = (Usuario) q.getSingleResult();

        return retorno;
    }

    public Usuario getCurrentUser() {
        return Banco.getCurrentUser();
    }

    public void setCurrentUser(Usuario user) {
        Banco.setCurrentUser(user);
    }
}
