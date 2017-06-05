<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mapping</title>
</head>
<body>
<%--<%String name= request.getParameter("uname");
if(name.equals("varam")){
response.sendRedirect("http://www.javatpoint.com/response-implicit-object");
}
else{
	out.println("sorry" +name + "please enter valid name");
}
 %>--%>
 
<%--  <% out.println("welcome" +  request.getParameter("uname")); 
 
 String File=config.getInitParameter("dname");
 
	 out.println("File name is " +File );
 
 %>--%>
<%
String name=request.getParameter("uname");
out.println(name);

session.setAttribute("user", name);

%> 
 
 
</body>
</html>