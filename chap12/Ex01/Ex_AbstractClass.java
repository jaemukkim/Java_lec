package chap12.Ex01;

abstract class Abc {
	abstract void cry();	//
	abstract void fly();
}
class Cat extends Abc{

	@Override
	void cry() {
		System.out.println("야옹");
	}
	@Override
	void fly() {
		System.out.println("고양이는 하늘을 날지 못합니다.");
	}	
}
class Eagle extends Abc{

	@Override
	void cry() {
		System.out.println("까악");
	}
	@Override
	void fly() {
		System.out.println("독수리는 하늘을 날 수 있습니다.");		
	}
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
		//1. 자식 클래스 Cat,Eagle 클래스를 생성 후 출력 
		Abc a1 = new Cat();
		Abc a2 = new Eagle(); 
		a1.cry();
		a1.fly();
		a2.cry();
		a2.fly();
		
		System.out.println("==========================");
		//2. 익명 클래스 생성후 출력,
		Abc a3 = new Cat() {
			void cry() {
				System.out.println("야옹");
			}
			void fly() {
				System.out.println("고양이는 하늘을 날지 못합니다.");
			}
		};
		Abc a4 = new Eagle() {
			void cry() {
				System.out.println("까악");
			}
			void fly() {
				System.out.println("독수리는 하늘을 날수 있습니다.");
			}
		};
		a3.cry();
		a3.fly();
		a4.cry();
		a4.fly();
		

	}

}
