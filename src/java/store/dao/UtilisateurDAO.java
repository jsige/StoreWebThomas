/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import store.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurDAO {

    public Utilisateur rechercherParLogin(String login) {
        try{
            EntityManager em = Persistence.createEntityManagerFactory("StoreWebThomasPU").createEntityManager();
        
            return (Utilisateur) em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:uLogin").setParameter("uLogin", login).getSingleResult();
    } catch(NoResultException e) {
        return null;
    }
        
        
    }
    
}
