package chap06_07.Ex05;

public class C {	//다른 패키지에서 import 가능
	
	//필드에 부여되는 접근 제어자
	private String company = "현대자동차"; 	//회사명
	String model;  //모델, default
	protected String color;	//색깔
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int maxspeed;	//최대 속도
	
	
	
	
	
	
	
	public void print() {
		System.out.println("company : " + company + " model : " + model + " color : " + color
			+ " maxspeed : " + maxspeed	);
	}

}
