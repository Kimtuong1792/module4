<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 7/13/2022
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Từ điển đơn giản</title>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post">
    <input type="text" name="english" placeholder="Enter your word: "/><br>
    <input type="submit" id="submit" value="Search"/><br><br>
    <span style="font-size: larger">result : ${result}</span>
</form>
</body>
</html>
