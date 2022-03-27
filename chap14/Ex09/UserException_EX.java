package chap14.Ex09;

class MyAllException extends Exception{	//�Ϲݿ��� (checked Exception) - �������� (����ó��)
	public MyAllException() {				//�������� �ϳ��� ����
		super();
	}
	public MyAllException(String message) { //���� �޼��� ���, e.getMessage()
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
	//private : ĸ��ȭ, ��ü���� �� �ٷ� �������� ���ϵ��� ����
		//������, setter <== ������ �ʵ��� ���� �Ҵ�.
	
	private String season; //��,����,����,�ܿ� (���ܹ߻� : ��,����,����,�ܿ︸ �Է��ϼ���)
	private String week;	//�� ȭ �� �� �� �� �� (���ܹ߻� : ��ȭ��������ϸ� �Է��ϼ���)
	private int scoreKor;	//0~100 ���� �Է� (���ܹ߻� : 0~100���� ������ �Է��ϼ���)
	private int scoreEng; 	//0~100
	private String userID;  // 12�� �̻� 20�� ������ ���� (���ܹ߻� : 12�� �̻� 20�� ������ ���ڸ� ��������)
	
	//�ϳ��� �޼ҵ�� ó��
		
	
	
	
	void check (String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException {
		if(season != "��" && season != "����" && season != "����" && season != "�ܿ�") {
			throw new MyAllException("���ܹ߻� : �� ���� ���� �ܿ︸ �Է��ϼ���");
		}else if(week !="��" && week !="ȭ" && week !="��" && week !="��" && week !="��" && week !="��" && week !="��") {
			throw new MyAllException("���ܹ߻� : �� ȭ �� �� �� �� �ϸ� �Է��ϼ���");
		}else if(scoreKor < 0 || scoreKor > 100) {
			throw new MyAllException("���ܹ߻�(����) : 0 ~ 100���� ������ �Է��ϼ���");
		}else if(scoreEng < 0 || scoreEng > 100) {
			throw new MyAllException("���ܹ߻�(����) : 0 ~ 100���� ������ �Է��ϼ���");
		}else if(userID.length() <= 12 || userID.length() > 20) {
			throw new MyAllException("���ܹ߻� : 12�� �̻� 20�� ������ ���ڸ� ��������");
		}else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
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
			a.check("��", "��", 100, 50, "123456789asdsadsad");
		}catch(MyAllException e) {
			System.out.println(e.getMessage());
		}

	}
}
