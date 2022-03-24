package chap12.Ex01;

abstract class D {	//Ŭ���� ���ο� �߻� �޼ҵ尡 �� ��� abstract Ŭ������ �Ǿ�� �Ѵ�.
			//�ڽ� Ŭ�������� �ݵ�� �������� �޼ҵ带 ������ �ϴ°��� ����.
	
	abstract void print();		//�߻� �޼ҵ�, �����ΰ� ����, ���� �� �޼ҵ�
}

class E extends D {  //�ڽ� Ŭ������ �߻�Ŭ������ �޼ҵ带 ������.

	@Override
	void print() {
		System.out.println("E Ŭ������ print()");
	}	  
	
}

public class AbstractClass_3 {

	public static void main(String[] args) {
		//1. ��üȭ �ؼ� ���. (��ü 3�� ������ print() �޼ҵ� ���,Ÿ���� D)
		D d1 = new E();
		D d2 = new E();
		D d3 = new E();
		d1.print();
		d2.print();
		d3.print();
		
		System.out.println("=========================");	
		
		//2. �͸� Ŭ������ �����ؼ� ��� (print() �޼ҵ� 3�����
			//��ü �������� �ӽ÷� ����ϴ� ���
		
		
		D dd1 = new D() {
			void print() {
				System.out.println("�ȳ�");
				System.out.println("����");
				System.out.println("����");
			}			
		};
		dd1.print();
		
	}

}
