
<%-- out object,--%>
<% 
out.println("welcome");
String driver=config.getInitParameter("dname");
out.println("<br> driver is "+driver);

String user=application.getInitParameter("user");
out.println("<br> user is "+user);
out.println("<br>");

session.setAttribute("dname", user);

pageContext.setAttribute("dname", user,PageContext.REQUEST_SCOPE);
  

%>
<a href="welcome1.jsp">second jsp page</a>  

<%= " <br> welcome "+ request.getParameter("uname")

%>


<%-- response
<%

String name=request.getParameter("uname");
if(name.equals("vakula")){
response.sendRedirect("https://www.google.co.in/webhp?hl=en&tab=ww&gws_rd=ssl") ;} %>
--%>
