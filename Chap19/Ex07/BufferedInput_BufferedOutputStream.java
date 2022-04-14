package Chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


//�߰� ����� �����ϴ� ��Ʈ�� : ��ݽ�Ʈ���� �����ؾ��Ѵ�. �ܵ����� ����� �� ����.
//BufferedInputStream :  InputStream�� ���͸� �����ؼ� �б� ������ ���� ������ �� ��Ʈ��., �ܵ����� ����� �� ����. ��ݽ�Ʈ���� �߰����
//BufferedOutputStream : InputStream�� ���͸� �����ؼ� ���� ������ ���� ������ �� ��Ʈ��., �ܵ����� ����� �� ����. ��ݽ�Ʈ���� �߰����


public class BufferedInput_BufferedOutputStream {
	public static void main(String[] args) {
		//�������� ����, Buffered �� ������� �ʰ� ó���ϴ� ���, Bufferd�� ����ϴ� ��� �ӵ� ���� ��
		
		File orgfile = new File("src\\Chap19\\Ex07\\mycat_origin.jpg"); // ���� ����
		File copyfile1 = new File("src\\Chap19\\Ex07\\mycat_copy1.jpg"); // Buffered �� ������� �ʰ� ó���ϴ� ���
		File copyfile2 = new File("src\\Chap19\\Ex07\\mycat_copy2.jpg"); // Bufferd �� ����ϴ� ���
		
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
