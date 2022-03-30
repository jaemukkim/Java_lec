package chap16.Ex08;

class A {}
class B extends A{}
class C extends B{}

//���ʸ� Ÿ���� Ŭ���� : ���ʸ� Ÿ���� ������ ��ü�� ������ ��.


class D <T extends B> {		// T : classB, classC �� �ü� �ִ�.
							// <T extends B > �ǹ� : T Ÿ�Կ� ������ ����
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}


public class BoundedTypeOfGeneric {

	public static void main(String[] args) {
									
//		D<A> d1 = new D<A>();  //�Ұ��� : <T>�� �� ��ü�� ������ ��, B class, C class �� Ÿ�� ���� ����
									// <T extends B>�� �ؼ� A�� ����������
		
		D<B> d2 = new D<B>(); // B, C�� Ÿ������ ���� ����
		D<C> d3 = new D<C>(); // C Ÿ�Ը� ���� ����
		
		D d4 = new D();		// = D(B) D(C)	//Ÿ���� �������� �ʰ� ��ü ������ �ֻ��� Ÿ������ ������
							// = D<B> d2 = new D<B>();
		
		d2.set(new B()); 	//B ��ü ����.
		d2.set(new C()); 	//C ��ü ����.
//		d2.set(new A());   //�����߻�
		
		//d3�� C Ÿ�Ը� ���� �� �ִ�.
//		d3.set(new A());   	//���� �߻�
//		d3.set(new B()); 	//���� �߻�
		d3.set(new C());
		
//		d4.set(new A()); 	//����  / d4�� Ÿ���� �������� �ʾ� �ֻ��� Ÿ������ ������ <T extends B>
		d4.set(new B());
		d4.set(new C());
		
		
		
		
	}

}
