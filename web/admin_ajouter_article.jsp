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
        <title>Inscrivez-vous sur le WebStore</title>
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
            <h1>Ajouter un article au StoreWeb</h1>
            <br />
            <h2>
                ${message_creation_article}
            </h2>
            <br />
            <h2>Veuillez renseigner les champs suivants</h2> 
            <br />
            <br />
            <form method="post">
                <h3>
                    Nom de l'article : 
                    <input name="nom_article">
                </h3>
                <h3>
                    Prix unitaire : 
                    <input name="prix_article">
                </h3>
                <h3>
                    Quantité en stock : 
                    <input name="stock_article">
                </h3>
                <br />
                <br />
                <input type="submit" value="Créer l'article" />
            </form> 
            
             
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
