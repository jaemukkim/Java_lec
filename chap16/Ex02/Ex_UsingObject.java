package chap16.Ex02;
//Object를 사용해서 5개의 객체를 저장하고 출력 해보기

class Student {
	String name;
	String id;
	int pass;
	
	Student(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "이름은 : " + name +  ", 아이디는 : " + id + ", 비밀번호는 : " + pass; 
	}
}
class Professor {
	String name;
	int year;
	String email;	
	
	Professor(String name, int year, String email){
		this.name = name;
		this.year = year;
		this.email = email;
	}
	@Override
	public String toString() {
		return "이름은 : " + name + ", 경력은 : " + year + "년"+ ", 이메일은 : " + email;
	}
}
class Tiger {
	String name;
	String run;
	
	Tiger(String name, String run){
		this.name = name;
		this.run = run;
	}
	@Override
	public String toString() {
		return "이름은 : " + name + ", 뛰는 방식은 : " + run; 
			
	}
}
class Banana {
	String name;
	String color;
	int price;
	
	Banana(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;		
	}
	@Override
	public String toString() {
		return "이름은 : " + name + ", 색깔은 : " + color + ", 가격은 : " + price;
	}
}

class All {
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}



public class Ex_UsingObject {

	public static void main(String[] args) {
		
		All all1 = new All();
		all1.setObject(new Student("김하늘" , "sky", 123));
		System.out.println(all1.getObject());
		
		All all2 = new All();
		all2.setObject(new Professor("김바다", 7 , "ocean@abc.cde"));
		System.out.println(all2.getObject());
		
		All all3 = new All();
		all3.setObject(new Tiger("호랑이","어흥"));
		System.out.println(all3.getObject());
		
		All all4 = new All();
		all4.setObject(new Banana("바나나", "노랑",4000));
		System.out.println(all4.getObject());
	}

}
