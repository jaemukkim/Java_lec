package chap06_07.Ex03;

class Car {
	String company;		//�ʵ��� company�� �˷��ִ� this
	String model;		//�ν��Ͻ� : ��üȭ ������ ��� ������ �ʵ�.
	String color;		//[�ʵ�� : �ʵ��� ��]�� Heap ������ ����
	double maxspeed;
	
	Car () {} 		//�⺻ ������
	Car(String company, String model, String color, double max){
		this.company = company;	//this �� ��ü�� �ʵ��� ������ ���Ѵ�.
		this.model = model;		//3���� ���� ��ΰ� ������ ��� ��ü�� �ʵ��� ������ �˷��ִ� ����
		this.color = color;
		maxspeed = max;			//this �� ������ ����
	}
	void work() {				//�޼ҵ�(�ν��Ͻ� �޼ҵ�) : Heap ������ �޼ҵ��� �����͸� ����
		System.out.print("comany : "+ company + ", model : "+ model + ", color : " + color + ", maxspeed : "+ maxspeed );
	}							//�޼ҵ��� ��ü������ Ŭ���� ������ �޼ҵ� ������ ����
	
}

public class Q1 {

	public static void main(String[] args) {
		// �����ڸ� ���ؼ� �⺻���� �Ҵ��� �޸��� ������ work() �޼ҵ带 ����ؼ� ���.
		
		Car C = new Car("����", "�ҳ�Ÿ", "���", 220);
		C.work();
			
	
		
		
	}

}
