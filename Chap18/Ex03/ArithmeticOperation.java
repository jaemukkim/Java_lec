package Chap18.Ex03;

import java.util.Scanner;

//1. ��ĳ�ʸ� ����ؼ� double�� �� ���� ��ǲ �޽��ϴ�.
//2. ���1. ���ٽ��� ����ؼ� ��ǲ���� �� ���� +, -, *, /, ��Ģ������ �����ؼ� ���.
//3. ���2. �������̽��� ������ �ڽ� ��ü�� ����ؼ�
//4. ���3. �͸��̳�Ŭ������ ����ؼ�  
//5. ArithmeticException ó�� : 0 ���� ������ ���ܹ߻�  /  int�� ��츸 , double �� ���� ����ó���� �Ǿ�����

@FunctionalInterface
interface Arithmetic {
	void arithmeticOpr(double a, double b);
}

class Ari implements Arithmetic {

	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("���ϱ� : " + (a + b));
		System.out.println("���� : " +(a - b));
		System.out.println("���ϱ� : " + (a * b));
		System.out.println("������ : " + (a / b));
	}
	
}



public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��Ͻÿ�");
		double Num = sc.nextDouble();
		double Num2 = sc.nextDouble();
		
		//1. ���ٽ�
		Arithmetic ari1 = ( a, b) -> { System.out.println("���ϱ� : " + (a + b));
										System.out.println("���� : " +(a - b));
										System.out.println("���ϱ� : " + (a * b));
										System.out.println("������ : " + (a / b));};
		ari1.arithmeticOpr(Num, Num2);
		
		System.out.println("===�������̽� �ڽ�Ŭ����===");
		//2.�������̽� �ڽ�
		Arithmetic ari2 = new Ari();
		ari2.arithmeticOpr(Num, Num2);
		
		System.out.println("====�͸��̳�Ŭ����===");
		//3.�͸��̳�Ŭ����
		Arithmetic ari3 = new Arithmetic() {			
			@Override
			public void arithmeticOpr(double a, double b) {
				System.out.println("���ϱ� : " + (a + b));
				System.out.println("���� : " + (a - b));
				System.out.println("���ϱ� : " + (a * b));
				System.out.println("������ : " + (a / b));
			}
		};
		ari3.arithmeticOpr(Num, Num2);
		
	/*
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		//���ٽ� : �������̽��� �߻�޼ҵ带 �͸� Ŭ������ ������ ���� ��� ǥ���̴�.
		
		Arithmetic a1 = (x,y) -> { System.out.println("a + b : " + (x+y) + " , " + "a - b : " + (x-y) +
								" , " + "a * b : " + (x*y) + " , " + "a / b : " + (x/y) );};
		a1.arithmeticOpr(a, b);						
		
		//�͸� �̳� Ŭ������ ���
		 		
		Arithmetic a3 = new Arithmetic() {

			@Override
			public void arithmeticOpr(double a, double b) {
				System.out.println("a + b : " + (a+b) + " , " + "a - b : " + (a-b) +
						" , " + "a * b : " + (a*b) + " , " + "a / b : " + (a/b) );
			}			
		};	a3.arithmeticOpr(a, b);	
				
	*/			
		
	}

}
