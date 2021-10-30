package Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo3 {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("con");
			byte b[]= {'n','a','r','e','s','h'};
			System.out.println("value in byte array b is:");
			for(int i=0;i<b.length;i++)
				System.out.print((char)b[i]);
			System.out.println("\n Enter 4 bytes");
			fin.read(b,2,4);
			System.out.println("after reading input into byte array b the value in byte array b is:");
			for(int i=0;i<b.length;i++)
				System.out.print((char)b[i]);
			fin.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
