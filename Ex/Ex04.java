package Ex;
public class Ex04 {
	public static void main(String[] args) {
		//����4. for ���� �̿��ؼ� ���� ����� ���� �ﰢ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
//		
//		for(int i=0; i<=3; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// int lineCount; // ���� �������� ���� ����
		// int starCount; // ���� ����ϴ� ����
		
		 for(int lineCount=0; lineCount<=3; lineCount++) {
			 for(int starCount=0; starCount<=lineCount; starCount++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}

}
