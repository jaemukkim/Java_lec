package EmployeeInfo;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import EmployeeInfo.D.Employee;

class Employee{ //����� ������ ���� Ŭ����
	int empNo;		//�����ȣ
	String empName; //����̸�
	String phone;	
	int age;	
	String dept; //�μ�
	String compRank; //����
	
	Employee(int empNo, String empName, String phone, int age, String dept, String compRank){
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		this.compRank = compRank;
				
	}

	public int getempNo() {
		return empNo;
	}

	public void setempNo(int empNo) {
		this.empNo = empNo;
	}

	public String getempName() {
		return empName;
	}

	public void setEmpeame(String empName) {
		this.empName = empName;
	}

	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public String getdept() {
		return dept;
	}

	public void setdept(String dept) {
		this.dept = dept;
	}

	public String getcompRank() {
		return compRank;
	}

	public void setcompRank(String compRank) {
		this.compRank = compRank;
	}
	
}

public class Employee_Info {	
	
	private static TreeSet<Employee> tSet = new TreeSet(new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.getempNo() < o2.getempNo()) {
				return 1;
			}else if(o1.getempNo() == o2.getempNo()) {
				return 0;
			}else {
				return 1;
			}
		};
		
	});
	
	private static	Scanner sc = new Scanner(System.in);
	private static void createEmployee() {
		System.out.println("=====================");
		System.out.println("�ű� ����� ������ �Է��ϼ���");
		System.out.println("=====================");
		System.out.println("- ��� :");
		int empNo = sc.nextInt();
		System.out.println("- �̸� :");
		String empName = sc.next();
		System.out.println("- ����ó :");
		String phone = sc.next();
		System.out.println("- ���� :");
		int age = sc.nextInt();
		System.out.println("- �μ� :");
		String dept = sc.next();
		System.out.println("- ���� :");
		String compRank = sc.next();
		
		Employee newEmployee = new Employee(empNo, empName, phone, age, dept, compRank);
		
			tSet.add(newEmployee);
			
			System.out.println("���������� �ԷµǾ����ϴ�.");
	}
	
	private static void ShowInfo() {
		
	}
	
	
	
	private static void EmpInfo(int empNo) {
		//Iterator
		
	}
	
	private static void ChaEmpInfo() {
		//switch / case
	}
	

	public static void main(String[] args) {
		
		
		
		while(true) {
			System.out.println("==========������� ���α׷�==========");
			System.out.println("1. ������� �űԵ��");
			System.out.println("2. ������� �˻�");
			System.out.println("3. ������� ����");
			System.out.println("4. ������� ����");
			System.out.println("5. ���α׷� ����");
			System.out.println("================================");
			int No = sc.nextInt();
			
			if(No == 1) {
				createEmployee();
			}else if(No == 2) {
				
			}else if(No == 3) {
				
			}else if(No ==4) {
				
			}else if(No ==5) {
				break;
			}
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
		
		
		
		
		

	}

}
