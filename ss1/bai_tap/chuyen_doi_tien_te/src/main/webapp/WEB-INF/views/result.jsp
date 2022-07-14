<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 7/13/2022
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form method="post">
    <label>USD: </label>
    <input type="text" name="usd" placeholder="USD" value="${usd}" /><br/><br/>
    <label>VND: </label>
    <input type="text" name="result" value="${results}"  placeholder="VND"><br><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>
