/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import java.util.ArrayList;
import java.util.List;
import store.dao.ArticleDAO;
import store.entity.Article;


/**
 *
 * @author admin
 */
public class ArticleService {

    public Article creer(String nomArticle, Long prixArticle, Long stockArticle) {
        
        ArticleDAO artDao = new ArticleDAO();
        
        Article articleCree = artDao.chercherArticleParNom(nomArticle);
        
        if(articleCree==null){
            
            Article artACreer = new Article();
            artACreer.setNom(nomArticle);
            artACreer.setPrix(prixArticle);
            artACreer.setStock(stockArticle);
            
            artDao.creerArticle(artACreer);
            
            articleCree = artDao.chercherArticleParNom(nomArticle);
        }
        else{
            articleCree = null;
        }
        return articleCree;
    }

    public List<Article> listerTout() {
        
        ArticleDAO ArtDao = new ArticleDAO();
        
        List <Article> tousArticles = ArtDao.listertout();
             
        return tousArticles;
    }
    
    
    
}
