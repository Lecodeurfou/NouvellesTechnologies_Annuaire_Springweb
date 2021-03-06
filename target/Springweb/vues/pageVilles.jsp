<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
		<title>Liste des villes</title>
    </head>
    <body>
    	   <a href="index.jsp">Page d'accueil</a>

        <table border="1">
            <thead>
                <tr>
                	<th>Identifiant</th>
                    <th>Identifiant de la ville</th>
                    <th>Identifiant de la region</th>
                    <th>Code de la Ville</th>
                    <th>Nom de la ville</th>
                    <th>Nom de la ZIP</th>
                    <th>Identifiant de la ZIP</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listCity}" var="city">
                    <tr>
                        <td><c:out value="${city.id}"/></td>
                        <td><c:out value="${city.idCity}"/></td>
                        <td><c:out value="${city.idArea}"/></td>
                        <td><c:out value="${city.idRefcode}"/></td>
                        <td><c:out value="${city.idCityName}"/></td>
                        <td><c:out value="${city.idZiplabel}"/></td>
                        <td><c:out value="${city.idZip}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>