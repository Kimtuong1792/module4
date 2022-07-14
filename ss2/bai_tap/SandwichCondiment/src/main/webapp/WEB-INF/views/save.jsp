<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 7/14/2022
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="save">
    <td><input type="checkbox" name="condiment" value="Lettuce">Lettuce</td>
    <td><input type="checkbox" name="condiment" value="Tomato">Tomato</td>
    <td><input type="checkbox" name="condiment" value="Mustard">Mustard</td>
    <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
    <td><input type="submit" value="save"></td>
<c:forEach items="condiment" var="eat">
    "${eat}"
</c:forEach>
</form>
</body>
</html>
