package chap16.Ex07;

//���ʸ� �޼ҵ� ���ο��� ��� ������ �޼ҵ� : Object Ŭ������ �޼ҵ常 ��밡���ϴ�.

class A {
	public<T> void method(T t) {
//		System.out.println(t.length());	 //t.length() : String Ŭ�������� ���ڼ��� ��������
		System.out.println(t.equals("�ȳ�"));  //t.equals�� Object Ŭ������ �޼ҵ�� ��밡��
	}	
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ�");		
	}														// [] ==> �����Ǿ���
	public <T extends Object> void method2 (T t){	//<T [extends Object]>
		
		System.out.println(t.equals("�ݰ����ϴ�.")); 	//Object Ŭ������ �޼ҵ常 ��밡���ϴ�.
		System.out.println(t);
	}
	public <T extends String> void method3 (T t) {	//
		System.out.println(t.length());
//		System.out.println(t.);
	}
}
