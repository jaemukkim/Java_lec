package Chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out; 	//System.out : �ֿܼ� ���. byte ���.
		
		//1. 1-byte ���
		os.write('J');
		os.write('a');
		os.write('v');
		os.write('a');
		os.write('\r');
		os.write('\n'); 	//���ۿ����� ����Ǿ� �ִ�.
		
		os.flush(); 	//������ ������ �ֿܼ� ���		
//		os.close();
		
		//2. n-byte ���
		byte[] byteArray1 = "Hello!".getBytes();
		
		os.write(byteArray1);
		os.write('\n'); 	//\r\n
		os.flush();
		
		//3. n-byte ���
		byte[]	byteArray2 = "Better the last smile than the frist laughter".getBytes();
		os.write(byteArray2, 7, 8); 		//the last
		//write(byte�迭, offset, length);
		os.flush();
		
		os.close();
		
		
	}	

}
