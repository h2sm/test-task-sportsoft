<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
    <style>
<%--        <%@include file="/css/style.css" %>--%>
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/registration" method="post" enctype="multipart/form-data">
    <label for="userFullName">Full name:
        <input type="text" name="userFullName" id="userFullName">
    </label><br>

    <label for="login">Login:
        <input type="email" name="email" id="login">
    </label><br>

    <label for="password">Password:
        <input type="password" name="password" id="password">
    </label><br>


    <label for="imageId">Image:
        <input type="file" name="image" id="imageId">
    </label><br>
    <button type="submit">Send</button>
    <c:if test="${not empty requestScope.errors}">
        <div style="color: red">
            <c:forEach var="error" items="${requestScope.errors}">
                <span>${error.message}</span><br>
            </c:forEach>
        </div>
    </c:if>
</form>

</body>
</html>
