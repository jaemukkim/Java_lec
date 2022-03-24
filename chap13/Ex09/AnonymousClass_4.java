package chap13.Ex09;

//매개변수로 받아서 처리 : 인터페이스를 구현한 클래스가 (x),

interface A {
	void abc(); 	//public abstract 생략됨
}
class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		C c = new C();
		//3. 인터페이스를 구현한 클래스 (x) + 참조변수 생성(O)
		A a = new A() {		//인터페이스를 구현한 자식 익명 객채생성후 타입을 A로 지정한 참조변수 생성
			@Override
			public void abc() {
				System.out.println("클래스(X) + 참조변수(O)");
			}
		};		
		c.cde(a);
		
		
		//4. 인터페이스를 구현한 클래스 (x) + 참조변수 생성(x)  <<== 제일 많이 사용(임시로 한번만 사용)
				//이벤트 처리 할때 사용.(일회성)
		
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("클래스(X) + 참조변수(X)");
			}
		});
		
		
		
	}

}
