package chap04;
public class ContinueTest {
	public static void main(String[] args) {
		
		//continue 1��~19�� / Ȧ���� ���
		
		for(int i=1; i<=19; i++) {
			for(int j=1; j<=19; j++) {
				if(i%2==0) {
					continue;
				}
				System.out.println(i + " * " + j + " : " + (i*j));
			}
		}
		
		System.out.println("===============");
		System.out.println();
		
		//continue 1��~19�� / 3�� �����
		
		for(int i=1; i<=19; i++) {
			for(int j=1; j<=19; j++) {
				if(i%3 !=0) {
					continue;
				}
				System.out.println(i + " * " + j + " : " + (i*j));
			}
		}
	}
	

}
