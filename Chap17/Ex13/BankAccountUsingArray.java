package Chap17.Ex13;

import java.util.Scanner;

class Account {   //���� ������ �����ϴ� ��ü. �߿��� �ʵ�, private(ĸ��ȭ), 
					//DTO, VO <== �� �������� �ʵ��� ���� �����ϰ� ����  
					//��ü�� �ʵ�����(x), ������, getter, setter�� ����
	private String ano;     //���¹�ȣ
	private String owner;   //���� ��, �̸�
	private int balance;	//���� �ݾ�
	
	Account(String ano, String owner, int balance){ //��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε�
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;		
	}
	
	//getter, setter
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}

public class BankAccountUsingArray {
	//�迭�� ����ؼ� Account ��ü ���
	private static Account[] accountArray = new Account[100];  //�迭�� ��ü ����.
	private static Scanner sc = new Scanner(System.in);
		//Account[] : �迭 Ÿ��. ����Ÿ��, �迭�� ���濡 ���� �������� ���� ��� �⺻������ NULL
		//�迭 ������ ��(index)�� ũ�⸦ ����, index = 0, length() 
	
	//�޼ҵ� ����
	private static void createAccount() {
		//1.���� ����  / ��ĳ�ʷ� 1.���¹�ȣ , 2.�̸� , 3.�ʱ����� �ݾ�
		//�迭 ��ü�� ����.
		System.out.println("----------");
		System.out.println("1. ���� ����");
		System.out.println("----------");
		System.out.println("���� ��ȣ�� �Է� �ϼ��� >>");
		String ano = sc.next();	 //���� ��ȣ�� ��ǲ�޾Ƽ� ano ������ �Ҵ�. <�޼ҵ� �������� ����ϴ� ��������>
		System.out.println("�̸��� �Է� �ϼ���>>");
		String owner = sc.next();
		System.out.println("���� ������ �ʱ� �ݾ��� �Է��ϼ���.");
		int balance = sc.nextInt();
		
		//�� �ʵ��� ������ ����ڷκ��� �Ҵ� �޾Ƽ� ��ü�� ������ ��ü�� �ʵ��� ���� ����.
		Account newAccount = new Account(ano, owner, balance);	//�����ڸ� ���ؼ� ��ü�� �ʵ尪 ������ ��ü ����.
		
		//�迭 ������ �޼ҵ� �ܺο��� ����. �������� : ��� �޼ҵ忡�� ��밡�� 
		//��ü�� �迭�� ����(����ִ� �濡 ����). for ���� ����ؼ� null�� ���� ã�Ƽ� null�� ��� ��ü�� ����.
		for(int i=0; i<accountArray.length; i++) {  //accountArray �迭 ���� 0~99 ����� ��ȸ
			if(accountArray[i] == null) {	//0���� ���� null�� ���� ã�Ƽ� null�� ��� ��ü�� �迭�� ����.
				accountArray[i] = newAccount;  //null�� �濡 ��ü�� ����.
				System.out.println("���°� ���������� �����Ǿ����ϴ�.");
				break;	//���¸� �����ϰ� for���� �������´�.				
			}			
		}		
	}
	private static void accountList() {
		//2.���� ��� ��� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
		//�迭�� �� ���� ��ȸ�ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���.
		System.out.println("-----------");
		System.out.println("2. ���¸�����");
		System.out.println("-----------");

		//�迭�� ������ null�� �ƴѰ�� , ��ü�� �ʵ��� ���� ���
		for(int i=0; i<accountArray.length; i++) {
			//�� ���� ��ü�� ��� ������ ����
			Account account = accountArray[i];	//0~99 ���� ��ü�� account ���������� ��´�. 
			if(account != null) {	//�� ���� ���� null�� �ƴ� ��츸 ��ü������ �����ͼ� ���.
				System.out.print(account.getAno()); //��������.
				System.out.print("    ");
				System.out.print(account.getOwner()); //�̸�
				System.out.print("    ");
				System.out.print(account.getBalance()); //�ݾ�
				System.out.println(); //���ΰ���				
			}
		}		
	}
	private static void deposit() {
		//3.���� : ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ� : �ش� ���¿� ����.		
		//1.����ڷκ��� �Ա��� ���¸� �޾ƾ��Ѵ�.
		//2.����ڷ� ���� ���¹�ȣ�� �迭�� ����� ��ü���� ���� ��ȣ�� Ȯ���� �ش� ���¿� �Ա�.
		
		System.out.println("---------");
		System.out.println("3.�����ϱ�");
		System.out.println("---------");
		System.out.println("������ ���¹�ȣ�� �Է��ϼ���.");
		String ano =sc.next();
		System.out.println("������ �ݾ��� �Է��ϼ���.");
		int money = sc.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano); 	//findAccount(���¹�ȣ)
		
		if (account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.");
			return;  //�޼ҵ� ����.
		}
		account.setBalance(account.getBalance() + money);	//setter�� ����ؼ� ������ �ݾ� + �߰� �Ա�
		System.out.println("��� : ������ ���������� �Ա� �Ǿ����ϴ�.");		
	}
	
	private static void withdraw() {
		//4.��� : ���¹�ȣ�� ��ǲ�޾� �ش� ���¸� ��ü���� ã�Ƽ� ���.
		System.out.println("----------");
		System.out.println("4.����ϱ�");
		System.out.println("----------");
		System.out.println("����� ���¹�ȣ�� �Է��ϼ��� >>");
		String ano =sc.next();
		System.out.println("����� �ݾ��� �Է��ϼ���>>");
		int money = sc.nextInt();			
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano); 	//findAccount(���¹�ȣ)
		
		if (account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.");
			return;  //�޼ҵ� ����.
		}
		account.setBalance(account.getBalance() - money);	//setter�� ����ؼ� ������ �ݾ� + �߰� �Ա�
		System.out.println("��� : ������ ���������� ��� �Ǿ����ϴ�.");
		System.out.println("���� �ݾ� : " + account.getBalance());
	}
	
	//�迭���� Account ��ü���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	//����, ����Ҷ� �����ڵ�, ���� �޼ҵ忡�� �ߺ� ���� �� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ����� �ش�.
	private static Account findAccount(String ano) {
		Account account = null;
		//�ڵ� �ۼ�
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {   //�迭���� ���� null�� �ƴҰ�쿡 ��ü�� ano[����] ��ȣ.
				//�� ��ü�� ���� ano�� ��� ���� ����
				String dbAno = accountArray[i].getAno(); // �迭�� �� �濡 ����� ��ü�� ano�� dbAno ������ �Ҵ�.
				 if(dbAno.equals(ano)) {
					 account = accountArray[i];
					 break;
				 }
			}
		}
		return account;
	}
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.println("����>>");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount(); //�޼ҵ� ȣ��, ��ü �������� �޼ҵ������ ȣ��(static),
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				break;
			}
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");

	}

}
