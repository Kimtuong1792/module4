<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới bài hát</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</body>
</html>
