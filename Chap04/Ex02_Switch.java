package chap04;
public class Ex02_Switch {
	public static void main(String[] args) {
		
		//1. Switch 문에서 Break를 처리하지 않았을때 :해당 case로 이동한후 하위의 case까지 모두 실행.
		
		int value1 = 2;
		
		switch (value1) {
		case 1:
			System.out.println("A학점");
		case 2:
			System.out.println("B학점");
		case 3:
			System.out.println("C학점");
		default :
			System.out.println("F학점");		
		}
		System.out.println("=====================");
		
		//2. break 가 포함된 경우
		
		int value2 = 1;
		
		switch (value2) {
		case 1:
			System.out.println("A학점");
			break;
		case 2:
			System.out.println("B학점");
			break;
		case 3:
			System.out.println("C학점"); //
			break;
		default :
			System.out.println("F학점");   //switch의 마지막은 break 생략가능		
		}
		
		System.out.println("===================");
		value2 = 2;
		
		if(value2 == 1) {
			System.out.println("A학점(if)");
		}else if (value2 == 2) {
			System.out.println("B학점(if)");
		}else if (value2 == 3) {
			System.out.println("C학점(if)");
		}else {
			System.out.println("F학점(if)");
		}
		
		/*
		 * switch 문을 사용해서 점수가 7점 이상은 pass, 7점 이하는 fail을 출력 (점수: 1~10)
		 */
		
		int a = 7;
		
		switch (a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("Pass");
			break;
		default : 
			System.out.println("Fail");
		}
		
		
		
		
		

	}
}