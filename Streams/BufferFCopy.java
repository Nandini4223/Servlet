package Streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class BufferFCopy {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.printf("enter source file name(file size must be large):");
		String sfn=sc.nextLine();
		System.out.printf("Enter destination file name including path:");
		String dfn=sc.nextLine();
		File sf=new File(sfn);
		File df=new File(dfn);
		if(sf.exists()&&sf.isFile()==false) {
			System.out.println("no such source file");
			return;//stops main
		}
		if(df.createNewFile()==false) {
			System.out.println("destination file can not be created");
			return;//Stop main
		}
		FileInputStream fin=new FileInputStream(sf);
		FileOutputStream fout=new FileOutputStream(df);
		BufferedInputStream bin=new BufferedInputStream(fin);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		long sfsize=sf.length();
		long count=0;
		System.out.println(new Date());
		int ch=bin.read();
		long pp=-1;
		while(ch!=-1) {
			bout.write(ch);
			count++;
			long percent=(100*count)/sfsize;
			if(pp!=percent) {
				System.out.printf("\r%4d %% copying done", percent);
				pp=percent;
			}
			ch=bin.read();
		}
		System.out.println(new Date());
		bin.close();
		bout.close();
		fin.close();
		fout.close();
			}
	}


