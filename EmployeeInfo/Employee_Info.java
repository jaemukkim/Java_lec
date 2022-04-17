package EmployeeInfo;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

class Employee implements Comparable<Employee> { //����� ������ ���� Ŭ����
	int empNo;		//�����ȣ
	String empName; //����̸�
	String phone;	
	int age;	
	String dept; //�μ�
	String compRank; //����
	
	public Employee(int empNo, String empName, String phone, int age, String dept, String compRank){
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		this.compRank = compRank;
	}
	
public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCompRank() {
		return compRank;
	}

	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Employee) {
				if(empNo == ((Employee)obj).empNo){
					return true;
				}
			}
			return false;
		}
	@Override
		public int hashCode() {
			return Objects.hash(empNo);
		}

	@Override
	public int compareTo(Employee o) {
		if(this.empNo < o.empNo)
			return -1;
		else if (this.empNo == o.empNo)
			return 0;
		else 
			return 1;
	}	
}
//TreeSet : �ߺ��� �����͸� ������ �� ����. Wrapper Ŭ������ ������ �Ǿ��ִ�. equals(), hashcode()
		// Comparable compareTo(), Comparator compare()
		// �Ϲݰ�ü�� set �ڷ����� ������ ���� ��ü�� Ư���ʵ尡 �ߺ� ������� �ʵ��� equals(), hashcode() ������..
		//
	//Wrapper : �⺻�ڷ����� ��ü�� �⺻�ڷ������� ���� �޼ҵ带 �߰� (Boolean, Byte, Charator, Integer, Double...)
		//Comparable compareTo() : ����ؼ� ����, ��ü ����, Comparator compare() : �������� ��밡�� ������ �Ǿ�


public class Employee_Info {	
	
	private static TreeSet<Employee> tSet = new TreeSet();


	
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
	
	private static void ShowEmpInfo() {
		Iterator<Employee> itr = tSet.iterator();
		System.out.println("���\t�̸�\t����ó\t����\t�μ�\t����");
		while(itr.hasNext()) {
		Employee employee = itr.next();			
			if(employee != null) {
				System.out.print(employee.getEmpNo());
				System.out.print("\t");
				System.out.print(employee.getEmpName());
				System.out.print("\t");
				System.out.print(employee.getPhone());
				System.out.print("\t");
				System.out.print(employee.getAge());
				System.out.print("\t");
				System.out.print(employee.getDept());
				System.out.print("\t");
				System.out.print(employee.getDept());	
				
			}
		}
	
	}
	
	
	
	private static void EmpInfo(int empNo) {
		//Iterator
		
	}
	
	private static void ChaEmpInfo() {
		//switch / case
	}
	
	private static void remEmployee() {
		System.out.println("������ ��� : ");
		int empNo = sc.nextInt();
		
		tSet.remove(sc);
		
		System.out.println("�Է��Ͻ� ������ �����Ǿ����ϴ�.");
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
