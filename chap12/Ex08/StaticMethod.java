package chap12.Ex08;

// �������̽� ���ο� static Ű�� �� �޼ҵ� : ������ �ڽĿ��� �������� �ٷ� ȣ�Ⱑ��

/* �������̽� ���� ���� ���
	1. �ʵ� : (public static final) /  ()�����Ǿ��ִ�
	2. �޼ҵ� : (public abstract) : �߻� �޼ҵ� (�����ΰ� ���� �޼ҵ�), 
			  (public) default  : �����ΰ� �ִ� �޼ҵ� (Java 1.8 �̻󿡼� �߰��� ���)
 			  (public) static   : �����ΰ� �ְ�, ��ü �������� ȣ�Ⱑ�� (Java 1.8 �̻󿡼� �߰��� ���)
 
 
 */


interface A {
	static void abc() {	//java 1.8 �̻󿡼� ���Ӱ� �߰��� ���
		System.out.println("A �������̽��� ���� �޼ҵ� abc()");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		//1. ����(static) �޼ҵ� ȣ��
		A.abc(); 	//interface �̸����� �ٷ� ȣ�Ⱑ��
		
	}

}
