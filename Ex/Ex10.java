package Ex;
public class Ex10 {
	public static void main(String[] args) {
		//����10. �ݺ����� �̿��Ͽ� 369 ���� 1~99		
		
		for(int i=1; i<=100; i++) {
			int a = i%10;		// 1�� �ڸ��� �ǹ�, i�� 10���� ����� �������� ������.
			int b = i/10;		// 10�� �ڸ��� �ǹ�, i�� 10���� ����� �� ������.
			
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println(i+" �ڼ� ¦¦");
			}else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)) {
				System.out.println(i+" �ڼ� ¦");
			}
		}
//		for(int i=1; i<100; i++) {
//			int a = i%10;		// 1�� �ڸ��� �ǹ�, i�� 10���� ����� �������� ������.
//			int b = i/10;		// 10�� �ڸ��� �ǹ�, i�� 10���� ����� �� ������.
//			
//			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
//				System.out.println(i+" �ڼ� ¦¦");				
//			}else if ((a==3 || a==6 || a==0) &&(b!=3 || b!=6 || b!=9)) {
//				System.out.println(i+" �ڼ� ¦");
//			}else if ((a!=3 || a!=6 || a!=9) && (b==3 || b==6 || b==9)) {
//				System.out.println(i +" �ڼ� ¦");
//			}
//		}
	}

}
