<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loan Calculation</title>
</head>
<body>
    <header class="site-header">
        <div class="vertical">
            <h1 class="page-title">List of users and their privileges</h1>
        </div>
    </header>
        <table border="1">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Password</th>
                    <th>Email</th>
                    <th>User Type</th>
                    <th>Switch to Premium</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach items="${userList.users}" var="user">
                <tr>
                    <td>${user.name}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>        
</body>
</html>