package Ex;
class Student {                     // p.jangwoo@gmail.com
					// 자바는 다중 상속이 불가 , 자바의 모든 클래스는 Object 클래스의 자식 클래스이다. 
							//Object 클래스에서 정의한 필드나 메소드를 재사용할 수 있다. 
	String name ; 		//학생이름
	int studentID ;		//학번 
	int	kor; 			//국어점수
	int eng; 			//영어점수 
	int math;			//수학점수 	
	
	int sum; 			//점수 합	
	double avg;			//점수 평균 
	
	void hobby () {
		System.out.println("각 학생의 취미는 입니다. ");
	}

	@Override
	public String toString() {		//Object 클래스의 메소드, 객체 자체를 출력할때 , [패키지명.클래스명@해쉬코드]
		return "이름 : " + name + " , 학번 : " + studentID + " , 국어 :" + kor + " , 영어 :" + eng + 
				" , 수학 : "  + math +  " , 합계 : " + sum + "평균 : " + avg ;
		
	}	
	
}
class S_철수 extends Student {
	
	S_철수(String name, int studentID, int kor, int eng, int math){    //생성자: 1. 클래스명과 동일, 2. 리턴타입이 없어야한다. 
		super.name = name;  //super 보모 클래스 , this : 자신의 객체 
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math; 
		super.avg = (double) sum / 3;    //평균을 계산 할때는 (double)로 캐스팅 
		
	}

	@Override
	void hobby() {
		System.out.println("철수의 취미는 낙시 입니다. ");
	}
	
}
class S_영희 extends Student{
	
	S_영희 (String name, int studentID, int kor, int eng, int math){    //생성자: 1. 클래스명과 동일, 2. 리턴타입이 없어야한다. 
		super.name = name;  //super 보모 클래스 , this : 자신의 객체 
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math; 
		super.avg = (double) sum / 3;    //평균을 계산 할때는 (double)로 캐스팅 
		
	}

	@Override
	void hobby() {
		System.out.println("영희의 취미는 영화감상 입니다. ");
	}
}
class S_영식 extends Student{
	S_영식(String name, int studentID, int kor, int eng, int math){    //생성자: 1. 클래스명과 동일, 2. 리턴타입이 없어야한다. 
		super.name = name;  //super 보모 클래스 , this : 자신의 객체 
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math; 
		super.avg =  (double) sum / 3 ;    //평균을 계산 할때는 (double)로 캐스팅 
		
	}

	@Override
	void hobby() {
		System.out.println("영식의 취미는 코딩 입니다. ");
	}
}


public class Quiz03 {

	public static void main(String[] args) {
		
		Student 철수 = new S_철수("철수", 001, 80,90,100);
		Student 영희 = new S_영희("영희", 002, 95,90,70);
		Student 영식 = new S_영식("영식", 003, 60,70,85);
		
		Student[] arr = {철수, 영희, 영식}; 
		
		for ( int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		
		System.out.println("===========================");
		for ( Student k : arr) {
			System.out.println(k);
			k.hobby();
		}	
	}

}
