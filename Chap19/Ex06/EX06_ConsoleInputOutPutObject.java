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

//1. System.in
//2. FileOutputStream
//3. FileInputStream
//4. System.out


public class EX06_ConsoleInputOutPutObject {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		OutputStream os = System.out;
		System.out.println("한글을 입력하세요.");
		
		
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);
		
		
		File out = new File("src\\Chap19\\Ex06\\input.txt");
		OutputStream os1 = new FileOutputStream(out);		
		os.write(byteArray1);
		os.flush();		
		
		
		byte[] by = is.getBytes(Charset.defaultCharset());
		
		os.write(by);
		os.write('\n');
		
		os.flush();
		
		InputStream in = new FileInputStream(out);
		
	}

}
