package chap11.Ex06;

abstract class Animal {	//�߻� Ŭ���� : �߻� �޼ҵ尡 �ϳ��̻� ���� �Ǿ��ִ� ���
						//�߻� Ŭ������ ��ü ���� �Ұ�, Ÿ���� ��� ����
							//�ڽ�Ŭ������ �θ� Ŭ������ �޼ҵ带 ������ ������ ����
	String name;
	int age;
	
	abstract void cry(); //�߻� �޼ҵ� : �����ΰ� ���� �޼ҵ�
		//void cry(){}  <== �Ϲ� �޼ҵ� : ����Ÿ�� �޼ҵ��̸�(�Է¸Ű�����) {�����ڵ�}
	abstract void run();
	
	@Override
		public String toString() {
		 	return "�̸� : " + name + " , ���� : " + age;
		}
}
class Cat extends Animal {		//Cat�� Animal ��� �Ϻθ� ����� ��� �߻� Ŭ����
								//��� �߻� �޼ҵ带 ������ ���� ��ũ��Ʈ(������ ������) Ŭ����
	Cat(String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {	//�߻� �޼ҵ带 ������ �޼ҵ�
		System.out.println("�߿�");		
	}

	@Override
	void run() {
		System.out.println("����̴� �绡�� �ݴϴ�.");		
	}
//	@Override
//	public String toString() {
//		return name + ", " +age;
//	}
	
}
class Tiger extends Animal {
	Tiger(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	void cry() {
		System.out.println("����");		
	}

	@Override
	void run() {
		System.out.println("ȣ���̴� ������ �ݴϴ�.");
	}
//	@Override
//	public String toString() {
//		return name +" , " + age;
//	}
}
class Eagle extends Animal {
	Eagle(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("���");
	}
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
//	@Override
//	public String toString() {
//		return name +" , "+ age;
//		
//	}
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat ("�����", 10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Eagle("������", 15);
		
		//1. Animal �迭 ��ü�� ���� ��
		Animal[] arr = {a1, a2, a3};
		
		//2. For ���� ����ؼ� ��ü�� ��½� �̸��� ���̸� ���, .cry(), run()
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);	//��ü ���, Animal�� toString()
			arr[i].cry();	//�������̵��� �޼ҵ� ���
			arr[i].run();	//
		}
		System.out.println("================================");		
		
		//3. Enhanced For ���� ����ؼ� �̸��� ���̸� ���, .cry(), run()
		for(Animal k : arr) {
			System.out.println(k);
			k.cry();
			k.run();
		}
		

	}

}
