package chap04;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {

		
		//1. switch ������ �ٲٱ�
		
		int num1 = 10;
		int num2 = 2;
		char operator = '+' ;
		int result = 0;
		switch(operator) {
		case '+':
			System.out.println(result = num1 + num2);
			break;
		case '-':
			System.out.println(result = num1 - num2);
			break;
		case '*':
			System.out.println(result = num1 * num2);
			break;
		case '/':
			System.out.println(result = num1 / num2);
			break;
		default :
			System.out.println("������ �����Դϴ�. ");			
		}
		System.out.println("��� ���� :" + result + " �Դϴ�");
		
		System.out.println();
		System.out.println("=======================");
		
		// 2. if������ Scanner �� �����ؼ� ��ǲ �޾Ƽ� ���
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���(if��)");	

		
		int numA = 10;
		int numB = 2;
		int result2 = 0;
		String operator2 = sc3.next();
		
		if( operator2 == "+") {
			result2 = numA + numB;
		}else if(operator2 == "-") {
			result2 = numA - numB;
		}else if(operator2 == "*") {
			result2 = numA * numB;
		}else if(operator2 == "/") {
			result2 = numA / numB;
		}else {
			System.out.println("������ �����Դϴ�. ");			
		
		}
		System.out.println("��� ���� :" + result2 + "�Դϴ�. ");
		
		System.out.println("===========================");
		
		
		
		//3. switch ������ ��ĳ�� ����
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���(switch��)");
		
		String operator3 = sc2.next();
		
		
		int num11 = 10;
		int num12 = 2;
		int result11 = 0;
		
		switch(operator3) {
		case "+":
			System.out.println(result11 = num11 + num12);
			break;
		case "-":
			System.out.println(result11 = num11 - num12);
			break;
		case "*":
			System.out.println(result11 = num11 * num12);
			break;
		case "/":
			System.out.println(result11 = num11 / num12);
			break;
		default :
			System.out.println("������ �����Դϴ�. ");
		}
		System.out.println("��� ���� :" + result11 + " �Դϴ�");
		
		
		
	}

}
