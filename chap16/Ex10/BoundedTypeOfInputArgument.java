package chap16.Ex10;

//�Ϲ� �޼ҵ忡�� �Ű��������� ���� ����

class A {}
class B extends A{}
class C extends B{}
class D extends C{}

class Goods<T> {  //�Ϲ� ���ʸ� Ŭ����
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}	
}

class Test {	//�Ϲ� �޼ҵ忡 , �Ű������� ������ Ÿ���� ���ʸ� Ÿ��
	void method1 (Goods<A> g) {}		//g�� �Ű������� A Ŭ���� Ÿ�Ը� ���� 
	void method2 (Goods<?> g) {}		//g�� �Ű������� A,B,C,D Ŭ���� Ÿ�Ը� ���� 
	void method3 (Goods<? extends B> g) {}	//g�� �Ű������� B,C,D Ŭ���� Ÿ�Ը� ���� / B ������
	void method4 (Goods<? super B> g) {}	//g�� �Ű������� A,B Ŭ���� Ÿ�Ը� ���� / B ����
}


public class BoundedTypeOfInputArgument {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		//1. Method1 :
		t.method1(new Goods<A>()); 	//���� �۵�
//		t.method1(Goods<B>()); 		//����
//		t.method1(Goods<C>()); 		//����
//		t.method1(Goods<D>()); 		//����
		
		//2. Method2
		t.method2(new Goods<A>());	
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//3. Method3  (Goods<? extends B> g) : B, C, D
//		t.method3(new Goods<A>());	//����
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//4. Method4  (Goods<? super B> g) : B, A
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());	//����
//		t.method4(new Goods<D>());	//����
		
	}

}
