package chap16.Ex07;

//���ʸ� Ŭ���� : Ŭ������ ���� �Ҷ� Ÿ�� ������ ���� <T> <<����>>, ��ü�� ������ T�� ������ Ÿ���� ����
//���ʸ� Ŭ���� �ȿ� ���ʸ� �޼ҵ尡 ��������, �Ϲ� Ŭ���� ���ο� ����
//���ʸ� �޼ҵ� : �Ϲ� Ŭ���� ������ �޼ҵ� ����� ���ʸ� Ÿ�Ժ����� ���

class Genericmethod2 {  //�Ϲ� Ŭ����, ���ʸ�Ŭ���� X
	
	public <T> T method1 (T t) {	//���ʸ� �޼ҵ� : 1��
		return t;	
	}
	public <T> boolean method2 (T t1, T t2) { //���ʸ� �޼ҵ� : 1��
		return t1.equals(t2);				//�ΰ��� �� true, false ����
											//�⺻ �ڷ����϶��� ���� ��. ���� �ڷ����϶��� ��ü�� �ּҸ� ��
	}
	
	public <K, V> void method3 (K k, V v) {  //���ʸ� �޼ҵ� : 2��
		System.out.println(k + " : " + v);
	}	
	
	public <K,V> void method4() {
		System.out.println("�Ű������� ��ǲ ������ ���°�� ������ ����");
	}
}

public class Genericmethod {

	public static void main(String[] args) {
		//1. �Ϲ� Ŭ���� ��ü ������ ���ʸ� �޼ҵ� ȣ��
		Genericmethod2 gm = new Genericmethod2();
		String str1 = gm.<String>method1("�ȳ�");
		String str2 = gm.method1("�ȳ�");		//Ÿ���� �� �� �ִ� ��� �������� (�Ű������� ���� ���� ��������)
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("=========================");
		
		Integer i = gm.<Integer>method1(100);
		Integer i2 = gm.<Integer>method1(200);
		System.out.println(i);
		System.out.println(i2);
		System.out.println("========================");
		
		Boolean b1 = gm.<Boolean>method1(true);
		Boolean b2 = gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("====================");
		
		Boolean d1 = gm.<Double>method2(2.55, 2.55);	//���� ���� Ÿ���� Boolean
		Boolean d2 = gm.<Double>method2(2.55, 2.55);	//���� ���� Ÿ���� Boolean
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("======================");
		
		gm.<String, Integer>method3("����", 90);
		gm.method3("����", 80);  //�Ű������� ��ǲ�Ǵ� ������ Ÿ���� ��Ī�� �� �ִ� ��� ���� ����
		
		gm.<Integer, String> method3 (500, "���� �����Դϴ�.");
		gm.method3(402, "������ ã�� �� �����ϴ�.");
		
		gm.method4();
	}

}
