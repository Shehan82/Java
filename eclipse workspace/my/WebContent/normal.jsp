<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Class.forName("com.mysql.jdbc.Driver");
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/forJava","root","");
	
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from student where id=1");
		
		rs.next();
	 %>
	 <div >
	 	Name: <h1 style="color:red"><%  out.println(rs.getString(3)); %></h1>
	 </div>
	 
</body>
</html>