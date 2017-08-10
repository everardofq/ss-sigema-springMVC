<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>
<div align="center">
	<h2>SIGEMA LOGIN</h2>
<form:form method="POST"  action="/ss-sigema/signIn" modelAttribute="login">
   <table>
    <tr>
        <td><form:label path="user">Usuario</form:label></td>
        <td><form:input path="user" /></td>
    </tr>
    <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:password path="password"  /></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
        	<br/>
        	<br/>
            <input type="submit" value="Ingresar"/>
        </td>
    </tr>
</table>  
</form:form>
</div>
</body>
</html>