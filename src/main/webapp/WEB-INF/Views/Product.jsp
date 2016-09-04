<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title></head>
<body>

       <div align="center">
<form:form method="POST" action="/HelloWeb/addStudent">
   <table>
    <tr>
        <td><form:label path="name">Product Name</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td><form:label path="price">Price</form:label></td>
        <td><form:input path="price" /></td>
    </tr>
    <tr>
        <td><form:label path="quti">Quentity</form:label></td>
        <td><form:input path="quti" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
            </div>
</body>
</html>