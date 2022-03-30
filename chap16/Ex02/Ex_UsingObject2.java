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
		return "이름은 : " + name +  ", 아이디는 : " + id + ", 비밀번호는 : " + pass; 
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
		return "이름은 : " + name + ", 경력은 : " + year + "년"+ ", 이메일은 : " + email;
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
		return "이름은 : " + name + ", 뛰는 방식은 : " + run; 
			
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
		return "이름은 : " + name + ", 색깔은 : " + color + ", 가격은 : " + price;
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
		all1.set(new Student2("김하늘", "sky1", 1234));
		System.out.println(all1.get());
		
		All2<Professor2> all2 = new All2<Professor2>();
		all2.set(new Professor2("박하늘", 7, "sky@sky.com"));
		System.out.println(all2.get());
		
		All2<Tiger2> all3 = new All2<Tiger2>();
		all3.set(new Tiger2("호랑이","어흥"));
		System.out.println(all3.get());
		
		All2<Banana2> all4 = new All2<Banana2>();
		all4.set(new Banana2("바나나", "노란색", 3000));
		System.out.println(all4.get());
		
		
		
	}

}
