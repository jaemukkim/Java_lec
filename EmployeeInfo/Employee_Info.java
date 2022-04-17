package EmployeeInfo;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

class Employee implements Comparable<Employee> { //사원의 정보를 담은 클래스
	int empNo;		//사원번호
	String empName; //사원이름
	String phone;	
	int age;	
	String dept; //부서
	String compRank; //직급
	
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
//TreeSet : 중복된 데이터를 저장할 수 없다. Wrapper 클래스는 재정의 되어있다. equals(), hashcode()
		// Comparable compareTo(), Comparator compare()
		// 일반객체를 set 자료형에 저장할 때는 객체의 특정필드가 중복 저장되지 않도록 equals(), hashcode() 재정의..
		//
	//Wrapper : 기본자료형을 객체와 기본자료형에는 없는 메소드를 추가 (Boolean, Byte, Charator, Integer, Double...)
		//Comparable compareTo() : 상속해서 구현, 객체 수정, Comparator compare() : 수정없이 사용가능 재정의 되어


public class Employee_Info {	
	
	private static TreeSet<Employee> tSet = new TreeSet();


	
	private static	Scanner sc = new Scanner(System.in);
	private static void createEmployee() {
		System.out.println("=====================");
		System.out.println("신규 등록할 정보를 입력하세요");
		System.out.println("=====================");
		System.out.println("- 사번 :");
		int empNo = sc.nextInt();
		System.out.println("- 이름 :");
		String empName = sc.next();
		System.out.println("- 연락처 :");
		String phone = sc.next();
		System.out.println("- 나이 :");
		int age = sc.nextInt();
		System.out.println("- 부서 :");
		String dept = sc.next();
		System.out.println("- 직급 :");
		String compRank = sc.next();
		
		Employee newEmployee = new Employee(empNo, empName, phone, age, dept, compRank);
		
			tSet.add(newEmployee);
			
			System.out.println("성공적으로 입력되었습니다.");
	}
	
	private static void ShowEmpInfo() {
		Iterator<Employee> itr = tSet.iterator();
		System.out.println("사번\t이름\t연락처\t나이\t부서\t직급");
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
		System.out.println("삭제할 사번 : ");
		int empNo = sc.nextInt();
		
		tSet.remove(sc);
		
		System.out.println("입력하신 정보가 삭제되었습니다.");
	}

	

	public static void main(String[] args) {
		
		
		
		while(true) {
			System.out.println("==========사원관리 프로그램==========");
			System.out.println("1. 사원정보 신규등록");
			System.out.println("2. 사원정보 검색");
			System.out.println("3. 사원정보 수정");
			System.out.println("4. 사원정보 삭제");
			System.out.println("5. 프로그램 종료");
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
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
	
	}

}
