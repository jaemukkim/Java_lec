package chap03;

import java.util.Scanner;

public class Pratice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���!");
		
		int a = sc.nextInt();
		if( a % 7 == 0) {
			System.out.println("7�� ��� �Դϴ�"); //��
		}else {
			System.out.println("7�� ����� �ƴմϴ�"); //����
		}
			

	}
	
}
