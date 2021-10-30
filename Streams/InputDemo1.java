package Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo1 {    
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("con");
			System.out.print("Enter a byte:");
			int ch=fin.read();
			System.out.println("ch="+ch);
			System.out.println("ch="+(char)ch);
			fin.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
