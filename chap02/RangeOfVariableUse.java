package chap02;
public class RangeOfVariableUse {
	public static void main(String[] args) {
		// ������ �Ҹ� �ñ� - ���� ����, ���� ����
		int value1 = 3;		//���� ���� : ��� �ۿ��� ����� ����, ��� ��,�ȿ����� ��밡��
		{
			int value2 = 5;  //���� ���� : ��� �ȿ��� ����� ����, ��� �������� ��밡��			
			System.out.println(value1);
			System.out.println(value2);
			
		}
		System.out.println(value1);
//		System.out.println(value2); 	//���� ������ ��� �������� ��밡��

	}

}
