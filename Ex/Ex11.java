package Ex;
public class Ex11 {
	public static void main(String[] args) {
		
		//String �� ���� �Ҵ� �Ҷ� �����ڸ� ���ؼ� �Ҵ�. // ������ �޸� ������ ������.
		String aa = new String("�ȳ�");
		String bb = new String("�ȳ�");
		System.out.println(aa);
		System.out.println(bb);
		
		//�⺻ �ڷ����ϋ� : == (���� ��)
		//���� �ڷ����ϋ� : == (�����ϴ� �ּ��� ������ ��)
		//���� �ڷ����϶� ���� �� : str1.equals(str2) <== �������� str1 ���� str2�� �� �ִ� ���� ��.
				
		if(aa==bb) {				//�޸��� �ּ� ���� ��(aa, bb�� �ٸ� �޸� �ּҸ� ���´�.
			System.out.println(true);
		}else {
			System.out.println(false);	//false (����Ű�� �ּҰ��� �ٸ���.
		}
		System.out.println("=======================");
		
		if(aa.equals(bb)) {			//�޸��� ���� ���Ҷ� aa.equals(bb)
			System.out.println(true);	// true�� ���(���� ��)
		}else {
			System.out.println(false);
		}
		System.out.println("======================");
		System.out.println("======================");
		
		//String �� ���� ���ͷ� ���� �ٷ� �Ҵ�. //�޸� ������ �����Ѵ�.
		String a = "�ȳ�";
		String b = "�ȳ�";
		
		if(a==b) {					//���� �ڷ������� "==" : �޸��� �ּҸ� ��
			System.out.println(true); //true
		}else {
			System.out.println(false);
		}

	}

}
