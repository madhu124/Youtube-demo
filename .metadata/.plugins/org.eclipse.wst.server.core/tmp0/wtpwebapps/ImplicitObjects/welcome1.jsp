<%
String name=(String)session.getAttribute("dname");
out.println("session driver name is "+name);

String dname=(String)pageContext.getAttribute("dname",PageContext.SESSION_SCOPE);
out.println("<br> page context driver name is "+dname);

%>