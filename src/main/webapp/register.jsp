<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="try_register" method="get">
		<div><label>Username: <input type="text" id="name" name="name"/></label></div>
		<div><label>Password: <input type="text" id="password" name="password"/></label></div>
		<div><label>Confirm Password: <input type="text" id="confirm_password" name="confirm_password"/></label></div>
		<div><label>Email: <input type="text" id="email" name="email"/></label></div>
		<input type="submit" value="Send"/>
	</form>
</body>
</html>