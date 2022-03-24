package chap13.Ex09.Ex1;

interface A {
	void cry();
	void fly();
}
class C {
	void abc(A a) {
		a.cry();
		a.fly();		
	}
}

public class AnonymousClass_4_1 {

	public static void main(String[] args) {
		C c = new C();
		//1. Ŭ������ ���� (X) + ��������(O)
		A a = new A() {			//���� ���� a ����
			@Override
			public void cry() {
				System.out.println("����");
			}
			@Override
			public void fly() {
				System.out.println("���ƿ�");
			}
		};
		c.abc(a);
		System.out.println("===================");
		
		//2. Ŭ������ ���� (X) + ��������(X)
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("����");
			}

			@Override
			public void fly() {
				System.out.println("���ƿ�");
			}
			
		});
	}

}
