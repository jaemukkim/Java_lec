package chap13.Ex10;
//이너 인터페이스(InnerInterface) : 클래스 내부의 인터페이스가 선언, 외부클래스 간단하게 사용할 목적
	//클래스 내부에 선언.
	//static이 자동으로 컴파일러에 의해서 생성.  <== 주의

class A {
	interface B {	//static이 컴파일러에 의해서 자동으로 추가됨
		void bcd ();	//public abstract 생략됨
	}
}

//이너 인터페이스를 구현한 클래스 C
class C implements A.B {	//A.B : A클래스의 이너인터페이스B, A,B : A인터페이스, B인터페이스
	@Override
	public void bcd() {
		System.out.println("이너 인터페이스를 구현한 클래스 C");
	} 	
}

public class InnerInterface_1 {

	public static void main(String[] args) {
		//1. 자식 객체를 직접 생성 후 출력 (자식클래스가 구현된 경우)
		A.B ab = new C(); //부모의 타입으로 업캐스팅 후 오버라이딩
		ab.bcd();
		C c = new C();	//C 자신의 메소드를 호출
		c.bcd();
		
		//2. 익명 이너클래스로 출력 (자식클래스 없이 출력)
		A.B b = new A.B() { //A.B : A클래스 내부의 인터페이스B(이너인터페이스)
			@Override
			public void bcd() {
				System.out.println("익명 이너클래스로 객체 생성후 출력");
			}
		};
		b.bcd();
		
	}

}
