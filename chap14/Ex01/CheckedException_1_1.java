package chap14.Ex01;

public class CheckedException_1_1 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 8);	//���α׷��� ������ ����Ǿ� ������.
									//���ܿ� ���� ó��
		
		}catch(ArithmeticException e) {
			//try{}���� ������ �߻��� ��쿡�� �۵�.
			//e.printStackTrace();  //������ ���� �ڼ��� ������ ���
			System.out.println("0�� ���� �� �����ϴ�.");
			
			//catch ����� ������ ���� �ʾƵ� ���� ó���� �Ȱ��̴�.
		}finally {
			//try{} ������ ��� �۵�, ������ �־ �۵�
			//try{}�� �۵��Ǹ� �׻� �۵��Ѵ�
			//��ü�� ����� ��ü�� �޸𸮸� ���� �Ҷ�, ��) sc.close();
			System.out.println("Finally{} ����� �׻� ȣ���.");
		}
		
		System.out.println("���α׷��� ���� ���� �մϴ�.");
	}

}
