package chap04;
public class ContinueTest {
	public static void main(String[] args) {
		
		//continue 1단~19단 / 홀수만 출력
		
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
		
		//continue 1단~19단 / 3의 배수만
		
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
