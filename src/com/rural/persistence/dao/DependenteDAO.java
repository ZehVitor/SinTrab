/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rural.persistence.dao;

import com.rural.model.Dependente;

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

}
