<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login.jsp">
	<input type="text" name="firstName">
	<input type="text" name="lastName">
	<input type="submit">
	
	
	</form>
	<br>

	<%
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		String fullName = firstName + " " + lastName;
		if(firstName != null)
		{
			out.println(fullName.length() + fullName);
		}
		else
		{
			out.println("Your full name display here!");
		}
		
	%>
	
</body>
</html>