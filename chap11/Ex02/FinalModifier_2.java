package chap11.Ex02;

//final �޼ҵ�� final class�� Ư¡
 //final �޼ҵ� : �������̵��� �Ұ�, ���� �߿��� �޼ҵ�� �ڽĿ��� ������ ���� ���ϵ��� ����
 //final Ŭ���� : ����� �Ұ��� Ŭ���� 

class A {
	void abc() {}
	final void bcd() {}	 // final�� �Ҵ�� �޼ҵ�� �ڽ� Ŭ�������� �������̵��� �Ұ�	
}
class B extends A {
	void abc() {}  //�޼ҵ� �������̵��� : �θ��� �޼ҵ� ����� �ڽĿ��� ���Ӱ� ��� ����
//	void bcd() {}  //�޼ҵ� �������̵� �Ұ�
}


final class C {}	  //final class �� ����� �Ұ��� Ŭ����
//class D extends C {}  // ��� �Ұ� Ŭ����

public class FinalModifier_2 {

	public static void main(String[] args) {
		

	}

}
