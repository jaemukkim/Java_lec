package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*
	����� �ٷ�� �����Դϴ�. ������ �����ڿ� super() �޼ҵ� ���.
	���� ���ϵ� �����ؼ� ����

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

	public String toString() {  //������ ������ ����ϴ� �޼ҵ�		
		
		return "������ �̸� :  " +  fruitName + " ������ " + color + "�̰�" + "ũ���" + large + "�Դϴ�.";
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
		System.out.println("������ �Է��ϼ���.");
		System.out.println("���ϸ� : ");
		String fruitName = sc.next();
		System.out.println("���� : ");
		String color = sc.next();
		System.out.println("ũ�� : ");
		int large = sc.nextInt();
		
		Fruit newapple = new Apple(fruitName, color, large);
		
		fruitList.add(newapple);
		System.out.println("���������� �����Ǿ����ϴ�.");
		
		
	}
	public static void newOrange() {
		System.out.println("������ �Է��ϼ���.");
		System.out.println("���ϸ� : ");
		String fruitName = sc.next();
		System.out.println("���� : ");
		String color = sc.next();
		System.out.println("ũ�� : ");
		int large = sc.nextInt();
		
		Fruit neworange = new Orange(fruitName, color, large);
		
			fruitList.add(neworange);
			System.out.println("���������� �����Ǿ����ϴ�.");
		
	}
	public static void newBanana() {
		System.out.println("������ �Է��ϼ���.");
		System.out.println("���ϸ� : ");
		String fruitName = sc.next();
		System.out.println("���� : ");
		String color = sc.next();
		System.out.println("ũ�� : ");
		int large = sc.nextInt();
		
		Fruit newbanana = new Banana(fruitName, color, large);
				
				fruitList.add(newbanana);
				System.out.println("���������� �����Ǿ����ϴ�.");
	}
	
	public static void showFruitList() {
		System.out.println("== ���� ���� ��� ==");
		System.out.println();
		
		for(int i=0; i<fruitList.size(); i++) {
			Fruit fruit = fruitList.get(i);
			System.out.print(" ������ �̸��� : " +fruit.getFruitName());
			
			System.out.print(", ������ : " + fruit.getColor());
			
			System.out.print(", ũ��� : " + fruit.getLarge());
			
			System.out.println();
		}
			
			
	}

	public static void main(String[] args) {
		
		/*
		 ���� >> 
		====================================================
		1. ���	| 2. ������  |  3. �ٳ���  |  4. �������  |  5. ����
		====================================================
		
		���� >> 1
		���ϸ� :
		���� :
		ũ�� :		
		
		*/
		
		//2. �ڵ��ۼ� : ��ĳ�ʷ� ��ǲ ���� ������ ������ ��ü�� �����ؼ� ArrayList�� ����
		
		//3. ���� >> 4   ArrayList�� ��� ��ü�� �����ͼ� ��ü�� ������� ��	, Enhanced For ���� ����ؼ�
			//��°�� :
			// ������ �̸� : <���>�̰�, ������ <������>�̰�, ũ��� <10>�Դϴ�.
			// ������ �̸� : <������>�̰�, ������ <��������>�̰�, ũ��� <20>�Դϴ�.
			// ������ �̸� : <�ٳ���>�̰�, ������ <�����>�̰�, ũ��� <30>�Դϴ�.
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=============================================");
			System.out.println("1. ��� | 2. ������ | 3. �ٳ��� | 4. ������� | 5. ����");
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
		System.out.println("���α׷��� �����մϴ�. ");
		
		
		
		
	}

}
