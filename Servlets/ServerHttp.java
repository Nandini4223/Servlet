import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerHttp {
	private static boolean c;

	public static void main(String[] args) throws Exception{
		ServerSocket s=new ServerSocket(9090);
		
		while(c) {
			//always executing
			boolean b=true;
			System.out.printf("\n waiting for client request at port num:9090");
			Socket ss=s.accept();
			System.out.printf("\n received http request and sending http response");
			//prepare PrintStream to give response
			OutputStream out=ss.getOutputStream();
			PrintStream ps=new PrintStream(out);
			String htmlDoc="";
			htmlDoc="<html>\n"+"<body bgcolor=RED\n"+"<h1>hii,Welcome to NANO WICORE server\n"+"</body>\n"+"</html>\n";
			String rMsg="";
			rMsg="HTTP/1.1 200 OK\n"+
			     "Date:Fri,5nov2021 02:42:23 GMT\n"+
				 "Server:ServerHttp/1.0.0\n"+
			     "Last-Modified:Fri,5nov2021 02:42:27 GMT\n"+
				 "ETag:\"56d-9989200-1132c580\"\n"+
			     "Content-Type:text/html\n"+
				 "Content-Length:"+htmlDoc.length()+"\n"+
			     "Accept-Ranges:bytes\n"+
				 "Connection:close\n"+"\n"+
			     htmlDoc;
			ps.print(rMsg);
			ps.close();
			ss.close();
		}//end of while loop
	}//end of main
}//end of ServerHttp
			
