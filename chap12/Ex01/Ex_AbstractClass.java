package chap12.Ex01;

abstract class Abc {
	abstract void cry();	//
	abstract void fly();
}
class Cat extends Abc{

	@Override
	void cry() {
		System.out.println("�߿�");
	}
	@Override
	void fly() {
		System.out.println("����̴� �ϴ��� ���� ���մϴ�.");
	}	
}
class Eagle extends Abc{

	@Override
	void cry() {
		System.out.println("���");
	}
	@Override
	void fly() {
		System.out.println("�������� �ϴ��� �� �� �ֽ��ϴ�.");		
	}
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
		//1. �ڽ� Ŭ���� Cat,Eagle Ŭ������ ���� �� ��� 
		Abc a1 = new Cat();
		Abc a2 = new Eagle(); 
		a1.cry();
		a1.fly();
		a2.cry();
		a2.fly();
		
		System.out.println("==========================");
		//2. �͸� Ŭ���� ������ ���,
		Abc a3 = new Cat() {
			void cry() {
				System.out.println("�߿�");
			}
			void fly() {
				System.out.println("����̴� �ϴ��� ���� ���մϴ�.");
			}
		};
		Abc a4 = new Eagle() {
			void cry() {
				System.out.println("���");
			}
			void fly() {
				System.out.println("�������� �ϴ��� ���� �ֽ��ϴ�.");
			}
		};
		a3.cry();
		a3.fly();
		a4.cry();
		a4.fly();
		

	}

}
