package com.wicore.App16;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(name="serv1", value="/s1")
public class ServletB extends GenericServlet {
	@Override
	public void service(ServletRequest request,ServletResponse response)throws IOException{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<h1>reequest parameters and its values");
		Enumeration<String> e=request.getParameterNames();
		while(e.hasMoreElements()) {
			String pn=e.nextElement();
			pw.print("<br><u>"+pn+"</u>");
			String pv[];
			pv=request.getParameterValues(pn);
			for(int i=0;i<pv.length;i++)
				pw.print("<br>"+pv[i]);
		}
		pw.flush();
		pw.close();
				
	}

}
