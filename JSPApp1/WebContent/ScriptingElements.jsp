<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Expression</title>
</head>
<body>
<%-- Scrpting expression

<%! public int x=5 ;
<%= new String("vakula")  %>
<br></br>
<%= new java.util.Date() %>
<br></br>
2 greate than 5 ? <%= 2>5 %>
<br></br>

<%=2*6 %>
<br></br>

<% out.println("Hello World"); %>
<br></br>
<%= "Hello" %>
<br></br>
<% if(2>5){
	
	out.println("True");
}
else
	out.println("False");
	%>--%>
<%--scirplet

<% for(int i=1;i<=10;i++){
	out.println("<br></br>");
	out.println("JSP" +i);
	
}


--%>
<%-- Declarations

<%!
int a,b;
int add(int a,int b){
	return a+b;
}

%>

<%= " adiition of 5 and 6 is "+add(5,6)
%>
--%>

<%@page import="java.util.Date" %>
Today is <%=new Date() %>
<br></br>

<%@ page contentType="text/html; charset=ISO-8859-1" %>
<%= new java.util.Date() %>
<br></br>

<%@ page info="This is a info tag" %>
<%= getServletInfo() %>





</body>
</html>