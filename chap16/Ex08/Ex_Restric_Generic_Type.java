package chap16.Ex08;



//���ʸ� Ŭ������ �����ؼ�, Ÿ������ (Apple, Strawberry, Banana) , Pancil�� Ÿ�� ���� ���ϵ���
abstract class Fluit {
	public abstract void print ();	//�߻� �޼ҵ�		
}

class Apple extends Fluit{
	String name;
	int price;
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	@Override
	public void print() {
		System.out.println("��� �Դϴ�.");
		
	}
}
class Strawberry extends Fluit{
	String name;
	int price;
	Strawberry(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	@Override
	public void print() {
		System.out.println("���� �Դϴ�.");
	}
}
	
class Banana extends Fluit{
	String name;
	int price;
	Banana(String name, int price){
		this.name = name;
		this.price = price;
}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	@Override
	public void print() {
		System.out.println("�ٳ��� �Դϴ�.");
	}
}
class Pancil {
	String name;
	int price;
	Pancil(String name, int price){
		this.name = name;
		this.price = price;	
}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	
}

public class Ex_Restric_Generic_Type {

public static void main(String[] args) {
	GenericFluit <Apple> fluitapple = new GenericFluit();
	fluitapple.setFluit(new Apple("���", 2000));	
	Apple apple = fluitapple.getFluit();
	System.out.println(fluitapple);
	apple.print();
	
	GenericFluit <Strawberry> fluitstrawberry = new GenericFluit();
	fluitstrawberry.setFluit(new Strawberry("����", 3000));
	Strawberry strawberry = fluitstrawberry.getFluit();
	System.out.println(fluitstrawberry);
	strawberry.print();
	
	GenericFluit <Banana> fluitbanana = new GenericFluit();
	fluitbanana.setFluit(new Banana("�ٳ���", 2000));
	Banana banana = fluitbanana.getFluit();
	System.out.println(fluitbanana);
	banana.print();
	
//	GenericFluit <Pancil> fluitpancil = new GenreicFluit();
//	fluitpancil.setFluit(new Pancil("����", 1000));
//	System.out.println(fluitpancil);
	
	
	
	
	}
}
	

	
	
	
	

