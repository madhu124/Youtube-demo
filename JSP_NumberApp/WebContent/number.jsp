<%
int n1=Integer.parseInt(request.getParameter("t1"));
int n2=Integer.parseInt(request.getParameter("t2"));
String button= request.getParameter("click");
if(button.equals("ADD"))
{
	out.println("result is " +(n1+n2));
}
else{
	out.println("result is " +(n1-n2));

}


%>