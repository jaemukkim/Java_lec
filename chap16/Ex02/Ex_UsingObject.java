package chap16.Ex02;
//Object�� ����ؼ� 5���� ��ü�� �����ϰ� ��� �غ���

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
		return "�̸��� : " + name +  ", ���̵�� : " + id + ", ��й�ȣ�� : " + pass; 
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
		return "�̸��� : " + name + ", ����� : " + year + "��"+ ", �̸����� : " + email;
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
		return "�̸��� : " + name + ", �ٴ� ����� : " + run; 
			
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
		return "�̸��� : " + name + ", ������ : " + color + ", ������ : " + price;
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
		all1.setObject(new Student("���ϴ�" , "sky", 123));
		System.out.println(all1.getObject());
		
		All all2 = new All();
		all2.setObject(new Professor("��ٴ�", 7 , "ocean@abc.cde"));
		System.out.println(all2.getObject());
		
		All all3 = new All();
		all3.setObject(new Tiger("ȣ����","����"));
		System.out.println(all3.getObject());
		
		All all4 = new All();
		all4.setObject(new Banana("�ٳ���", "���",4000));
		System.out.println(all4.getObject());
	}

}
