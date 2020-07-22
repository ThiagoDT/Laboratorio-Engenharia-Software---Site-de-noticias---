/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Thiago
 */
public abstract class Factory {
    protected EntityManager entityManager;
    protected Factory(){
        entityManager=criarConexao();
    }
    
    protected EntityManager criarConexao(){
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("persistencia_simples");
        if(entityManager == null)
            entityManager = factory.createEntityManager();
        return entityManager;
    }
    
}
