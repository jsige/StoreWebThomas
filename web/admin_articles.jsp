<%-- 
    Document   : _TEMPLATE
    Created on : 17 juin 2016, 10:50:28
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenue sur le WebStore</title>
        <c:import url="_STYLESHEET.jsp" />
        
        
    </head>
    <body>
        <a href="accueil">
            <div class="titre">
                <c:import url="_TITRE.jsp" />
            </div>
        </a>
        <div class="menu">
            <c:import url="_MENU.jsp" />
        </div>
        <div class="contenu">
            <h1>Gestion des Articles</h1>
            <br />
            <br />

            <li>
                <ul>
                    <a href="AdminListerArticle">Lister les article</a>
                </ul>
                <ul>
                    <a href="AdminAjouterArticle">Ajouter un article</a>
                </ul>
                <ul>
                    <a href="AdminStock">Modifier un article</a>
                </ul>
<!--                <ul>
                    <a href="AdminCommandes">Gérer les commandes</a>
                </ul>-->
            </li>
            <h3>
                    
            </h3>
<!--            <form method="post">
                <h3>
                    Login : 
                    <input name="login">
                </h3>
                <h3>
                    Mot de passe : 
                    <input name="mdp">
                </h3>
                <br />
                <br />
                <input type="submit" value="Connexion" />
            </form> 
            <h3>
                <a href="creer_compte">Créer un compte</a>
            </h3>-->
             
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
