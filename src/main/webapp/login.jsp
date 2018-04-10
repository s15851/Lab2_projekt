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
            <h1 class="page-title">Log in</h1>
        </div>
    </header>
	<form action="try_login" method="get">
		<div><label>Username: <input type="text" id="name" name="name"/></label></div>
		<div><label>Password: <input type="text" id="password" name="password"/></label></div>
		<input type="submit" value="Send"/>
	</form>
</body>
</html>