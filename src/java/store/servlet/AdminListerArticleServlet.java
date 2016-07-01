/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import store.entity.Article;
import store.service.ArticleService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AdminListerArticleServlet", urlPatterns = {"/AdminListerArticle"})
public class AdminListerArticleServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArticleService artServ = new ArticleService();
        
        List <Article> tousLesArticles = artServ.listerTout();
        
        req.setAttribute("articles", tousLesArticles);
        
        for(Article article : tousLesArticles){
            System.out.println(article.getId() + " // " + article.getNom() + " // " + article.getPrix() + " // " + article.getStock());
        }
        req.getRequestDispatcher("admin_lister_articles.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        

    }


    

   
}
