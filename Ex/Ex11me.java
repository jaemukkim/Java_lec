package Ex;

import java.util.Scanner;

public class Ex11me {
	public static void main(String[] args) {
		//����11.  ���� �ڵ�� ���� ����� ������ �A�� �̷絵�� 2���� �迭�� �ۼ��϶�.
		
		System.out.println("���� �̸�");
		Scanner scan= new Scanner(System.in);
		int score =  scan.nextInt();
		String c = scan.next();
		String name;
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int scores[] = {95, 88, 76, 62, 55};
		
		for(int i=0; i<course.length; i++) {
			if(course[i].equals("Java")) {
				System.out.println("Java�� ������ "+scores[i]);
				return;
			}else if(course[i].equals("C++")){
				System.out.println("C++�� ������ "+scores[i]);
				return;
			}else if(course[i].equals("HTML5")) {
				System.out.println("HTML5�� ������ "+ scores[i]);
				return;
			}else if(course[i].equals("��ǻ�ͱ���")) {
				System.out.println("��ǻ�ͱ����� ������ "+scores[i]);
				return;
			}else if(course[i].equals("�ȵ���̵�")) {
				System.out.println("�ȵ���̵��� ������ "+scores[i]);
				return;
			}else {
				System.out.println("�����մϴ�.");
				break;
			}
		}	
		scan.close();
	}		
}
