package chap04;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {

		
		//1. switch 문으로 바꾸기
		
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
			System.out.println("연산자 오류입니다. ");			
		}
		System.out.println("결과 값은 :" + result + " 입니다");
		
		System.out.println();
		System.out.println("=======================");
		
		// 2. if문에서 Scanner 를 장착해서 인풋 받아서 사용
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("값을 입력하세요(if문)");	

		
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
			System.out.println("연산자 오류입니다. ");			
		
		}
		System.out.println("결과 값은 :" + result2 + "입니다. ");
		
		System.out.println("===========================");
		
		
		
		//3. switch 문에서 스캐너 장착
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("값을 입력하세요(switch문)");
		
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
			System.out.println("연산자 오류입니다. ");
		}
		System.out.println("결과 값은 :" + result11 + " 입니다");
		
		
		
	}

}
