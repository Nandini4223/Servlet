package Streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("con");
			fout.write('a');
			fout.write('\n');
			fout.write('\r');
			byte b[]= {'l','a','n','g','u','a','g','e'};
			fout.write(b);
			fout.write('\n');
			fout.write('\r');
			fout.write(b,5,3);
			fout.close();
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
