<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới bài hát</title>
</head>
<body>
<form:form modelAttribute="createMusic" action="create" method="post">

    Tên bài hát:
    <form:input path="nameMusic"/>
    <br>
    Nghệ sĩ thể hiện
    <form:input path="artist"/>
    <br>
    Thể loại nhạc (nhập thông tin dạng list)
    <form:input path="kindOfMusic"/>
    <br>
    Đường dẫn file bài hát
    <form:input path="link"/>
    <br>
    <button type="submit" value="save"> save </button>
</form:form>
</body>
</html>
