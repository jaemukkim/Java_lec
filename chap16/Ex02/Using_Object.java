package chap16.Ex02;

//Generic ��� �� ������
//Object�� ��� ��ü�� ������ �� �ִ�.
//��ǰ�� �����ϴ� Ŭ������ Object Ÿ������ �����ϸ� ��� ��ü�� ���� �� �ִ�.
// Object�� ���� : ��� ��ü�� ���� �� �ִ� (Casting)
		//  ���� : �Ź� �ٿ�ĳ������ ������Ѵ�.
		//  	  ���� Ÿ�� üũ : ����� ClassCastException�� �߻��� �� �ִ�.


class Apple {		//��� Ŭ����
	String name;
	int price;
	
	Apple (String name, int price){  //������
		this.name = name;
		this.price = price;		
	}
	public void abc() {
		System.out.println("abc() �޼ҵ� ���");
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

class Goods { //Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�.  
	
	private Object object ;	//Object : ��� Ŭ������ Object Ÿ������ ��ȯ

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) { //Object Ÿ������ ��ĳ���õ�.
		this.object = object;
	}
	
}

public class Using_Object {

	public static void main(String[] args) {
		
		//1. Apple�� ������ ���. Object
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("���3", 4000));	//Setter�� ���� �Ҵ�.
		System.out.println((Apple)goods1.getObject());	//getter�� ��ü�� ��� : Object ===> Apple
		((Apple) goods1.getObject()).abc(); //Object ==>Apple�� �ٿ�ĳ������ abc() �޼ҵ� ȣ��
		
		//2. Pencil�� ������ ���. Object
		Goods goods2 = new Goods();
		goods2.setObject(new Pancil("����3", 4000));
		System.out.println((Pancil)goods2.getObject()); //getter�� ��ü�� ��� : Object ===> Apple
		
		
		//3. �߸��� ĳ������ �� �� �ִ�. (���� Ÿ�� üũ) : Object�� ������.
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("���4", 5000));
		System.out.println((Pancil)goods3.getObject());//����  / ���� Ÿ�� üũ : ����� ���� �߻�
		
		
		
	}

}
