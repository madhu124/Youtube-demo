<%
String name=request.getParameter("uname");
response.setContentType("text/html");
out.println("welcome " +name);


%>