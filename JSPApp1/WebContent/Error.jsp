<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"   errorPage="Directives.jsp"  %> %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String i= request.getParameter("number1");
String y=request.getParameter("number2");

int num1=Integer.parseInt(i);
int num2=Integer.parseInt(y);

int div=num1/num2;

out.println("value is " + div);
%>
</body>
</html>