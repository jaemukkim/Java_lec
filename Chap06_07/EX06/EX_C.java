package chap06_07.Ex06;

import chap06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		
		//�ٸ� Ŭ������ ������ / public�� ���� / model, color �޸� ���� �Ұ� 
		//model�� color�� setter �� public ���ؼ� �Ҵ��� ���
		
		C c = new C();	//�ٸ� ��Ű���̹Ƿ� import 
		
		//company, model, color �� �ٸ� ��Ű������ ���ٺҰ�, setter�� ���ؼ� �޸� ���� �Ҵ��ϵ��� ����
		c.maxspeed = 260;	//
		
		//setter�� �뤾���� �޸��� ���� �ο�.
		c.setModel("�׷���");		
		c.setColor("����");
		
		
		c.print();
		
		
	}

}
