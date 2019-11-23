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
                    <th>Identifiant de la rue</th>
                    <th>Code de la rue</th>
                    <th>Nom de la rue</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listStreat}" var="rue">
                    <tr>
                        <td><c:out value="${streat.idstreat}"/></td>
                        <td><c:out value="${streat.codestreat}"/></td>
                        <td><c:out value="${streat.namestreat}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>