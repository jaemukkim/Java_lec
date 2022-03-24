package chap13.Ex07.Ex1;
//2. 인터페이스의 추상메소드를 구현한 <<익명내부클래스 생성>>후 호출 : 한번만 사용할 경우

interface A {	//인터페이스, 추상메소드를 정의
	public abstract void cry();	 //추상 메소드, public abstract
	void fly();
}

class B {
	A a = new A() {	//인터페이스는 객체화할 수 없다. 하지만 익명 내부클래스를 생성해서 구현.
		//A 인터페이스를 구현한 자식 클래스 블락 : 클래스 이름이 없다(컴파일러가 랜덤한 이름으로 자동으로 할당)
		 public void cry() {System.out.println("멍멍");};
		 public void fly() {System.out.println("개는 날지 못합니다.");};
	};	
	void abc() {
		a.cry();
		a.fly();
	}
	
	class C implements A {	//class C는 A인터페이스의 메소드를 구현 클래스
		@Override
		public void cry() {
			System.out.println("멍멍");
		}
		@Override
		public void fly() {
			System.out.println("날지 못합니다.");
		}
	}
}

public class AnonymousClass2_1 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();

	}

}
