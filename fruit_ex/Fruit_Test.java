package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*
	상속을 다루는 문제입니다. 하위의 생성자에 super() 메소드 사용.
	실행 파일도 압축해서 제출

*/
class Fruit {
	String fruitName; 	
	String color;
	int large;
	
	
	
	public String getFruitName() {
		return fruitName;
	}
	
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	public String toString() {  //과일의 정보를 출력하는 메소드		
		
		return "과일의 이름 :  " +  fruitName + " 색깔은 " + color + "이고" + "크기는" + large + "입니다.";
	}
}

class Apple extends Fruit {
	Apple(String fruitName, String color, int large){
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
}

class Orange extends Fruit {
	Orange(String fruitName, String color, int large){
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
}

class Banana extends Fruit {
	Banana(String fruitName, String color, int large){
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
}


public class Fruit_Test {
	public static ArrayList<Fruit> fruitList = new ArrayList();
	public static Scanner sc = new Scanner(System.in);
	
	public static void newApple() {
		System.out.println("정보를 입력하세요.");
		System.out.println("과일명 : ");
		String fruitName = sc.next();
		System.out.println("색깔 : ");
		String color = sc.next();
		System.out.println("크기 : ");
		int large = sc.nextInt();
		
		Fruit newapple = new Apple(fruitName, color, large);
		
		fruitList.add(newapple);
		System.out.println("성공적으로 생성되었습니다.");
		
		
	}
	public static void newOrange() {
		System.out.println("정보를 입력하세요.");
		System.out.println("과일명 : ");
		String fruitName = sc.next();
		System.out.println("색깔 : ");
		String color = sc.next();
		System.out.println("크기 : ");
		int large = sc.nextInt();
		
		Fruit neworange = new Orange(fruitName, color, large);
		
			fruitList.add(neworange);
			System.out.println("성공적으로 생성되었습니다.");
		
	}
	public static void newBanana() {
		System.out.println("정보를 입력하세요.");
		System.out.println("과일명 : ");
		String fruitName = sc.next();
		System.out.println("색깔 : ");
		String color = sc.next();
		System.out.println("크기 : ");
		int large = sc.nextInt();
		
		Fruit newbanana = new Banana(fruitName, color, large);
				
				fruitList.add(newbanana);
				System.out.println("성공적으로 생성되었습니다.");
	}
	
	public static void showFruitList() {
		System.out.println("== 과일 정보 출력 ==");
		System.out.println();
		
		for(int i=0; i<fruitList.size(); i++) {
			Fruit fruit = fruitList.get(i);
			System.out.print(" 과일의 이름은 : " +fruit.getFruitName());
			
			System.out.print(", 색깔은 : " + fruit.getColor());
			
			System.out.print(", 크기는 : " + fruit.getLarge());
			
			System.out.println();
		}
			
			
	}

	public static void main(String[] args) {
		
		/*
		 선택 >> 
		====================================================
		1. 사과	| 2. 오렌지  |  3. 바나나  |  4. 정보출력  |  5. 종료
		====================================================
		
		선택 >> 1
		과일명 :
		색깔 :
		크기 :		
		
		*/
		
		//2. 코드작성 : 스캐너로 인풋 받은 값으로 각각의 객체를 생성해서 ArrayList에 저장
		
		//3. 선택 >> 4   ArrayList의 모든 객체를 가져와서 객체를 출력했을 때	, Enhanced For 문을 사용해서
			//출력결과 :
			// 과일의 이름 : <사과>이고, 색깔은 <빨간색>이고, 크기는 <10>입니다.
			// 과일의 이름 : <오렌지>이고, 색깔은 <오렌지색>이고, 크기는 <20>입니다.
			// 과일의 이름 : <바나나>이고, 색깔은 <노란색>이고, 크기는 <30>입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=============================================");
			System.out.println("1. 사과 | 2. 오렌지 | 3. 바나나 | 4. 정보출력 | 5. 종료");
			System.out.println("=============================================");
			int No = sc.nextInt();
			
			if(No == 1) {
				newApple();
			}else if(No == 2) {
				newOrange();
			}else if(No == 3) {
				newBanana();
			}else if(No == 4) {
				showFruitList();
			}else {
				break;
			}			
		}
		sc.close();
		System.out.println("프로그램을 종료합니다. ");
		
		
		
		
	}

}
