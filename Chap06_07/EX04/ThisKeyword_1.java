package chap06_07.Ex04;

/* ������ this Ű���� �ڵ� �߰� */
// 1. Ŭ���� ���ο��� �ʵ�, �޼ҵ� �տ� �ڵ����� this Ű���尡 ����.
	//this Ű�� ��ü�� �ʵ�� ��ü�� �޼ҵ带 ��Ī, 

class A {
	int m;
	int n;
	
	//A () {}   : �⺻ �����ڰ� ������ 
	
	void init (int a, int b) {
		int c;			// a, b, c �� �������� (Stack ������ ������� ���� ������. )
		c = 3;			// init() �޼ҵ� �����ÿ� stack�� �����ǰ� �޼ҵ尡 ������ �Ҹ�ȴ�.
		this.m = a;		//this ������, �����Ϸ��� �ڵ����� �߰�
		this.n = b;		//this ������, �����Ϸ��� �ڵ����� �߰�
	}
	void work() {
		this.init(2, 3);  //this ������, �����Ϸ��� �ڵ����� �߰�
		System.out.println(this.m + " , " +  this.n);  //this�� ��������, �����Ϸ��� �ڵ����� �߰�
	}
}

public class ThisKeyword_1 {
	public static void main(String[] args) {
		//2. ��ü ����
		A a = new A();
		
		//3. �޼��� ȣ��
		a.work();
	}

}
