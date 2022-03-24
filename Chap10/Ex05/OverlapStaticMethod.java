package chap10.Ex05;

class AAAA {				//static 메소드 : 오버라이딩 되지 않는다.
	static void print() {		
		System.out.println("A 클래스");
	}
}
class BBBB extends AAAA {
	static void print() {
		System.out.println("B 클래스");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		//1. 객체 생성 없이 호출 : 권장사항
		AAAA.print();
		BBBB.print();
		System.out.println("===================");
		
		//2. 객체 생성후 호출
		AAAA aaaa = new AAAA();
		aaaa.print();
		BBBB bbbb = new BBBB();
		bbbb.print();
		AAAA aabb = new BBBB();
		aabb.print();			// static 메소드는 오버라이딩 X
		
		
				
		
		
		
		
	}

}
