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
        <title>Liste des articles</title>
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
            <h2>Liste des articles</h2>
            <table>
                <th>
                <tr>
                    <td>
                        Nom
                    </td>
                    <td>
                        Prix
                    </td>
                    <td>
                        Stock
                    </td>
                </tr>
                </th>
                <c:forEach var="article" items="${articles}">
                    <tr>
                        <td>
                            ${article.nom}
                        </td>
                        <td>
                            ${article.prix}
                        </td>
                        <td>
                            ${article.stock}
                        </td>
                    </tr>
                </c:forEach>

            </table>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
