package chap06_07.Ex06;

//객체의 필드의 값을 할당하는 방식 : 3가지
	//1. 필드에 직접 값을 부여하는 방법						  <-- 객체를 생성후
	//2. setter를 통해서 객체에 필드에 값을 부여. (컨트롤이 된다)  <-- 객체를 생성후 
	//3. 생성자를 통해서 객체의 값을 부여 (컨트롤 된다)			  <-- 객체를 생성할때 초기값으로 필드에 값을 할당

class Aa{	//1. 객체 생성후 직접 필드에 값 할당
	String name;	//이름
	int age;		//나이
	String mail;	//메일 주소
	
	void print() {
		System.out.println("name : " + name + " age : " + age + " mail : " + mail);
	}
	
}
class Bb{	//2. setter를 통해서 객체의 필드의 값을 할당
	String name;	//이름
	int age;		//나이
	String mail;	//메일 주소
	
	public void setname(String name) {
		this.name = name;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setmail(String mail) {
		this.mail = mail;
	}
	
	void print() {
		System.out.println("name : " + name + " age : " + age + " mail : " + mail);
	}
	
}
class Cc{	//3. 생성자를 통해서 객체의 필드의 값을 할당
	String name;	//이름
	int age;		//나이
	String mail;	//메일 주소
	
	
//	void init(String name, int age, String mail) {
//		this.name = name;
//		this.age = age;
//		this.mail = mail;		
//	}	
	
	Cc(String name, int age, String mail){
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
	
	void print() {
		System.out.println("name : " + name + " age : " + age + " mail : " + mail);
	}
	
}

public class FieldOfValue {

	public static void main(String[] args) {
		
		//1. 객체의 필드에 직접 값을 할당.
		Aa aa = new Aa();	//객체를 생성후
		aa.name = "김하늘";		
		aa.age = 20;
		aa.mail = "Aa@aa";
		
		aa.print();
		
		//2. 객체의 setter 를 사용해서 필드의 값을 부여
		Bb bb = new Bb();	//객체를 생성후
		bb.setname("김초롱"); 
		bb.setage(21); 
		bb.setmail("Bb@bb"); 
		
		bb.print();
		
		//3. 생성자를 사용해서 필드의 값 부여 (객체를 생성할때 필드의 값 초기화)
		Cc cc = new Cc("김바다", 25, "Cc@cc");	//객체를 생성할때 필드의 값 부여
		cc.print();
		
		
		
		
		
		

	}

}
