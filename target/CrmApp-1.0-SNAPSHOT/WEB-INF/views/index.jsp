<%--
  Created by IntelliJ IDEA.
  User: vampirec
  Date: 13/09/2018
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>index</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body class="bg-dark text-white">
<%@include file="parts/header.jsp" %><br>
<h3 style="text-align:center">Lista aktualnie prowadzonych napraw: </h3><br>
<div class="container">
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Data przyjęcia</th>
            <th>Data rozpoczęcia naprawy</th>
            <th>Id Pracownika</th>
            <th>Opis usterki</th>
            <th>Opis naprawy</th>
            <th>Status naprawy</th>
            <th>Id pojazdu</th>
            <th>Koszt naprawy</th>
            <th>Koszt częsci</th>
            <th>Ilość roboczogodzin</th>
            <th>Ilość godzin</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${orders}" var="orders">
            <tr>

                <td>${orders.id}</td>
                <td>${orders.acceptanceDate}</td>
                <td>${orders.startDate}</td>
                <td>${orders.workerId}</td>
                <td>${orders.problemDescription}</td>
                <td>${orders.repairDescription}</td>
                <td>${orders.status}</td>
                <td>${orders.vehicleId}</td>
                <td>${orders.repairCost}</td>
                <td>${orders.partsCost}</td>
                <td>${orders.payableHour}</td>
                <td>${orders.hours}</td>

            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>


<%@include file="parts/footer.jsp" %>
</body>
</html>
