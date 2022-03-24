package chap13.Ex10.Ex2;

class Abc {   	
	//1. 객체 생성후 필드에 직접 값을 할당. (d1)  
	//2. 생성자를 통해서 값을 할당.  (d2)
	//3. setter를 통해서 값을 할당. (d3)
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
		
		//1. 객체 생성 후 필드에 직접 값을 할당
		Abc d1 = new Abc();
		
		d1.d = (Abc.Def) new Abc.Def() {
			public void run() {
				System.out.println("고양이는 잽싸게 달립니다");
			}
			public void fly() {
				System.out.println("고양이는 날지 못합니다.");
			}
		};
		d1.ghi();
		
		System.out.println("=========================");
		
		//2. 생성자를 통해서 값을 할당.
		
		Abc d2 = new Abc(
				new Abc.Def() {
					
					@Override
					public void run() {
						System.out.println("고양이는 잽싸게 뜁니다.");
					}
					
					@Override
					public void fly() {
						System.out.println("고양이는 날지 못합니다.");
					}
				});
			d2.ghi();		
		
		System.out.println("=========================");
		
		//3. setter를 통해서 값을 할당
		Abc d3 = new Abc();
		d3.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("고양이는 잽싸게 달립니다.");
			}
			
			@Override
			public void fly() {
				System.out.println("고양이는 날지 못합니다.");
			}
		});
		d3.ghi();

	}

}
