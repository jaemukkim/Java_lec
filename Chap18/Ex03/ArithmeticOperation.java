package Chap18.Ex03;

import java.util.Scanner;

//1. 스캐너를 사용해서 double의 두 수를 인풋 받습니다.
//2. 방법1. 람다식을 사용해서 인풋받은 두 값을 +, -, *, /, 사칙연산을 구현해서 출력.
//3. 방법2. 인터페이스를 구현한 자식 객체를 사용해서
//4. 방법3. 익명이너클래스를 사용해서  
//5. ArithmeticException 처리 : 0 으로 나누면 예외발생  /  int일 경우만 , double 인 경우는 예외처리가 되어있음

@FunctionalInterface
interface Arithmetic {
	void arithmeticOpr(double a, double b);
}

class Ari implements Arithmetic {

	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("더하기 : " + (a + b));
		System.out.println("빼기 : " +(a - b));
		System.out.println("곱하기 : " + (a * b));
		System.out.println("나누기 : " + (a / b));
	}
	
}



public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하시오");
		double Num = sc.nextDouble();
		double Num2 = sc.nextDouble();
		
		//1. 람다식
		Arithmetic ari1 = ( a, b) -> { System.out.println("더하기 : " + (a + b));
										System.out.println("빼기 : " +(a - b));
										System.out.println("곱하기 : " + (a * b));
										System.out.println("나누기 : " + (a / b));};
		ari1.arithmeticOpr(Num, Num2);
		
		System.out.println("===인터페이스 자식클래스===");
		//2.인터페이스 자식
		Arithmetic ari2 = new Ari();
		ari2.arithmeticOpr(Num, Num2);
		
		System.out.println("====익명이너클래스===");
		//3.익명이너클래스
		Arithmetic ari3 = new Arithmetic() {			
			@Override
			public void arithmeticOpr(double a, double b) {
				System.out.println("더하기 : " + (a + b));
				System.out.println("빼기 : " + (a - b));
				System.out.println("곱하기 : " + (a * b));
				System.out.println("나누기 : " + (a / b));
			}
		};
		ari3.arithmeticOpr(Num, Num2);
		
	/*
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		//람다식 : 인터페이스의 추상메소드를 익명 클래스로 생성한 것의 약식 표현이다.
		
		Arithmetic a1 = (x,y) -> { System.out.println("a + b : " + (x+y) + " , " + "a - b : " + (x-y) +
								" , " + "a * b : " + (x*y) + " , " + "a / b : " + (x/y) );};
		a1.arithmeticOpr(a, b);						
		
		//익명 이너 클래스로 출력
		 		
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
