package chap16.Ex01;

// Generic ��� �� ������.	- ��ǰ�� ������ Ŭ������ �Ź� ����������Ѵ�

//��ü�� ���� Ŭ������ ���� ���, �Ź� ��ü�� ������ �� ���� �� ��ü�� ���� Ŭ������ �������� �Ѵ�.
//��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� �� �ִ�. <== ���ο� ��ǰ�� �߰��� �� ���� �� ��ǰ�� ���� Ŭ������ ����������Ѵ�.
//�ڵ尡 ������ ����������.


class Apple {		//��� Ŭ����, ����� ������ ���� ��ü
	String name;
	int price;
	
	Apple (String name, int price){  //������
		this.name = name;
		this.price = price;		
	}
	@Override
	public String toString() {	//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���. 
		return "�̸� : " + name + " , ���� : " + price ;
	}
}
class Pancil {
	String name;
	int price;
	
	Pancil(String name, int price){	 //�����ڸ� ���ؼ� �ʵ��� �� �Ҵ�.
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "�̸� : " + name + " , ���� : " + price ;
	}
}

//1. Apple �� ���� �� �ִ� Ŭ���� ����.
class Goods1 {	//��ǰ�� ����� ���� Ŭ����
	private Apple apple = new Apple("���", 1000);

	public Apple getApple() {	//getter : ��ü �ʵ��� ������ ����ϴ� �� 
		return apple;
	}

	public void setApple(Apple apple) {	 //setter
		this.apple = apple;
	}	
}

class Goods2 {  //��ǰ2 : ���� ��ǰ�� ��� Ŭ����
	private Pancil pencil = new Pancil("����", 2000);

	public Pancil getPencil() { 
		return pencil;
	}

	public void setPencil(Pancil pencil) { 
		this.pencil = pencil;
	}
	
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//1. Goods1 ��ǰ�� ����Ǿ� �ִ�. Apple ��ü �߰� �� ��������
		Goods1 goods1 = new Goods1(); 	//�⺻ ������ ȣ��
		goods1.setApple(new Apple("���2", 2000));	//setter�� ���� �Ҵ��ϰ�
		System.out.println(goods1.getApple());	//�ʵ��� ������ ���
		
		//2. Goods2 ��ǰ�� ����. Pancil ��ü�� ����,
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pancil("����2",3000));  //setter�� pancil ��ü ���� �� �� �Ҵ�.
		System.out.println(goods2.getPencil());	
		
		
		
		
		
		
		
		
	}

}
