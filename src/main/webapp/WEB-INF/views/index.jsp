<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body> 
  <form:form method="post" action="recibe"  modelAttribute="persona">
  <table>
    
  	<tr>
  		<td>Nombre</td>
  		<td><form:input type="text"  path="nombre"/></td>
  	</tr>
  	<tr>
  	  <td>email</td>
  	  <td><form:input type="email"  path="email"/></td>
  	</tr>
  	<tr>
  	 <td><input type="submit" value="Enviar"/></td>	
  	</tr>
  </table>
  </form:form>
</body>
</html>

