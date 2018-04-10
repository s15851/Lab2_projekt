<%@ page contentType="text/html;charset=UTF-8" language="java" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <td>${user.name}</td>                    <td>${user.password}</td>                    <td>${user.email}</td>                    <td>${user.userType}</td>                    <td>						<form action="change_type" method="get">							<input type="submit" name="${user.name}" id="${user.name}" value="Switch"/>						</form>					</td>            
                </tr>
                </c:forEach>
            </tbody>
        </table>                <form action="try_login" method="get">			<input type="submit" value="Back to profile"/>		</form> 
</body>
</html>