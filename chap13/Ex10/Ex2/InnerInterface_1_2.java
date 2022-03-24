package chap13.Ex10.Ex2;

class Abc {   	
	//1. ��ü ������ �ʵ忡 ���� ���� �Ҵ�. (d1)  
	//2. �����ڸ� ���ؼ� ���� �Ҵ�.  (d2)
	//3. setter�� ���ؼ� ���� �Ҵ�. (d3)
	Def d;
	
	Abc(){}
	Abc(Def d){
		this.d = d;
	}
	
	public void setDef(Def d) {
		this.d = d;
	}
	
	interface Def {
		void run();
		void fly();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
}

public class InnerInterface_1_2 {

	public static void main(String[] args) {
		
		//1. ��ü ���� �� �ʵ忡 ���� ���� �Ҵ�
		Abc d1 = new Abc();
		
		d1.d = (Abc.Def) new Abc.Def() {
			public void run() {
				System.out.println("����̴� ��ΰ� �޸��ϴ�");
			}
			public void fly() {
				System.out.println("����̴� ���� ���մϴ�.");
			}
		};
		d1.ghi();
		
		System.out.println("=========================");
		
		//2. �����ڸ� ���ؼ� ���� �Ҵ�.
		
		Abc d2 = new Abc(
				new Abc.Def() {
					
					@Override
					public void run() {
						System.out.println("����̴� ��ΰ� �ݴϴ�.");
					}
					
					@Override
					public void fly() {
						System.out.println("����̴� ���� ���մϴ�.");
					}
				});
			d2.ghi();		
		
		System.out.println("=========================");
		
		//3. setter�� ���ؼ� ���� �Ҵ�
		Abc d3 = new Abc();
		d3.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("����̴� ��ΰ� �޸��ϴ�.");
			}
			
			@Override
			public void fly() {
				System.out.println("����̴� ���� ���մϴ�.");
			}
		});
		d3.ghi();

	}

}
