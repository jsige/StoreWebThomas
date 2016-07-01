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
import store.entity.Utilisateur;
import store.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setAttribute("erreur", "Le compte n'a pu être créé. Veuillez recommencer.");
        req.getRequestDispatcher("inscription.jsp").forward(req, resp);
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String mdp = req.getParameter("mdp");
        String confMdp = req.getParameter("conf_mdp");
        String adressse = req.getParameter("adresse");
        
        UtilisateurService utilServ = new UtilisateurService();
        
        Utilisateur nvUtil = utilServ.creerCompte(login, mdp, confMdp,adressse);
        
        if (nvUtil!=null){
            req.getSession().setAttribute("util", nvUtil);
            
            resp.sendRedirect("accueil_client");
        }
        else{
            req.setAttribute("erreur", "Le compte n'a pu être créé. Veuillez recommencer.");
            req.getRequestDispatcher("inscription.jsp").forward(req, resp);            
            //resp.sendRedirect("inscription");
        }
        
    }
}

