package chap06_07.Ex03;

class Car {
	String company;		//필드의 company를 알려주는 this
	String model;		//인스턴스 : 객체화 했을때 사용 가능한 필드.
	String color;		//[필드명 : 필드의 값]은 Heap 영역에 저장
	double maxspeed;
	
	Car () {} 		//기본 생성자
	Car(String company, String model, String color, double max){
		this.company = company;	//this 는 객체의 필드의 변수를 뜻한다.
		this.model = model;		//3개의 변수 모두가 동일할 경우 객체의 필드의 변수를 알려주는 역할
		this.color = color;
		maxspeed = max;			//this 가 생략된 상태
	}
	void work() {				//메소드(인스턴스 메소드) : Heap 영역의 메소드명과 포인터를 저장
		System.out.print("comany : "+ company + ", model : "+ model + ", color : " + color + ", maxspeed : "+ maxspeed );
	}							//메소드의 전체구문은 클래스 영역의 메소드 영역에 저장
	
}

public class Q1 {

	public static void main(String[] args) {
		// 생성자를 통해서 기본값을 할당후 메모리의 내용을 work() 메소드를 사용해서 출력.
		
		Car C = new Car("현대", "소나타", "흰색", 220);
		C.work();
			
	
		
		
	}

}
