/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AdminAjouterArticleServlet", urlPatterns = {"/AdminAjouterArticle"})
public class AdminAjouterArticleServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("admin_ajouter_article.jsp").forward(req, resp);
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomArticle = req.getParameter("nom_article");
        Long prixArticle = Long.parseLong(req.getParameter("prix_article"));
        Long stockArticle = Long.parseLong(req.getParameter("stock_article"));        
        
        ArticleService artServ = new ArticleService();
        
        Article artCree = artServ.creer(nomArticle, prixArticle, stockArticle);
        
        if (artCree!=null){
            req.setAttribute("message_creation_article", "L'article " + artCree.getNom() + " a bien été créé");
            req.getRequestDispatcher("admin_ajouter_article.jsp").forward(req, resp);
        }
        else{
            req.setAttribute("message_creation_article", "Une erreur s'est produite lors de la création de l'article. Veuillez recommencer.");
            req.getRequestDispatcher("admin_ajouter_article.jsp").forward(req, resp);            
            //resp.sendRedirect("inscription");
        }
    }
}
