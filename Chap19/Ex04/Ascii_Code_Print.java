package Chap19.Ex04;

/*
	ASCII �ڵ� �� ��� : 1byte, ���� ó����Ʈ�� ��ȣ ��Ʈ, 7bit : 128�� ( 0 ~ 127)
		1 ~ 32��Ʈ������ : ����� �� �� ���� Ư���� �ڵ�, ��) null, ����� ����, �����(7) ���� 10, (LF) ...
		127 : delete.
		
		���� ��� ����� 33����Ʈ ~ 126��Ʈ
		����, ����, Ư������
		
		���
		=====================================
		ASCII	����			ASCII		����
		=====================================
		33		!			 34			&
		35 		#			 36			$
		...
		126

*/

public class Ascii_Code_Print {

	public static void main(String[] args) {
			System.out.println("==================================");
			System.out.println("ASCII	����		ASCII	����");
			System.out.println("==================================");
		for(int i=33; i<=126; i+=2) {
			System.out.println(i + "\t" + (char)i + "\t\t" + (i+1) + "\t" + (char)(i+1) );
		}

	}

}
