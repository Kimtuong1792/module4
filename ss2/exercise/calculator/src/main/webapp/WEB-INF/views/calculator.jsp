<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 7/14/2022
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Máy tính đon giản</title>
</head>
<body>
<form method="get" action="calculate">
    <h1> Calculator </h1>
    <input type="number" value="${num1}" name="num1">
    <input type="number" value="${num2}" name="num2"><br>
    <hr>
    <button name="string" value="add">Addition(+)</button>
    <button name="string" value="sub">Subtraction(-)</button>
    <button name="string" value="mul">Multiplication(*)</button>
    <button name="string" value="div">Division(/)</button>
    <br>
    <h2>result: ${result}</h2>
</form>
</body>
</html>
