<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Liste des régions</title>
</head>
<body>
<a href="index.jsp">Page d'accueil</a>

<table border="1">
<thead>
	<tr>
		<th> Identifiant région </th>
		<th> Identifiant pays </th>
		<th> Identifiant langage </th>
		<th> Identifiant label</th>
	</tr>
</thead>
		<tbody> 
		  <c:forEach items="${listArea}" var="area">
		<tr>
		
			<td><c:out value="${area.idArea}"/></td>
			<td><c:out value="${area.idCountry}"/></td>
			<td><c:out value="${area.idLanguage}"/></td>
			<td><c:out value="${area.idLabel}"/></td>
		</tr>
		</c:forEach>
		</tbody>
		</table>
</body>
</html>