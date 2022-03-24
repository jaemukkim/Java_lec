package chap13.Ex09;

//�Ű������� �޾Ƽ� ó�� : �������̽��� ������ Ŭ������ (x),

interface A {
	void abc(); 	//public abstract ������
}
class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		C c = new C();
		//3. �������̽��� ������ Ŭ���� (x) + �������� ����(O)
		A a = new A() {		//�������̽��� ������ �ڽ� �͸� ��ä������ Ÿ���� A�� ������ �������� ����
			@Override
			public void abc() {
				System.out.println("Ŭ����(X) + ��������(O)");
			}
		};		
		c.cde(a);
		
		
		//4. �������̽��� ������ Ŭ���� (x) + �������� ����(x)  <<== ���� ���� ���(�ӽ÷� �ѹ��� ���)
				//�̺�Ʈ ó�� �Ҷ� ���.(��ȸ��)
		
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("Ŭ����(X) + ��������(X)");
			}
		});
		
		
		
	}

}
