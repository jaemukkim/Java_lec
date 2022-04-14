package Chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

//콘솔에서 한글을 인풋 받은 값을 input.txt 에 저장 후, Charset : Default
//input.txt 파일에서 값을 읽어서 콘솔에 출력.

//1. System.in			: 콘솔에서 인풋
//2. FileOutputStream	: 인풋 받은 값을 파일에 저장
//3. FileInputStream	: 저장된 파일의 내용을 읽어온다. 
//4. System.out			: 콘솔에 출력


public class EX06_ConsoleInputOutPutObject {

	public static void main(String[] args) throws IOException {
/*		InputStream is = System.in;
		OutputStream os = System.out;
		System.out.println("한글을 입력하세요.");
		
		
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);
		
		
		File out = new File("src\\Chap19\\Ex06\\input.txt");
		OutputStream os1 = new FileOutputStream(out);		
		os.write(byteArray1);
		os.flush();		
		
		
		InputStream in = new FileInputStream(out);
		byte[] by = is.getBytes(Charset.defaultCharset());
		
		os.write(by);
		os.write('\n');
		
		os.flush();
		
*/		
		
		
		
		//1. 콘솔에서 한글을 인풋 받는다.  (System.in)  ==> byte[] 배열을 생성해서 처리 : 한글을 처리
		InputStream is = System.in; 	//new로 생성하지 않고 연결만 설정, 콘솔에서 인풋 값을 받는다.
		
		System.out.println("한글을 입력 하세요.>>>");
		
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1); 	// byteArray1에 byte로 \r\n , count1 배열에 값이 들어온 개수,
//		int data = is.read(); 	// 한글을 처리하지 못한다., data에는 1byte read한 값이 저장.
		
		
		//2. 인풋받은 한글을 파일에 저장한다.
		File f1 = new File("src\\Chap19\\Ex06\\input.txt");
		OutputStream fos = new FileOutputStream(f1); //기본적으로 false 덮어쓰기 / true 이어쓰기 
		
		fos.write(byteArray1);	 //버퍼 (RAM)에만 쓰여짐.
		fos.flush();			 //버퍼에 쓰인 내용을 파일에 쓰기.
		
				
		//3. 저장된 파일에서 값을 읽어온다.
		InputStream fis = new FileInputStream(f1); 	//read() 쓰면 : 한글을 처리 못함. read(byte[]) 처리
		byte[] byteArray2 = new byte[100];
		
		int count2 = fis.read(byteArray2); 	//read(byte[]) : 한글처리 
		//int data2 = fis.read(); 			//read() : 1byte씩 읽어온다.
		
		System.out.println();
		System.out.println("콘솔에서 읽어온 내용을 출력합니다.");
		System.out.println();
		
		//4. 읽어온 배열을 콘솔에 출력한다.
		
		OutputStream os = new FileOutputStream(f1);
		os.write(byteArray2);
		os.flush();
		
		is.close();
		fos.close();
		fis.close();
		os.close();
		
		
		
		
		
	}

}
