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
@WebServlet(name = "AccueilServlet", urlPatterns = {"/accueil"})
public class AccueilServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("accueil.jsp").forward(req, resp);
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().removeAttribute("TypeUtil");
        String login = req.getParameter("login");
        String mdp = req.getParameter("mdp");
        
        UtilisateurService utilServ = new UtilisateurService();
        
        Utilisateur utilLogge = utilServ.ControlerLoginMdp(login,mdp);
        
        if(utilLogge!=null){
            req.getSession().setAttribute("util", utilLogge);
            
            resp.sendRedirect("accueil_client");
        }
        else{
            resp.sendRedirect("accueil");
        }
    }
}
