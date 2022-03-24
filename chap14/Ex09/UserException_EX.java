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
	String season; //��,����,����,�ܿ� (���ܹ߻� : ��,����,����,�ܿ︸ �Է��ϼ���)
	String week;	//�� ȭ �� �� �� �� �� (���ܹ߻� : ��ȭ��������ϸ� �Է��ϼ���)
	int scoreKor;	//0~100 ���� �Է� (���ܹ߻� : 0~100���� ������ �Է��ϼ���)
	int scoreEng; 	//0~100
	String userID;  // 12�� �̻� 20�� ������ ���� (���ܹ߻� : 12�� �̻� 20�� ������ ���ڸ� ��������)
	
	void check (String season, String week, int scoreKor, int scoreEng, String userID) throws SeasonException, WeekException, chap14.Ex09.scoreKor, chap14.Ex09.scoreEng, chap14.Ex09.userID {
		if(season != "��" && season != "����" && season != "����" && season != "�ܿ�") {
			throw new SeasonException("���ܹ߻� : �� ���� ���� �ܿ︸ �Է��ϼ���");
		}else if(week !="��" && week !="ȭ" && week !="��" && week !="��" && week !="��" && week !="��" && week !="��") {
			throw new WeekException("���ܹ߻� : �� ȭ �� �� �� �� �ϸ� �Է��ϼ���");
		}else if(scoreKor < 0 | scoreKor >= 100) {
			throw new scoreKor("���ܹ߻�1 : 0 ~ 100���� ������ �Է��ϼ���");
		}else if(scoreEng < 0 | scoreEng >= 100) {
			throw new scoreEng("���ܹ߻�2 : 0 ~ 100���� ������ �Է��ϼ���");
		}else if(userID.length() < 12 || userID.length() > 20) {
			throw new userID("���ܹ߻� : 12�� �̻� 20�� ������ ���ڸ� ��������");
		}else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
		}
	}
}


public class UserException_EX {

	public static void main(String[] args) {
		A a = new A();
		try {
			a.check("����", "��", 91, 99, "123456789abcd");
		} catch (SeasonException | WeekException | scoreKor | scoreEng | userID e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
