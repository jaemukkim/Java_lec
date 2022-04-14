package Chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

//�ֿܼ��� �ѱ��� ��ǲ ���� ���� input.txt �� ���� ��, Charset : Default
//input.txt ���Ͽ��� ���� �о �ֿܼ� ���.

//1. System.in			: �ֿܼ��� ��ǲ
//2. FileOutputStream	: ��ǲ ���� ���� ���Ͽ� ����
//3. FileInputStream	: ����� ������ ������ �о�´�. 
//4. System.out			: �ֿܼ� ���


public class EX06_ConsoleInputOutPutObject {

	public static void main(String[] args) throws IOException {
/*		InputStream is = System.in;
		OutputStream os = System.out;
		System.out.println("�ѱ��� �Է��ϼ���.");
		
		
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
		
		
		
		//1. �ֿܼ��� �ѱ��� ��ǲ �޴´�.  (System.in)  ==> byte[] �迭�� �����ؼ� ó�� : �ѱ��� ó��
		InputStream is = System.in; 	//new�� �������� �ʰ� ���Ḹ ����, �ֿܼ��� ��ǲ ���� �޴´�.
		
		System.out.println("�ѱ��� �Է� �ϼ���.>>>");
		
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1); 	// byteArray1�� byte�� \r\n , count1 �迭�� ���� ���� ����,
//		int data = is.read(); 	// �ѱ��� ó������ ���Ѵ�., data���� 1byte read�� ���� ����.
		
		
		//2. ��ǲ���� �ѱ��� ���Ͽ� �����Ѵ�.
		File f1 = new File("src\\Chap19\\Ex06\\input.txt");
		OutputStream fos = new FileOutputStream(f1); //�⺻������ false ����� / true �̾�� 
		
		fos.write(byteArray1);	 //���� (RAM)���� ������.
		fos.flush();			 //���ۿ� ���� ������ ���Ͽ� ����.
		
				
		//3. ����� ���Ͽ��� ���� �о�´�.
		InputStream fis = new FileInputStream(f1); 	//read() ���� : �ѱ��� ó�� ����. read(byte[]) ó��
		byte[] byteArray2 = new byte[100];
		
		int count2 = fis.read(byteArray2); 	//read(byte[]) : �ѱ�ó�� 
		//int data2 = fis.read(); 			//read() : 1byte�� �о�´�.
		
		System.out.println();
		System.out.println("�ֿܼ��� �о�� ������ ����մϴ�.");
		System.out.println();
		
		//4. �о�� �迭�� �ֿܼ� ����Ѵ�.
		
		OutputStream os = new FileOutputStream(f1);
		os.write(byteArray2);
		os.flush();
		
		is.close();
		fos.close();
		fis.close();
		os.close();
		
		
		
		
		
	}

}
