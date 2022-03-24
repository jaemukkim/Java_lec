package chap14.Ex09;


class SeasonException extends Exception {
	public SeasonException() {
		super();
	}
	public SeasonException(String message) {
		super(message);
		}
	}

class WeekException extends Exception {
	public WeekException() {
		super();
	}
	public WeekException(String message) {
		super(message);
	}
}

class scoreKor extends Exception{
	public scoreKor() {
		super();
	}
	public scoreKor(String message) {
		super(message);
	}
}

class scoreEng extends Exception{
	public scoreEng() {
		super();
	}
	public scoreEng(String message) {
		super(message);
	}
}

class userID extends Exception{
	public userID() {
		super();
	}
	public userID(String message) {
		super(message);
	}
}



class A {
	String season; //봄,여름,가을,겨울 (예외발생 : 봄,여름,가을,겨울만 입력하세요)
	String week;	//월 화 수 목 금 토 일 (예외발생 : 월화수목금토일만 입력하세요)
	int scoreKor;	//0~100 값만 입력 (예외발생 : 0~100까지 정수만 입력하세요)
	int scoreEng; 	//0~100
	String userID;  // 12자 이상 20자 사이의 문자 (예외발생 : 12자 이상 20자 사이의 문자만 넣으세요)
	
	void check (String season, String week, int scoreKor, int scoreEng, String userID) throws SeasonException, WeekException, chap14.Ex09.scoreKor, chap14.Ex09.scoreEng, chap14.Ex09.userID {
		if(season != "봄" && season != "여름" && season != "가을" && season != "겨울") {
			throw new SeasonException("예외발생 : 봄 여름 가을 겨울만 입력하세요");
		}else if(week !="월" && week !="화" && week !="수" && week !="목" && week !="금" && week !="토" && week !="일") {
			throw new WeekException("예외발생 : 월 화 수 목 금 토 일만 입력하세요");
		}else if(scoreKor < 0 | scoreKor >= 100) {
			throw new scoreKor("예외발생1 : 0 ~ 100까지 정수만 입력하세요");
		}else if(scoreEng < 0 | scoreEng >= 100) {
			throw new scoreEng("예외발생2 : 0 ~ 100까지 정수만 입력하세요");
		}else if(userID.length() < 12 || userID.length() > 20) {
			throw new userID("예외발생 : 12자 이상 20자 사이의 문자만 넣으세요");
		}else {
			System.out.println("정상적으로 잘 입력되었습니다.");
		}
	}
}


public class UserException_EX {

	public static void main(String[] args) {
		A a = new A();
		try {
			a.check("가을", "토", 91, 99, "123456789abcd");
		} catch (SeasonException | WeekException | scoreKor | scoreEng | userID e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
