package chap06_07.Ex06;

//��ü�� �ʵ��� ���� �Ҵ��ϴ� ��� : 3����
	//1. �ʵ忡 ���� ���� �ο��ϴ� ���						  <-- ��ü�� ������
	//2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �ο�. (��Ʈ���� �ȴ�)  <-- ��ü�� ������ 
	//3. �����ڸ� ���ؼ� ��ü�� ���� �ο� (��Ʈ�� �ȴ�)			  <-- ��ü�� �����Ҷ� �ʱⰪ���� �ʵ忡 ���� �Ҵ�

class Aa{	//1. ��ü ������ ���� �ʵ忡 �� �Ҵ�
	String name;	//�̸�
	int age;		//����
	String mail;	//���� �ּ�
	
	void print() {
		System.out.println("name : " + name + " age : " + age + " mail : " + mail);
	}
	
}
class Bb{	//2. setter�� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ�
	String name;	//�̸�
	int age;		//����
	String mail;	//���� �ּ�
	
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
class Cc{	//3. �����ڸ� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ�
	String name;	//�̸�
	int age;		//����
	String mail;	//���� �ּ�
	
	
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
		
		//1. ��ü�� �ʵ忡 ���� ���� �Ҵ�.
		Aa aa = new Aa();	//��ü�� ������
		aa.name = "���ϴ�";		
		aa.age = 20;
		aa.mail = "Aa@aa";
		
		aa.print();
		
		//2. ��ü�� setter �� ����ؼ� �ʵ��� ���� �ο�
		Bb bb = new Bb();	//��ü�� ������
		bb.setname("���ʷ�"); 
		bb.setage(21); 
		bb.setmail("Bb@bb"); 
		
		bb.print();
		
		//3. �����ڸ� ����ؼ� �ʵ��� �� �ο� (��ü�� �����Ҷ� �ʵ��� �� �ʱ�ȭ)
		Cc cc = new Cc("��ٴ�", 25, "Cc@cc");	//��ü�� �����Ҷ� �ʵ��� �� �ο�
		cc.print();
		
		
		
		
		
		

	}

}
