package Department;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
	��ȭ���� �� ���� ���α׷�. (��Ӱ� ������)
	
	�� ��� : 1. �Ϲݰ�(silver) : ���ʽ� ����Ʈ(1% ����), ������(����),
			 2. Gold �� : ���ʽ�����Ʈ (2%����), ���η�(5%)
			 3. VIP �� : ���ʽ�����Ʈ (5%����), ���η�10%), ��� ������Ʈ�� ����


*/
class Customer {	//�Ϲݰ�
	int customerID; 	  //�� ID
	String customerName;  //�� �̸�
	String customerGrade;  //�����( "Siver", "Gold", "VIP")
	double bounsPoint; 		//���ʽ� ����Ʈ �� : 
	double bounsRatio; 		//���ʽ� ����Ʈ ������ : "Silver : 1%, Gold : 2%, VIP : 5% "
	
	Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		
	}
	
	
	//�����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : customerGrade : Silver, bonusRatio : 1%
	
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


	public double calcPrice(int price) { 	//���� Ŭ�������� �������̵��ؼ� ó��
		//��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ��ڵ�
		
		return price;	//���ε� ������ ���� �����ش�.
	}
	
}

class GoldCustomer extends Customer{
	double saleRatio;	//��ǰ ���η� : �����ڿ��� �⺻���� : 5%
	
	//�����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : customerGrade : Gold, bonusRatio : 2%, saleRatio : 5%	
}

class VIPCustomer extends Customer{
	private int agentID; 	//������, setter, �ʵ�(X)
	double saleRatio;		//��ǰ ���η� : 10%
	
	//�����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε� : customerGrade : VIP, bonusRatio : 5%, saleRatio : 10%
}




public class Customer_Management {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void createCustomer() {
		System.out.println("==�Ϲݰ� ��� �Դϴ�. ==");
		System.out.println("�� ���̵� : ");
		int customerID = sc.nextInt();
		System.out.println("���̸� : ");
		String customerName = sc.next();
		
		Customer customer = new Customer(customerID, customerName);
		
		System.out.println("���� ��� �Ǿ����ϴ�.");
	}
	

	public static void main(String[] args) {
		
		Set<Customer> customerList = new HashSet();
			//�� ID : �ߺ������ʵ���
		Scanner sc = new Scanner(System.in);
/*
		
		======================================================================
		1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����  5. ���� 
		======================================================================
		���� >> 1
		==�Ϲݰ� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>2
		==VIP �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 
		��翡����Ʈ(ID) ��� : 

		���� >>3
		==Gold �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>4
		==�� ���� ���  �Դϴ�. ==
		��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>

		���� >>5
		==��ǰ������ ������ �ּ��� ==
		���� ��ǰ ���� :  

		000 ���� 000 �� ���� �ϼ̽��ϴ�. 
		000 ������ ����� 000 �̰� ���� ����Ʈ�� 000 �̰� ������ 000�� �Ǿ����ϴ�. 

		*/
		while(true) {
			System.out.println("=============================================================================");
			System.out.println("1. �Ϲݰ� ��� | 2. VIP ����� | 3. Gold �� ���  | 4. ���� ��� | 5. ��ǰ���� | 6. ����");
			System.out.println("=============================================================================");
			System.out.println("����>>");
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
		System.out.println("���α׷��� �����մϴ�.");
		
		

	}

}
