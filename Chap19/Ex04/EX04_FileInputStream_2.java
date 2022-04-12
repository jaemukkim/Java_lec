package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// FileInputStream
// is1 : MS949 한글로 읽기 처리, try (with resource), 예외 처리.
// is2 : UTF-8 한글로 읽기 처리, try

public class EX04_FileInputStream_2 {

	public static void main(String[] args) {
		
		File inFile = new File("src\\Chap19\\Ex04\\files\\file-ms949.txt");
		byte[] arr = new byte[100];
		int count;
		int data;
		
		InputStream is =null;
		
		try (is = new FileInputStream(inFile);) {
			while((count = is.read(arr)) != -1)
				System.out.println(new String(arr, Charset.forName("MS949")));
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}
		

		
		is.close();
		
		
		File inFile2 = new File("src\\\\Chap19\\\\Ex04\\\\files\\\\file-utf-8.txt");
		byte[] arr2 = new byte[100];
		int count2;
		
		InputStream is2 = new FileInputStream(inFile);
		
		while((count2 = is2.read(arr)) != -1) {
			System.out.println(new String(arr2, Charset.forName("UTF-8")));
		}
		is2.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
