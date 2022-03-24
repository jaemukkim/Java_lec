package chap10.Ex07.Ex04;

class A {
	String name;
	A (String name){
		this.name = name;		
	}
	@Override
	public String toString() {
		return name;
	}
}

public class String_Ex {

	public static void main(String[] args) {
		
		String s0 = new String("안녕"); //
		
		String s1 = "안녕";	//String은 참조변수 
		
		System.out.println(s0);		//String은 객체를 출력할때 기본적으로 toString()이 재정의 되어 있다.
		System.out.println(s1);
		
		A a = new A ("안녕");		//주소가 찍힘, toString()을 재정의 시켜줘야함.
		A b = new A ("안녕");
		System.out.println(a);
		System.out.println(b);
	}

}
