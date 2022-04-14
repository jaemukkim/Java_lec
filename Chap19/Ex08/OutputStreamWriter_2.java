package Chap19.Ex08;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
	Reader / Writer  :  추상 클래스, char를 처리(문자만 처리, 이미지X, MP3X) ..
	FileReader / FileWriter  :  완성된 클래스, Default Charset만 사용가능.
	InputStreamReader / OutputStreamWriter  :  읽을때 인코딩(MS949, UTF-8) 지정해서 읽기 가능. / 쓰기도 인코딩(MS949, UTF-8) 지정해서 쓰기 가능 
	
	주의 : System.in : 콘솔에서 입력, System.out : 콘솔에 출력  ==> Application 에서 한번 close되면 재사용 불가.  
		 System.in , System.out  ==> byte 읽기, byte 쓰기.
	
	
	
*/

public class OutputStreamWriter_2 {
	public static void main(String[] args) {
		
		//1. 콘솔 출력 (Application Default : MS949 ==> MS949)
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			
			osw.write("OutputStreamWriter1 예제 파일입니다. \n".toCharArray());   // String을 char배열에 저장
			osw.write("한글과 영문이 모두 포함되어있습니다.");	//String
			osw.write('\n'); 	//char 저장
			osw.write("Good Bye !!! \n\n"); // 버퍼 / 메모리에 쓰여진다.
			osw.flush();  //flush ==> 버퍼 / 메모리 내용을 콘솔에 출력
			
			
		} catch (Exception e) {}
		
		System.out.println("=======================");
		
		//2. 콘솔 출력 (Application Default : MS949 ==> UTF-8)
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			
			osw.write("OutputStreamWriter1 예제 파일입니다. \n".toCharArray());   // String을 char배열에 저장
			osw.write("한글과 영문이 모두 포함되어있습니다.");	//String
			osw.write('\n'); 	//char 저장
			osw.write("Good Bye !!! \n\n"); // 버퍼 / 메모리에 쓰여진다.
			osw.flush();  //flush ==> 버퍼 / 메모리 내용을 콘솔에 출력
			
			
		} catch (Exception e) {}
		
		
		
		
		
	}

}
