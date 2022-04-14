package Chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Eclipse_Copy_Test {

	public static void main(String[] args) {
		File orgfile = new File("C:\\Temp\\copy_test\\eclipse_origin.exe"); // ���� ����
		File copyfile1 = new File("C:\\Temp\\copy_test\\eclipse_copy1.exe"); // Buffered �� ������� �ʰ� ó���ϴ� ���
		File copyfile2 = new File("C:\\Temp\\copy_test\\eclipse_copy2.exe"); // Bufferd �� ����ϴ� ���
		
		//���� ������ �ϱ����� ���� ����.
		long start, end, time1, time2 ; 	//time1 : Buffered(x),  time2 : Buffered(o)
		
		//1. Buffered �� ������� �ʰ� ó���ϴ� ��� (BufferedInputStream, BufferedOutStream)
		start = System.nanoTime(); 	//���� �ð�
		
		try (InputStream is = new FileInputStream(orgfile);		//Auto close()
			OutputStream os = new FileOutputStream(copyfile1);	//Auto close()
				){
			//������ ���� �ڵ� ����.
			int data;
			while((data = is.read()) != -1) { 	//is ���� 1byte �о,  -1�� ���������� 
				os.write(data);					//os �� 1byte ����
			}
			
		} catch (IOException e) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream : " + time1);  //���۸� ������� �ʰ� ����. copy1.jpg		
		
		//2. Buffered�� ����ϸ鼭 ó���ϴ� ��� (BufferedInputStream, BufferedOutputStream)
		start = System.nanoTime();
		
		try (InputStream is = new FileInputStream(orgfile);			//��� ��Ʈ��
			BufferedInputStream bis = new BufferedInputStream(is);	//�߰� ����� �����ϴ� ��Ʈ��. ������ ������ ó��.(Buffer ���)
			OutputStream os = new FileOutputStream(copyfile2);		//��� ��Ʈ��
			BufferedOutputStream bos = new BufferedOutputStream(os); //�߰� ����� ���� (����)
				){
			//������ �ڵ� ����
			int data;
			while((data = bis.read()) != -1) {	//���۸� ����ؼ� �б� (������)
				bos.write(data);					//���۸� ����ؼ� ���� (����)
			}
			
		} catch (IOException e) {}
			
			end = System.nanoTime();
			time2 = end - start;
			System.out.println("Without BufferedXXXStream : " + time2);
			
			//Buffered ����� ��� (time2), ������� ���� ��� (time1) �� ����
			System.out.println("�ӵ� ���� �� �� " + (time1 / time2) + " ����");
		
		
		

	}

}
