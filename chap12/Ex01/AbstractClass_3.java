package chap12.Ex01;

abstract class D {	//클래스 내부에 추상 메소드가 올 경우 abstract 클래스가 되어야 한다.
			//자식 클래스에서 반드시 오류없이 메소드를 재정의 하는것을 보장.
	
	abstract void print();		//추상 메소드, 구현부가 없는, 선언만 된 메소드
}

class E extends D {  //자식 클래스는 추상클래스의 메소드를 재정의.

	@Override
	void print() {
		System.out.println("E 클래스의 print()");
	}	  
	
}

public class AbstractClass_3 {

	public static void main(String[] args) {
		//1. 객체화 해서 출력. (객체 3개 생성후 print() 메소드 출력,타입은 D)
		D d1 = new E();
		D d2 = new E();
		D d3 = new E();
		d1.print();
		d2.print();
		d3.print();
		
		System.out.println("=========================");	
		
		//2. 익명 클래스를 생성해서 출력 (print() 메소드 3번출력
			//객체 생성없이 임시로 사용하는 경우
		
		
		D dd1 = new D() {
			void print() {
				System.out.println("안녕");
				System.out.println("하이");
				System.out.println("바이");
			}			
		};
		dd1.print();
		
	}

}
