package Department;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
	백화점의 고객 관리 프로그램. (상속과 다형성)
	
	고객 등급 : 1. 일반고객(silver) : 보너스 포인트(1% 적립), 할인율(없음),
			 2. Gold 고객 : 보너스포인트 (2%적립), 할인률(5%)
			 3. VIP 고객 : 보너스포인트 (5%적립), 할인률10%), 담당 에이전트가 존재


*/
class Customer {	//일반고객
	int customerID; 	  //고객 ID
	String customerName;  //고객 이름
	String customerGrade;  //고객등급( "Siver", "Gold", "VIP")
	double bounsPoint; 		//보너스 포인트 값 : 
	double bounsRatio; 		//보너스 포인트 적립률 : "Silver : 1%, Gold : 2%, VIP : 5% "
	
	Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		
	}
	
	
	//생성자에서 기본으로 2개의 필드의 값은 로드 : customerGrade : Silver, bonusRatio : 1%
	
	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerGrade() {
		return customerGrade;
	}


	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


	public double getBounsPoint() {
		return bounsPoint;
	}


	public void setBounsPoint(double bounsPoint) {
		this.bounsPoint = bounsPoint;
	}


	public double getBounsRatio() {
		return bounsRatio;
	}


	public void setBounsRatio(double bounsRatio) {
		this.bounsRatio = bounsRatio;
	}


	public double calcPrice(int price) { 	//하위 클래스에서 오버라이딩해서 처리
		//물품의 가격을 받아서 보너스 포인트를 적립하는코드
		
		return price;	//할인된 가격을 리턴 시켜준다.
	}
	
}

class GoldCustomer extends Customer{
	double saleRatio;	//물품 할인률 : 생성자에서 기본으로 : 5%
	
	//생성자에서 기본으로 2개의 필드의 값은 로드 : customerGrade : Gold, bonusRatio : 2%, saleRatio : 5%	
}

class VIPCustomer extends Customer{
	private int agentID; 	//생성자, setter, 필드(X)
	double saleRatio;		//물품 할인률 : 10%
	
	//생성자에서 기본으로 3개의 필드의 값은 로드 : customerGrade : VIP, bonusRatio : 5%, saleRatio : 10%
}




public class Customer_Management {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void createCustomer() {
		System.out.println("==일반고객 등록 입니다. ==");
		System.out.println("고객 아이디 : ");
		int customerID = sc.nextInt();
		System.out.println("고객이름 : ");
		String customerName = sc.next();
		
		Customer customer = new Customer(customerID, customerName);
		
		System.out.println("정상 등록 되었습니다.");
	}
	

	public static void main(String[] args) {
		
		Set<Customer> customerList = new HashSet();
			//고객 ID : 중복되지않도록
		Scanner sc = new Scanner(System.in);
/*
		
		======================================================================
		1. 일반고객 등록	|   2. VIP 고객등록      |  3. Gold 고객 등록   4. 정보 출력    5. 물품구매  5. 종료 
		======================================================================
		선택 >> 1
		==일반고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 

		선택 >>2
		==VIP 고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 
		담당에이젼트(ID) 등록 : 

		선택 >>3
		==Gold 고객 등록 입니다. ==
		고객 아이디 : 
		고객이름 : 

		선택 >>4
		==고객 정보 출력  입니다. ==
		고객ID	고객이름	고객등급	할인률	보너스포인트비율	에이젼트ID<VIP고객>

		선택 >>5
		==물품가격을 지불해 주세요 ==
		구매 물품 가격 :  

		000 고객님 000 원 지불 하셨습니다. 
		000 고객님의 등급은 000 이고 현재 포인트는 000 이고 할인은 000원 되었습니다. 

		*/
		while(true) {
			System.out.println("=============================================================================");
			System.out.println("1. 일반고객 등록 | 2. VIP 고객등록 | 3. Gold 고객 등록  | 4. 정보 출력 | 5. 물품구매 | 6. 종료");
			System.out.println("=============================================================================");
			System.out.println("선택>>");
			int No = sc.nextInt();
			
			if(No == 1) {
				
			}else if(No == 2) {
				
			}else if(No == 3) {
				
			}else if(No == 4) {
				
			}else if(No == 5) {
				
			}else if(No == 6){
				break;
			}			
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
		
		

	}

}
