package com.servers.app2.servlet;
import java.io.*;
import javax.servlet.*;
public class ServletA implements Servlet{
public void service(ServletRequest request,ServletResponse response)throws IOException{
response.setContentType("text/HTML");
PrintWriter pw=response.getWriter();
pw.println("<HTML>");
pw.println("<BODY bgcolor=YELLOW>");
pw.println("<h1> This is html response from ServletA");
pw.println("</BODY>");
pw.println("</HTML>");
pw.close();
}
public void init(ServletConfing cfg){}
public void destroy(){}
return "servlet developed by students";
}
public ServletCOnfig getServletConfig(){
return null;
}
}