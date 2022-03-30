package chap16.Ex02;

class Student2 {
	String name;
	String id;
	int pass;
	
	Student2(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "�̸��� : " + name +  ", ���̵�� : " + id + ", ��й�ȣ�� : " + pass; 
	}
}
class Professor2 {
	String name;
	int year;
	String email;	
	
	Professor2(String name, int year, String email){
		this.name = name;
		this.year = year;
		this.email = email;
	}
	@Override
	public String toString() {
		return "�̸��� : " + name + ", ����� : " + year + "��"+ ", �̸����� : " + email;
	}
}
class Tiger2 {
	String name;
	String run;
	
	Tiger2(String name, String run){
		this.name = name;
		this.run = run;
	}
	@Override
	public String toString() {
		return "�̸��� : " + name + ", �ٴ� ����� : " + run; 
			
	}
}
class Banana2 {
	String name;
	String color;
	int price;
	
	Banana2(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;		
	}
	@Override
	public String toString() {
		return "�̸��� : " + name + ", ������ : " + color + ", ������ : " + price;
	}
}

class All2<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}



public class Ex_UsingObject2 {

	public static void main(String[] args) {
		All2<Student2> all1 = new All2<Student2>();
		all1.set(new Student2("���ϴ�", "sky1", 1234));
		System.out.println(all1.get());
		
		All2<Professor2> all2 = new All2<Professor2>();
		all2.set(new Professor2("���ϴ�", 7, "sky@sky.com"));
		System.out.println(all2.get());
		
		All2<Tiger2> all3 = new All2<Tiger2>();
		all3.set(new Tiger2("ȣ����","����"));
		System.out.println(all3.get());
		
		All2<Banana2> all4 = new All2<Banana2>();
		all4.set(new Banana2("�ٳ���", "�����", 3000));
		System.out.println(all4.get());
		
		
		
	}

}
