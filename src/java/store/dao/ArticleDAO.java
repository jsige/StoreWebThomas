/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import store.entity.Article;
        
/**
 *
 * @author admin
 */
public class ArticleDAO {

    public Article chercherArticleParNom(String nomArticle) {
         try {
            EntityManager em = Persistence.createEntityManagerFactory("StoreWebThomasPU").createEntityManager();

            return (Article) em.createQuery("SELECT a FROM Article a WHERE a.nom=:nomArt").setParameter("nomArt", nomArticle).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public Article creerArticle(Article artACreer) {
        EntityManager em = Persistence.createEntityManagerFactory("StoreWebThomasPU").createEntityManager();
        
        em.getTransaction().begin();

        em.persist(artACreer);

        em.getTransaction().commit();

        return chercherArticleParNom(artACreer.getNom());
    }

    public List<Article> listertout() {
        EntityManager em = Persistence.createEntityManagerFactory("StoreWebThomasPU").createEntityManager();
        
        return em.createQuery("SELECT a FROM Article a").getResultList();
    }
    
}
