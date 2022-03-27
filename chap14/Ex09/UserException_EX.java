package chap14.Ex09;

class MyAllException extends Exception{	//일반예외 (checked Exception) - 구문오류 (예외처리)
	public MyAllException() {				//통합으로 하나로 가능
		super();
	}
	public MyAllException(String message) { //예외 메세지 출력, e.getMessage()
		super(message);
	}
}


//class SeasonException extends Exception {
//	public SeasonException() {
//		super();
//	}
//	public SeasonException(String message) {
//		super(message);
//		}
//	}
//
//class WeekException extends Exception {
//	public WeekException() {
//		super();
//	}
//	public WeekException(String message) {
//		super(message);
//	}
//}
//
//class scoreKor extends Exception{
//	public scoreKor() {
//		super();
//	}
//	public scoreKor(String message) {
//		super(message);
//	}
//}
//
//class scoreEng extends Exception{
//	public scoreEng() {
//		super();
//	}
//	public scoreEng(String message) {
//		super(message);
//	}
//}
//
//class userID extends Exception{
//	public userID() {
//		super();
//	}
//	public userID(String message) {
//		super(message);
//	}
//}



class A {
	//private : 캡슐화, 객체생성 후 바로 접근하지 못하도록 설정
		//생성자, setter <== 제어후 필드의 값을 할당.
	
	private String season; //봄,여름,가을,겨울 (예외발생 : 봄,여름,가을,겨울만 입력하세요)
	private String week;	//월 화 수 목 금 토 일 (예외발생 : 월화수목금토일만 입력하세요)
	private int scoreKor;	//0~100 값만 입력 (예외발생 : 0~100까지 정수만 입력하세요)
	private int scoreEng; 	//0~100
	private String userID;  // 12자 이상 20자 사이의 문자 (예외발생 : 12자 이상 20자 사이의 문자만 넣으세요)
	
	//하나의 메소드로 처리
		
	
	
	
	void check (String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException {
		if(season != "봄" && season != "여름" && season != "가을" && season != "겨울") {
			throw new MyAllException("예외발생 : 봄 여름 가을 겨울만 입력하세요");
		}else if(week !="월" && week !="화" && week !="수" && week !="목" && week !="금" && week !="토" && week !="일") {
			throw new MyAllException("예외발생 : 월 화 수 목 금 토 일만 입력하세요");
		}else if(scoreKor < 0 || scoreKor > 100) {
			throw new MyAllException("예외발생(국어) : 0 ~ 100까지 정수만 입력하세요");
		}else if(scoreEng < 0 || scoreEng > 100) {
			throw new MyAllException("예외발생(영어) : 0 ~ 100까지 정수만 입력하세요");
		}else if(userID.length() <= 12 || userID.length() > 20) {
			throw new MyAllException("예외발생 : 12자 이상 20자 사이의 문자만 넣으세요");
		}else {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.season =season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
		}
		System.out.printf(season + "," + week + "," + scoreKor + "," + scoreEng + ",\n" + userID);
	}
}


public class UserException_EX {

	public static void main(String[] args){
		
		A a = new A();
		try {
			a.check("봄", "금", 100, 50, "123456789asdsadsad");
		}catch(MyAllException e) {
			System.out.println(e.getMessage());
		}

	}
}
