<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tờ khai y tế</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h2 class="text-center">Danh sách tờ khai y tế</h2>
<table class="table table-light">
    <tr class="bg-primary">
        <th>STT</th>
        <th>Họ tên</th>
        <th>Năm sinh</th>
        <th>Giới tính</th>
        <th>Quốc gia</th>
        <th>Số CMND</th>
        <th>Phương tiện</th>
        <th>Số hiệu</th>
        <th>Số chỗ ngồi</th>
        <th>Ngày khởi hành</th>
        <th>Tháng khởi hành</th>
        <th>Năm khởi hành</th>
        <th>Ngày kết thúc</th>
        <th>Tháng kết thúc</th>
        <th>Năm kết thúc</th>
        <th>Thông tin di chuyển</th>
        <th>Chỉnh sửa</th>
    </tr>
    <c:forEach items="${medicalDeclarationList}" var="medical" varStatus="stt">
        <tr>
            <td>${stt.count}</td>
            <td>${medical.name}</td>
            <td>${medical.birthday}</td>
            <td>${medical.gender}</td>
            <td>${medical.country}</td>
            <td>${medical.identity}</td>
            <td>${medical.render}</td>
            <td>${medical.vehicleNumber}</td>
            <td>${medical.seats}</td>
            <td>${medical.starDay}</td>
            <td>${medical.starMonth}</td>
            <td>${medical.starYear}</td>
            <td>${medical.endDay}</td>
            <td>${medical.endMonth}</td>
            <td>${medical.endYear}</td>
            <td>${medical.information}</td>
            <td>
                <a href="/update?identity=${medical.identity}">
                    <button class="btn btn-info">
                        Sửa
                    </button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
<div class="container-fluid">
    <div class="row">
        <a href="/show-create">
            <button class="btn btn-info">
                Thêm mới
            </button>
        </a>
    </div>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>