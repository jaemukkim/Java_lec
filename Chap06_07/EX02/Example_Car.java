package chap06_07.Ex02;

public class Example_Car {

	public static void main(String[] args) {
		//Car Class 를 객체화해서 5개 객체를 생성해서 값을 할당해서 출력
//		String company;
//		String model;
//		String color;
//		int maxSpeed;
		
		
		
		//1
		Car k = new Car();
		
		//각 변수의 값을 할당하고 출력해 보세요.
		
		//setters
		k.setCompany("kia");
		k.setModel("k9");
		k.setColor("white");
		k.setMaxSpeed(240);
		
		//getters
		System.out.println(k.getCompany());
		System.out.println(k.getModel());
		System.out.println(k.getColor());
		System.out.println(k.getMaxSpeed());
		
		System.out.println("=========메모리===============");
		
		//변수의 값을 직접 할당, 권장X, 메모리에 원하지 않는 값을 직접 항달.		
		//private 변수명 : 캡슐화, 직접 변수의 값을 할당하지 못하도록 한다.
		//setter 를 통해서 값을 부여 : 변수의 입력되는 값을 제어 할 수 있다.
		k.company = "kia";
		k.model = "k9";
		k.color = "white";
		k.maxSpeed = 240;	// -, 700 값 이상을 넣을수 없도록 제어
		
		System.out.println(k.company);
		System.out.println(k.model);
		System.out.println(k.color);
		System.out.println(k.maxSpeed);
		
		
					
				
		
		
		System.out.println("========================");
		//2
		Car sm = new Car();
		// setter 를 통해서 값을 할당 : RAM의 값을 부여 할때 사용
		sm.setCompany("samsung");
		sm.setModel("sm7");
		sm.setColor("red");
		sm.setMaxSpeed(210);
		
		// getter 는 메모의 값을 출력 할때
		System.out.println(sm.getColor());
		System.out.println(sm.getModel());
		System.out.println(sm.getColor());
		System.out.println(sm.maxSpeed);
		
		System.out.println("=========메모리============");
		
		sm.company = "samsung";
		sm.model = "sm7";
		sm.color = "red";
		sm.maxSpeed = 210;
		
		System.out.println(sm.company);
		System.out.println(sm.model);
		System.out.println(sm.color);
		System.out.println(sm.maxSpeed);
			
		
		
		System.out.println("========================");
		//3
		Car genesis = new Car();
		
		genesis.setCompany("genesis");
		genesis.setModel("G90");
		genesis.setColor("black");
		genesis.setMaxSpeed(300);
		
		System.out.println(genesis.getCompany());
		System.out.println(genesis.getModel());
		System.out.println(genesis.getColor());
		System.out.println(genesis.getMaxSpeed());
		
		System.out.println("===========메모리=============");
		
		genesis.company = "genesis";
		genesis.model = "G90";
		genesis.color = "black";
		genesis.maxSpeed = 300;
		
		System.out.println(genesis.company);
		System.out.println(genesis.model);
		System.out.println(genesis.color);
		System.out.println(genesis.maxSpeed);
		
		
		//4
		System.out.println("========================");
		
		Car sonata = new Car();
		
		sonata.setCompany("hyundai");
		sonata.setModel("EF sonata");
		sonata.setColor("white");
		sonata.setMaxSpeed(230);
		
		
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		
		System.out.println("===========메모리=============");
		
		sonata.company = "hyundai";
		sonata.model = "EF sonata";
		sonata.color = "white";
		sonata.maxSpeed = 230;
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
