<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
		<title>Liste des rues</title>
    </head>
    <body>
    	   <a href="index.jsp">Page d'accueil</a>

        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>ID nom des rues</th>
                    <th>Id ville</th>
                    <th>Label nom des rues</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listStreet}" var="street">
                    <tr>
                        <td><c:out value="${street.id}"/></td>
                        <td><c:out value="${street.idStreetName}"/></td>
                        <td><c:out value="${street.idCity}"/></td>
                        <td><c:out value="${street.idStreetNameLabel}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
    </html>