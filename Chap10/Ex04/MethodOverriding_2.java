package chap10.Ex04;

class Animal2 {
	void run() {		
	}
}
class Tiger extends Animal2{ //ȣ���̴� �׹߷� �޸��ϴ�.
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}
	void tigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}
class Eagle extends Animal2{ //�������� �ϴ��� ���ϴ�.
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	void eagleEat() {
		System.out.println("�������� �ٸ� ���� ��� �Խ��ϴ�.");
	}	
}
class Snake extends Animal2{ //���� ���ٴմϴ�.
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�.");
	}
}
public class MethodOverriding_2 {

	public static void main(String[] args) {
		
		//1. ��� ��ü�� Animal2 Ÿ������ ��ĳ�����ؼ� ����.
		Animal2 ani = new Tiger();
		Animal2 ani2 = new Eagle();
		Animal2 ani3 = new Snake();
		
		//2. Animal2 �迭�� �� ��ü�� ����.
		Animal2[] animal = {ani, ani2, ani3};
				
		System.out.println("========For==============");
		//3. for������ �迭�� ��ü�� ���. run
		for(int i=0; i<animal.length; i++) {
			animal[i].run();
		}
		
		System.out.println("=======Enhanced For==========");
		//4. Enhanced For ���� ����ؼ� ��ü�� run() �޼ҵ� ���
		for(Animal2 k : animal) {
			k.run();			
		}
		
		System.out.println("=============instanceof============");
		//5. �ٿ� ĳ�����ؼ� ( instanceof ����ؼ�) ���		
		if(ani instanceof Tiger) {
			Tiger ani_down = (Tiger) ani;
			ani_down.tigerEat();
		}
		
		if(ani2 instanceof Eagle) {
			Eagle ani2_down = (Eagle)ani2;
			ani2_down.eagleEat();
		}
		if(ani3 instanceof Snake) {
			Snake ani3_down = (Snake)ani3;
			ani3_down.run();
		}
			
		
		
		
		
	}

}
