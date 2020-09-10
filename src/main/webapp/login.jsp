<head>
<title>Login</title>
</head>
<%@ include file="header.jsp" %>
<body>
<h1>Login</h2>
<form action="login" name="loginForm" method="post">
<table>
<tr><td>Email:</td><td><input type="text" name="email"/></td></tr>
<tr><td>Password:</td><td><input type="text" name="password"/></td></tr>
<tr><td><input type="submit" value="submit"/></td></tr>
</table>
</form>
</body>
</html>