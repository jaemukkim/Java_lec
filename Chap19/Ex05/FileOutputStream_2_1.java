package Chap19.Ex05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_2_1 {

	public static void main(String[] args) throws IOException {
		//1. 저장할 파일 생성.
				File outFile = new File("src/Chap19/Ex05/FileOutput2_1.txt"); //기본적으로 이클립스의 default charactorSet으로 저장.
				
				//2. n-byte 단위 쓰기 처리 (byte[] 의 처음부터 끝까지 쓰기)
				OutputStream os2 = new FileOutputStream(outFile);
				byte[]	byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8")); 	//String ==> byte[]에 저장 : getByte(),
						//한자에 2byte 씩 처리됨. 총 10byte
				os2.write(byteArray1);
				os2.write('\n');
				
				os2.flush();
				os2.close();
				
				
				//3. n-byte 쓰기 (byte[]의 offset 부터 length개의 바이트에 데이터 쓰기
				
				OutputStream os3 = new FileOutputStream(outFile, true); //이어서 쓰기.
//				byte[] byteArray2 = "반갑습니다".getBytes(Charset.forName("UTF-8"));
				byte[] byteArray2 = "반갑습니다".getBytes(Charset.defaultCharset()); 	//기본 charset으로 가져오기
				os3.write(byteArray2, 6, 5); 	//2byte 띄우고 2 byte를 읽는다.
					//write(byte배열, offset, length)
				
				//영어, 숫자, 특수문자 <== ASCII 코드로 1byte
				
				System.out.println(Charset.defaultCharset());
				
				os3.flush();
				os3.close(); 

	}

}
