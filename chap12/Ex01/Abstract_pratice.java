package chap12.Ex01;

abstract class Ani{
	abstract void swim();
	abstract void run();
}
class Bear extends Ani{

	@Override
	void swim() {
		System.out.println("���� ������ �� �ֽ��ϴ�");
	}

	@Override
	void run() {
		System.out.println("���� ���� �پ�ٴմϴ�.");
	}
	
}
class lion extends Ani{

	@Override
	void swim() {
		System.out.println("���ڴ� ������ �� �ֽ��ϴ�.");
	}

	@Override
	void run() {
		System.out.println("���ڴ� ���ذ� �޸��ϴ�.");
	}
	
}

public class Abstract_pratice {

	public static void main(String[] args) {
		
		Ani a1 = new Bear();
		a1.run();
		a1.swim();
		Ani a2 = new lion();
		a2.run();
		a2.swim();
		
		System.out.println("=======================");
		
		Ani a3 = new Bear() {
			void run() {
				System.out.println("���� ���� �پ�ٴմϴ�.");
			}
			void swim() {
				System.out.println("���� ������ �� �ֽ��ϴ�.");
			}
		};
		a3.run();
		a3.swim();
		
		Ani a4 = new lion() {
			void run() {
				System.out.println("���ڴ� ���ذ� �޸��ϴ�.");
			}
			void swim() {
				System.out.println("���ڴ� ������ �� �ֽ��ϴ�.");
			}
		};
		a4.run();
		a4.swim();
		System.out.println("===========for===============");
		
		Ani[] arr = {a1, a2, a3, a4};
		
		for(int i=0; i<arr.length; i++) {
			arr[i].run();
			arr[i].swim();
		}
		System.out.println("=========Enhanced for============");
		for(Ani k : arr) {
			k.run();
			k.swim();
		}
		
	}

}
