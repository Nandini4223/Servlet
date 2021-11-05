import java.net.*;
import java.io.*;
import java.util.*; 

public class TomNjerryServer{
public static void main(String[] args)throws Exception{
//binding server portnum
ServerSocket s=new ServerSocket(9091);
boolean b=true;
 while(b){//always executing
System.out.printf("\n TomNJerryServer waiting for client request at port num:9091");
Socket ss=s.accept();
System.out.printf("\n received http request and sending http response");
//prepare scanner to read input from client
InputStream in=ss.getInputStream();
Scanner sc=new Scanner(in);
String reqLine=sc.nextLine();
 StringTokenizer st=new StringTokenizer(reqLine);
String reqType=st.nextToken();
String uri=st.nextToken();
String protocol=st.nextToken();
uri="c:\\tomnjerry\\webapps"+uri;
String mimeType="";
if(uri.endsWith("html"))
mimeType="text/html";
 if(uri.endsWith("jpeg")||uri.endsWith("jpg")){
mimeType="image/jpeg";
System.out.println(mimeType);
}
String htmlDoc="";
try{
File f=new File(uri);
FileInputStream fin=new FileInputStream(uri);
int ch=0;
ch=fin.read();
while(ch!=-1){
htmlDoc+=(char)ch;
ch=fin.read();
}
}catch(FileNotFoundException e){
htmlDoc="<h1>ResourceNotFound!";
}
//prepare PrintStream to give response
OutputStream out=ss.getOutputStream();
PrintStream ps=new PrintStream(out);
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
			
