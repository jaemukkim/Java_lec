package chap11.Ex06;

abstract class Animal {	//추상 클래스 : 추상 메소드가 하나이상 포함 되어있는 경우
						//추상 클래스는 객체 생성 불가, 타입은 사용 가능
							//자식클래스는 부모 클래스의 메소드를 구현시 오류를 방지
	String name;
	int age;
	
	abstract void cry(); //추상 메소드 : 구현부가 없는 메소드
		//void cry(){}  <== 일반 메소드 : 리터타입 메소드이름(입력매개변수) {구현코드}
	abstract void run();
	
	@Override
		public String toString() {
		 	return "이름 : " + name + " , 나이 : " + age;
		}
}
class Cat extends Animal {		//Cat은 Animal 상속 일부만 상속한 경우 추상 클래스
								//모두 추상 메소드를 구현한 경우는 콘크리트(완전히 구현된) 클래스
	Cat(String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {	//추상 메소드를 구현한 메소드
		System.out.println("야옹");		
	}

	@Override
	void run() {
		System.out.println("고양이는 재빨리 뜁니다.");		
	}
//	@Override
//	public String toString() {
//		return name + ", " +age;
//	}
	
}
class Tiger extends Animal {
	Tiger(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	void cry() {
		System.out.println("어흥");		
	}

	@Override
	void run() {
		System.out.println("호랑이는 빠르게 뜁니다.");
	}
//	@Override
//	public String toString() {
//		return name +" , " + age;
//	}
}
class Eagle extends Animal {
	Eagle(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("까악");
	}
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
//	@Override
//	public String toString() {
//		return name +" , "+ age;
//		
//	}
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat ("고양이", 10);
		Animal a2 = new Tiger("호랑이", 5);
		Animal a3 = new Eagle("독수리", 15);
		
		//1. Animal 배열 객체에 저장 후
		Animal[] arr = {a1, a2, a3};
		
		//2. For 문을 사용해서 객체를 출력시 이름과 나이를 출력, .cry(), run()
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);	//객체 출력, Animal의 toString()
			arr[i].cry();	//오버라이딩된 메소드 출력
			arr[i].run();	//
		}
		System.out.println("================================");		
		
		//3. Enhanced For 문을 사용해서 이름과 나이를 출력, .cry(), run()
		for(Animal k : arr) {
			System.out.println(k);
			k.cry();
			k.run();
		}
		

	}

}
