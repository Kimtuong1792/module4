<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 05/05/2022
  Time: 10:26 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<form:form modelAttribute="mail" method="post" action="/edit">
    <div>
        <b>Languages : </b>
        <form:select path="languages">
            <form:option value="english" label="english"/>
            <form:option value="vietnamese" label="vietnamese"/>
            <form:option value="korea" label="korea"/>
        </form:select>
    </div>
    <br>
    <div>
        <b> Page Size: </b>
        <label>Show</label>
        <form:select path="pageSize">
            <form:option value="5" label="5"/>
            <form:option value="10" label="10"/>
            <form:option value="15" label="15"/>
            <form:option value="25" label="25"/>
            <form:option value="50" label="50"/>
            <form:option value="100" label="100"/>
        </form:select>
        emails per page

    </div>
    <br>
    <div>
        <b> Spams filter: </b>

        <form:checkbox path="spamsFillter" value="spamsFillter"/>
        Enable spams filter
    </div>
    <br>
    <div>
        <b> Signature: </b>

        <form:input path="signature" cssStyle="width:200px; height: 100px; "/>
    </div>
    <br>
    <div>
        <button type="submit">Send</button>
        <button type="reset"> cancel</button>
    </div>
</form:form>
<h4> Language : ${mail1.languages}</h4>

<br>
<h4> PageSize : ${mail1.pageSize}</h4>

<br>
<h4> SpamsFillter : ${mail1.spamsFillter}</h4>

<br>
<h4> Signature : ${mail1.signature}</h4>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</body>
</html>