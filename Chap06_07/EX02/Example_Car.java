package chap06_07.Ex02;

public class Example_Car {

	public static void main(String[] args) {
		//Car Class �� ��üȭ�ؼ� 5�� ��ü�� �����ؼ� ���� �Ҵ��ؼ� ���
//		String company;
//		String model;
//		String color;
//		int maxSpeed;
		
		
		
		//1
		Car k = new Car();
		
		//�� ������ ���� �Ҵ��ϰ� ����� ������.
		
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
		
		System.out.println("=========�޸�===============");
		
		//������ ���� ���� �Ҵ�, ����X, �޸𸮿� ������ �ʴ� ���� ���� �״�.		
		//private ������ : ĸ��ȭ, ���� ������ ���� �Ҵ����� ���ϵ��� �Ѵ�.
		//setter �� ���ؼ� ���� �ο� : ������ �ԷµǴ� ���� ���� �� �� �ִ�.
		k.company = "kia";
		k.model = "k9";
		k.color = "white";
		k.maxSpeed = 240;	// -, 700 �� �̻��� ������ ������ ����
		
		System.out.println(k.company);
		System.out.println(k.model);
		System.out.println(k.color);
		System.out.println(k.maxSpeed);
		
		
					
				
		
		
		System.out.println("========================");
		//2
		Car sm = new Car();
		// setter �� ���ؼ� ���� �Ҵ� : RAM�� ���� �ο� �Ҷ� ���
		sm.setCompany("samsung");
		sm.setModel("sm7");
		sm.setColor("red");
		sm.setMaxSpeed(210);
		
		// getter �� �޸��� ���� ��� �Ҷ�
		System.out.println(sm.getColor());
		System.out.println(sm.getModel());
		System.out.println(sm.getColor());
		System.out.println(sm.maxSpeed);
		
		System.out.println("=========�޸�============");
		
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
		
		System.out.println("===========�޸�=============");
		
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
		
		System.out.println("===========�޸�=============");
		
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
