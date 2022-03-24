package chap14.Ex08;

//ID의 값을 NULL일 경우 Exception 발생
//userID가 : 8자 이상 20자가 아닌 경우 Exception

//일반예외
class IDFormatException extends Exception {	//2개의 생성자만 구성
	public IDFormatException() {
		super();
	}
	public IDFormatException(String message) {	//예외 발생시 메세지 출력, e.getMessage();
		super(message);
	}
	
}


public class IDFormatTest {
	private String userID ;		//체크 : null, 8자 이상 20자가 아닌 경우 Exception
		//userID 캡슐화 됨. private : 외부나 다른 클래스에 접근X
			//생성자를, setter를 사용해서 값을 할당.
		//private으로 설정된 경우 : getter나 setter를 사용
	
	public String getUserID() {	//getter //메소드 호출시 메모리의 userID를 던져줌
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException { //setter : 메모리의 값을 할당.
		
		if (userID == null) {
			throw new IDFormatException("아이디는 Null일 수 없습니다.");
		}else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자이상 20자 이하로 사용 가능합니다");
		}else {
			System.out.println("정상적으로 잘 입력 되었습니다.");
		}
		this.userID = userID;
	}
	

	public static void main(String[] args) {
		
		IDFormatTest test = new IDFormatTest();
		
		//userID가 null인 경우
		String userID = null;
		try {
			test.setUserID(userID); 	//setter 호출시 null 입력후 호출
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("===========================");
		
		//2. userID를 7자 넣은 경우
		userID = "1234567";
		try {
			test.setUserID(userID);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage()); //메세지 출력
		}
		System.out.println("==========================");
		
		//3. null이 아니고 8자 이상 20자 미만 : 정상
		userID = "abcdef1234";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserID());
	}

}
