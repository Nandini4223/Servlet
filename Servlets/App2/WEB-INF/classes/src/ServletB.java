package com.servers.app2.servlet;
import java.io.*;
import javax.servlet.*;
public class ServletB implements Servlet{
public void service(ServletRequest request,ServletResponse response)throws IOException{
response.setContentType("text/HTML");
PrintWriter pw=response.getWriter();
pw.println("This is plain text response from ServletB");
pw.close();
}
public void init(ServletConfig cfg){
}
public void destroy(){
}
public String getServletInfo(){
return "servlet developed by students";
}
public ServletConfig getServletConfig(){
return null;
}
}