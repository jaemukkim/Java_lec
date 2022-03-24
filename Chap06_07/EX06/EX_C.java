package chap06_07.Ex06;

import chap06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		
		//다른 클래스에 존재함 / public만 접근 / model, color 메모리 접근 불가 
		//model과 color는 setter 를 public 통해서 할당후 출력
		
		C c = new C();	//다른 패키지이므로 import 
		
		//company, model, color 는 다른 패키지에서 접근불가, setter를 통해서 메모리 값을 할당하도록 구성
		c.maxspeed = 260;	//
		
		//setter를 통ㅎ새서 메모리의 값을 부여.
		c.setModel("그랜져");		
		c.setColor("빨강");
		
		
		c.print();
		
		
	}

}
