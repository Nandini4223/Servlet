package com.wicore.app18.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(name="serv2",value="/s2")
public class ServletB extends GenericServlet{
	public void service(ServletRequest request,ServletResponse response)throws IOException{
		response.setContentType("text/HTML");
		PrintWriter pw=response.getWriter();
		pw.println("<h1>Response from ServletB");
		pw.flush();
		pw.close();

}
	}
