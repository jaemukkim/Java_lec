package Chap17.Ex15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

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
	
	@Override
		public boolean equals(Object obj) {
		if(obj instanceof Account) {
			if(this.ano.equals(((Account)obj).ano)){
				return true;
			}
		}
		return false;
	}
	@Override
		public int hashCode() {
			return Objects.hash(ano);			
		}
	
	
}

public class BankAccountUsingHashSet {
	//������ ���¸� ������ �ִ�.
	//���� ��ȣ�� �ߺ� �����̵Ǹ� �ȵȴ�. ano�÷��� �ߺ� ����Ǹ� �ȵǰ� �����ϰ� Set�� ����.
	
	private static Set<Account> aSet = new HashSet();
	private static Scanner sc = new Scanner(System.in);
	
		//�÷����� ���� ���� ���� ��� add() : ���� ������ �濡 ���� �߰��� ���,  size() 
		//������ ���� �����Ҷ� remove() : ������ 
	
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
//			Iterator<Account> itr = aSet.iterator();
//			while(itr.hasNext()) {
//				if(itr.next() == null) {
//				newAccount = itr.next();		
				aSet.add(newAccount);	
					
				System.out.println("���°� ���������� �����Ǿ����ϴ�.");
				
	}
	private static void accountList() {
		//2.���� ��� ��� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
		//�迭�� �� ���� ��ȸ�ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���.
		System.out.println("-----------");
		System.out.println("2. ���¸�����");
		System.out.println("-----------");

		//�迭�� ������ null�� �ƴѰ�� , ��ü�� �ʵ��� ���� ���
		Iterator<Account> itr = aSet.iterator();
		while(itr.hasNext()) {
			Account account = itr.next();
			if(account != null) {
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
		Iterator<Account> itr = aSet.iterator();
			while(itr.hasNext()) {
				Account a1 = itr.next();
					String dbAno = a1.getAno();
					if(dbAno.equals(ano)) {
						account = a1;
						return account;
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
