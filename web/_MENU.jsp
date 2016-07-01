<%-- 
    Document   : _TITRE
    Created on : 17 juin 2016, 10:54:34
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${util==null}">
    <a href="accueil">Connexion</a>
</c:if>

<!--<a href="inscription">Inscription</a>-->
<c:if test="${util!=null}">
<a href="deconnexion">Déconnexion</a>
</c:if>

<%--<c:if test="${role=='admin'}">
    <a href="deconnexion">Déconnexion</a>
</c:if>--%>

