package Chap19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
	Application Default : MS949
	
	Reader / Writer �� ���� Ŭ������ ����ϼ���.
	
	1. �ֿܼ��� �ѱ��� �о
		C:\Temp\a\aaa.txt (MS949)
		C:\Temp\b\bbb.txt (UTF-8)
		���Ͽ� ������.
		
		a, b ������ Application���� ����
		
	2. �� ���Ͽ��� ���� ������ �ֿܼ� ���� ���� ���	



*/

public class EX_Reader_Writer {

	public static void main(String[] args) {
		
		//1. �ֿܼ��� �ѱ� �б�
		File tempFile = new File("C:/Temp/a"); //MS949
		File tempFile2 = new File("C:/Temp/b"); //UTF-8
		
		if(!tempFile.exists()) {
			tempFile.mkdirs();};
		if(!tempFile2.exists()) {
			tempFile2.mkdirs();};
			
		File inFile = new File("C:/Temp/a/aaa.txt");
		File inFile2 = new File("C:/Temp/b/bbb.txt");
		
		
		
		
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			System.out.println("�ѱ��� �Է��ϼ��� >>");
			OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream(inFile));
			
			int data;
			while((data = isr.read()) != '\r') {
				System.out.print((char)data);
				osr.write((char)data);
				osr.flush();
			}
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) {}
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			System.out.println("�ѱ��� �Է��ϼ���222>>>");
			OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream(inFile2),"UTF-8");
			
			
			int data;
			while((data = isr.read()) != '\r') {
				System.out.print((char)data);
				osr.write((char)data);
				osr.flush();
			}
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e1) {}
		

				
		//2. �ֿܼ� ���.
//		try {
//			InputStream is = new FileInputStream(inFile);
//			InputStreamReader isr = new InputStreamReader(is, "MS949");
//			OutputStreamWriter pw = new OutputStreamWriter(System.out);		
//			
//			int data;
//			while((data = isr.read()) != -1) {
//				pw.write((char)data);
//				pw.flush();
//			}
//			System.out.println();
////			System.out.println(isr.getEncoding());
//		
//		} catch (Exception e) {}
//			
//			System.out.println("==========================");
//			
//			try (InputStream is = new FileInputStream(inFile2);
//				InputStreamReader isr = new InputStreamReader(is, "UTF-8");
//				OutputStreamWriter pw = new OutputStreamWriter(System.out);){
//				
//				
//				int data;
//				while((data = isr.read()) != -1) {
//					pw.write((char)data);
//					pw.flush();
//				}				
//				System.out.println();
////				System.out.println(isr.getEncoding());			
//				
//			} catch (Exception e1) {}
			
			

			
		
		
	}

}
