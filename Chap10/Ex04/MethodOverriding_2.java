package chap10.Ex04;

class Animal2 {
	void run() {		
	}
}
class Tiger extends Animal2{ //호랑이는 네발로 달립니다.
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void tigerEat() {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}
class Eagle extends Animal2{ //독수리는 하늘을 납니다.
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	
	void eagleEat() {
		System.out.println("독수리는 다른 새를 잡아 먹습니다.");
	}	
}
class Snake extends Animal2{ //뱀은 기어다닙니다.
	@Override
	void run() {
		System.out.println("뱀은 기어다닙니다.");
	}
}
public class MethodOverriding_2 {

	public static void main(String[] args) {
		
		//1. 모든 객체는 Animal2 타입으로 업캐스팅해서 생성.
		Animal2 ani = new Tiger();
		Animal2 ani2 = new Eagle();
		Animal2 ani3 = new Snake();
		
		//2. Animal2 배열에 각 객체를 저장.
		Animal2[] animal = {ani, ani2, ani3};
				
		System.out.println("========For==============");
		//3. for문으로 배열의 객체를 출력. run
		for(int i=0; i<animal.length; i++) {
			animal[i].run();
		}
		
		System.out.println("=======Enhanced For==========");
		//4. Enhanced For 문을 사용해서 객체의 run() 메소드 출력
		for(Animal2 k : animal) {
			k.run();			
		}
		
		System.out.println("=============instanceof============");
		//5. 다운 캐스팅해서 ( instanceof 사용해서) 출력		
		if(ani instanceof Tiger) {
			Tiger ani_down = (Tiger) ani;
			ani_down.tigerEat();
		}
		
		if(ani2 instanceof Eagle) {
			Eagle ani2_down = (Eagle)ani2;
			ani2_down.eagleEat();
		}
		if(ani3 instanceof Snake) {
			Snake ani3_down = (Snake)ani3;
			ani3_down.run();
		}
			
		
		
		
		
	}

}
