package chap16.Ex08;



//제너릭 클래스를 생성해서, 타입제한 (Apple, Strawberry, Banana) , Pancil를 타입 접근 못하도록
abstract class Fluit {
	public abstract void print ();	//추상 메소드		
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
		return name + "이고 가격은 " + price;
	}
	@Override
	public void print() {
		System.out.println("사과 입니다.");
		
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
		return name + "이고 가격은 " + price;
	}
	@Override
	public void print() {
		System.out.println("딸기 입니다.");
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
		return name + "이고 가격은 " + price;
	}
	@Override
	public void print() {
		System.out.println("바나나 입니다.");
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
		return name + "이고 가격은 " + price;
	}
	
}

public class Ex_Restric_Generic_Type {

public static void main(String[] args) {
	GenericFluit <Apple> fluitapple = new GenericFluit();
	fluitapple.setFluit(new Apple("사과", 2000));	
	Apple apple = fluitapple.getFluit();
	System.out.println(fluitapple);
	apple.print();
	
	GenericFluit <Strawberry> fluitstrawberry = new GenericFluit();
	fluitstrawberry.setFluit(new Strawberry("딸기", 3000));
	Strawberry strawberry = fluitstrawberry.getFluit();
	System.out.println(fluitstrawberry);
	strawberry.print();
	
	GenericFluit <Banana> fluitbanana = new GenericFluit();
	fluitbanana.setFluit(new Banana("바나나", 2000));
	Banana banana = fluitbanana.getFluit();
	System.out.println(fluitbanana);
	banana.print();
	
//	GenericFluit <Pancil> fluitpancil = new GenreicFluit();
//	fluitpancil.setFluit(new Pancil("연필", 1000));
//	System.out.println(fluitpancil);
	
	
	
	
	}
}
	

	
	
	
	

