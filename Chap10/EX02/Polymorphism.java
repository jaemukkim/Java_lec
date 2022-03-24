package chap10.Ex02;

//다형성(Polymorphism) : 객체의 상속 관계에서 여러 데이터 타입으로 변환 가능

class A{ }
class B extends A {}
class C extends B {}
class D extends B {}





public class Polymorphism {

	public static void main(String[] args) {
		
		//1. 업캐스팅 (자동으로 변환 ) : 생략시 컴파일러가 자동으로 추가;
		
		A ac = new C(); // C -> A : C는 A이다. / ac는 A,B,C 모두 포함하지만 A만 사용 가능
		A ab = new B(); // B -> A : B는 A이다. / ab는 A,B 를 포함하지만 A만 사용 가능
		B bd = new D(); // D -> B : D는 B이다. / bd는 A,B,D 를 포함하지만 A B 만 사용 가능
		C c = new C();  // C -> C : C는 C이다. / c 는 A,B,C 를 포함하고 A B C 모두 사용 가능 
		
		//2. 객체 생성을 할수 없는 경우 (상속)
//		B b = new A(); //오류	  / A는 B이다 X
//		C cc1 = new B();     // B는 C이다 X
//		D dd1 = new B();
//		C cd = new D();
		
		//3. 다운 캐스팅 : 부모 -> 자식 (수동으로 변환) : 캐스팅이 불가능 하면 (실행시 오류 발생 : 런타임 오류)
			//다운 캐스팅이 불가능한 경우 : 다운 캐스팅할 데이터 타입이 포함되어 있지 않는 경우
		A aa = new A(); //A만
//		B b1 = (B) aa;  // A -> B  다운캐스팅 (수동 변환), 실행시 오류 발생 
				//java.lang.ClassCastException : 다운 캐스팅시 객체 내의 해당 타입이 존재하지 않는 경우
//		C c2 = (C) aa; //aa는 C 타입을 내포하지 않는데 다운캐스팅 할경우, 실행시 오류 발생
		
		//컴파일 오류 : 프로그램을 실행전 이클립스가 체크
		//런타임 오류 : 실행시 발생되는 오류
		
		//4. 다운 캐스팅이 가능 한 경우(수동변환) : 객체 내부에 자식 데이터 타입을 가지고 있으면 캐스팅 가능
		A ac3 = new C(); //ac3는 A,B,C 포함. A,B,C 모두 사용 가능
		
		B ac5 = (B) ac3;	// A -> B
		C ac6 = (C) ac3;	// A -> C
		
		A ad2 = new D();	// ad2는 A,B,C 포함 / A만 사용 가능
		B bd3 = (B) ad2;	//
		D dd4 = (D) ad2;
		
		
		
		
		
		
	}

}
