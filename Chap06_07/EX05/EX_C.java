package chap06_07.Ex05;

public class Ex_C {

	public static void main(String[] args) {		
		
		//���� Ŭ������ ������.
		C c = new C();	//���� ��Ű���� �����ϴ� Ŭ����
		
	//	�ʵ忡 ���� ���� �Ҵ�
	//	c.company = "�Ｚ�ڵ���	"; //private : �ܺ� Ŭ�������� ���� �Ұ�	
		c.model = "�ҳ�Ÿ";	//default
		c.color = "���";		//protected
		c.maxspeed = 230;	//public
				
		
		c.print();
		
	}

}
