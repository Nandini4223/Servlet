package Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo2 {
public static void main(String[] args) {
	try {
		FileInputStream fin;
		fin=new FileInputStream("con");
		byte b[]=new byte[5];
		System.out.println("Enter 5 bytes");
		fin.read(b);
		for(int i=0;i<b.length;i++)
			System.out.print((char)b[i]);
		fin.close();
	}catch(IOException ioe) {
		System.out.println(ioe.getMessage());
	}
}
}
