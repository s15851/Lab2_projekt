<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <header class="site-header">
        <div class="vertical">
            <h1 class="page-title">My profile</h1>
        </div>
    </header>
		<table>
            <tr>
                <th width="150">Your name</th>
                <td>${currentUser.name}</td>
            </tr>
            <tr>
                <th>Your password</th>
                <td>${currentUser.password}</td>
            </tr>   
            <tr>
                <th>Your email</th>
                <td>${currentUser.email}</td>
            </tr>
		</table>
		
		<form action="premium" method="get">
			<input type="submit" value="Premium site"/>
		</form>
		<form action="add_premium" method="get">
			<input type="submit" value="Add Premium users"/>
		</form> 
		<form action="logout" method="get">
			<input type="submit" value="Logout"/>
		</form> 		
</body>
</html>