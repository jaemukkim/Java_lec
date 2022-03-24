package chap10.Ex01;

class Dog_sub extends Dog {
	int dog_sub;
	
	void dog_sub() {
		System.out.println("Dog의 자식 클래스 입니다.");
	}
}

class Tiger extends Animal {
	int leg;
	
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아 먹습니다.");
	}	
}
class Dog extends Animal{
	int dog;
	
	void dogEat() {
		System.out.println("개는 잡식성 입니다.");
	}
}
class Eagle extends Animal {
	int eagle;
	
	void eagleFly() {
		System.out.println("독수리는 날아 다닙니다.");
	}
	
}

public class Animal {
	String name;   //동물의 이름
	int age;	   //동물의 나이
	String color;	//동물의 색깔
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
	
	
	
	

	public static void main(String[] args) {
		
		//업캐스팅은 다형성으로 처리하기 때문에 아주아주 효율적으로 프로그래밍을 처리.
			//다형성 : 오버라이딩(상속)을 이용해서 상속에서 하나의 메소드로 여러 정보를 처리 ...
		
		
		//1. Animal 클래스 객체화
		Animal a1 = new Animal(); //자신의 필드와 메소드만 사용		
		
		//2. Dog 클래스를 Dog타입으로 객체화
		Dog d1 = new Dog();		//Animal, Dog의 필드와 메소드 사용
		
		//3. Dog를 Animal 타입으로 업캐스팅
		Animal a2 = new Dog();	//Dog는 Animal, Dog를 내포하고 있고, Animal의 필드와 메소드만 사용		
		
		//4. Dog_sub를 Animal 타입으로 업캐스팅
		Animal a3 = new Dog_sub(); //a3는 Animal, Dog, Dog_sub를 내포하고 있고, Animal의 필드와 메소드만 사용
			   a3.name = "요트세트리아"; //Animal
//			   a3.dog = 6;	//Dog 필드 (사용 불가)
		
		//5. Dog_sub를 Dog 데이터 타입으로 업캐스팅
		Dog d2 = new Dog_sub(); //d2는 Animal, Dog, Dog_sub를 내포하고 있고, Animal과 Dog의 필드와 메소드 사용
			d2.name = "셰퍼트"; //Animal;
			d2.dog = 5;		//Dog
//			d2.dog_sub = 3; //Dog_sub 는 사용 할 수 없다.
			
		
			//  Animal   <-- Dog  <-- Dog_sub
		//6. Dog_sub를 Dog_sub 데이터 타입으로 객체화
		Dog_sub ds1 = new Dog_sub();
			  //ds1은 Animal, Dog, Dog_sub  모두 다 사용 가능
		ds1.name = "진돗개"; //Animal 클래스의 필드
		ds1.age = 4;		//Animal		
		ds1.dog = 3;		//Dog 클래스의 필드
		ds1.dog_sub = 2;	//Dog_sub
		
	//상속에서 업캐스팅, 다운캐스팅
		
		
		//업캐스팅 : 자식타입의 데이터 타입에서 부모 데이터 타입으로 변환
			// 부모타입의 필드와 메소드만 사용 가능
			// 강제 타입 변환없이 자동으로 업캐스팅됨.
			// ds1은 Dog_sub의 데이터 타입을 가지고 있다. ( Animal, Dog, Dog_sub 모두 접근 가능)
				
			Dog ds1_c1 = ds1;	//업캐스팅 : Dog_sub --> Dog 타입으로 업캐스팅 (Animal, Dog)
				Dog ds2_c1 = (Dog)ds1; // <-- 강제 타입 변환 / 업캐스팅은 생략가능
			Animal ds1_c2 = ds1; //업캐스팅 : Dog_sub --> Animal 타입으로 업캐스팅 (Animal)
			
			
			//ds1 : Dog_sub (Animal, Dog, Dog_sub)
			//ds1_c1 : Dog (Animal, Dog)
			//ds1_c2 : Animal (Animal)
			
		
		//다운캐스팅 : 부모 데이터 타입을 다시 자식 데이터 타입으로 변환
			// () 강제로 타입 변환이 필요함.
			//a3는 Animal, Dog, Dog_sub 중 Animal 타입만 사용하도록 업캐스팅 되어있다.
			
			Dog a3_down1 = (Dog) a3; //a3 (Animal) -> a3_down1 (Dog)로 다운캐스팅
			Dog_sub a3_down2 = (Dog_sub) a3; //a3 (Animal) -> a3_down2 (Dog_sub)로 다운캐스팅
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
