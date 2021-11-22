package com.wicore.app19.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(name="serv1",value="/s1")
public class ServletA extends GenericServlet{
	

	public void service(ServletRequest request,ServletResponse response)throws IOException{
		response.setContentType("text/HTML");
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("n1");
		String s2=request.getParameter("n2");
		String s3=request.getParameter("b");
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		if(s3.equals("add"))c=a+b;
		else if(s3.equals("subtract"))c=a-b;
		else;
		pw.println("<h1>result="+c);
		pw.flush();
		pw.close();
		
	}

}
