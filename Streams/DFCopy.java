package Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class DFCopy {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.printf("enter source file name(file size must be large):");
		String sfn=sc.nextLine();
		System.out.printf("enter destination file name including path:");
		String dfn=sc.nextLine();
		File sf=new File(sfn);
		File df=new File(dfn);
		if(sf.exists()&&sf.isFile()==false) {
			System.out.println("no such source file");
			return;//Stop main
		}
		if(df.createNewFile()==false) {
			System.out.println("destination file can not be created it is already exisiting");
			return;//Stop main
		}
		FileInputStream fin=new FileInputStream(sf);
		FileOutputStream fout=new FileOutputStream(df);
		long sfsize=sf.length();
		long count=0;
		System.out.println(new Date());
		int ch=fin.read();
		long pp=-1;
		while(ch!=-1) {
			fout.write(ch);
			count++;
			long percent=(100L*count)/sfsize;
			if(pp!=percent) {
				System.out.printf("\r%4d %% copying done", percent);
				pp=percent;
			}
			ch=fin.read();
		}
		System.out.println(new Date());
		fin.close();
		fout.close();
			}
		
		
	}


