package Chap19.Ex01;

import java.io.File;	//���ϰ� ������ �ٷ�� ��ü
import java.io.IOException;

//���� : ��Ŭ�������� ������ ������ C:\ �� �����Ҷ� ���� ������ ���� ������ �߻��� �� �ִ�.
	// 1. ��Ŭ������ <<�����ڱ���>> ���� ����
	// 2. ���� ���ο� ������ ����.

//File ��ü ���� ���� �ĺ��ڸ� ������ ���
//			 C:\abc\abc.txt  ����

	// 1. Windows �� ��� : String path = "C:\\abc\\abc.txt"   " " ���� Ư�����ڸ� ó���ϱ� ���� ��ȣ. \\
	//		Windows 10  : String path = "C:/abc/abc.txt"

	// 2. MAC �� ��� : String path = "C:/abc/abc.txt" 		 " " /

	// ȣȯ�� ���ؼ� ���������� ����� �� �ִ� �ڵ� �ۼ�.
		// String path = "C:" + File.separator + "abc" + File.separator + "abc.txt"

public class CreateFileObject {

	public static void main(String[] args) throws IOException {	
		
		//1. File ��ü�� ����ؼ� ���� ����.	�ش� �����̳� ������ �������� �ʴ� ���
		File tempDir = new File("C:/temp001");
		if(!tempDir.exists()) {			//�ش� ��ο� �����̳� ������ �����ϸ� true, false
			tempDir.mkdir();};			//���� ����
		
		System.out.println(tempDir.exists());  //������ ��ο� �����ϸ� true �ƴϸ� false
		
		//2. File ��ü�� ����ؼ� ���� ����
		File newFile = new File("C:/temp001/newfile.txt"); 		
		if (!newFile.exists()) {		
			newFile.createNewFile(); 	//������ ������ �� ���ܰ� �߻��� �� �ִ�. ����ó���� �ʿ�. ���ѹ���
		}
		System.out.println(newFile.exists());
		System.out.println();
		
		//3. ���� ������
		File newFile2 = new File("C:\\temp001\\newfile01.txt");	//Windows 10 ���� ����    \\
		File newFile3 = new File("C:/temp001/newfile02.txt");	// Windows 10, MAC 		/
		if(!newFile2.exists()) {newFile2.createNewFile();}
		if(!newFile3.exists()) {newFile3.createNewFile();}
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
		//��� OS ���� �������� �ĺ� ������ �ڵ�
		File newFile4 = new File("C:" + File.separator + "temp001" + File.separator + "newfile03.txt");
		if(!newFile4.exists()) {newFile4.createNewFile();}
		System.out.println(newFile4.exists());
		
		//4. ���� ��η� ó�� : �ٸ� �ý������� �̵��� ��� �� �ý��� ȯ�濡 �µ��� ������ �ʿ�.
		File newFile5 = new File("C:/temp001/newfile05.txt"); 	// ���� ��η� ó��
		System.out.println(newFile5.getAbsolutePath()); 	//file ��ü�� ����� ������ �����θ� ���.
		
		
		
		//5. ��� ��η� ó�� ==> ����
		//���� ���� �۾� ������ ��ġ�� �˾ƾ� �Ѵ�.
		System.out.println(System.getProperty("user.dir")); //���� �۾� ������ ��ġ
				//��Ŭ���� ���� ���� ��ġ
		File newFile6 = new File("newFile06.txt"); 			//��� ��η� ���.
		if(!newFile6.exists()) {newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
		
	}

}
