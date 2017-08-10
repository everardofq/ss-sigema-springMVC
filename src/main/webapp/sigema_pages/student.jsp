<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Student Information</h2>
<form:form method="POST" action="/ss-sigema/addStudent">
   <table>
    <tr>
        <td><form:label path="nombre">Nombre</form:label></td>
        <td><form:input path="nombre" /></td>
    </tr>
    <tr>
        <td><form:label path="edad">Edad</form:label></td>
        <td><form:input path="edad" /></td>
    </tr>
    <tr>
        <td><form:label path="id">id</form:label></td>
        <td><form:input path="id" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>

</body>
</html>