<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="True"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Directives</title>
</head>
<body>

<%-- -- request and response 
<%String name=request.getParameter("uname");

if(name.equals("varam")){
	response.sendRedirect("http://www.javatpoint.com/exception-handling-in-jsp");
	}
else{
	out.println("sorry");
	}
%>--%>
<%--Config and context(Application) 
<%String message=config.getInitParameter("para");
out.println(message);
%>
<%String driver=application.getInitParameter("dbUrl"); 
out.println(driver);

%>--%>
<%-- 
<%String name=request.getParameter("uname");
out.println("hello" + name);

pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE); 

response.sendRedirect("NewFile.jsp");

%>--%>

<% out.println("Error Occured");
%>
Exeption is<%= exception %>

</body>
</html>