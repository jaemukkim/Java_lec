package chap04;
public class Ex03_While {
	public static void main(String[] args) {

		// 1. while 의 기본 문법
		int a = 0;			// 초기값
		
		while( a < 10) { 	// 조건
			System.out.print(a + " ");			
			a++;			//증감식
		}
			//0,1,2,3,4.....9 : 10번 출력
		System.out.println();
		
		//for 문으로 변환
		for( int i = 0; i<10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//While문의 10부터 시작해서 1씩 감소
		int b = 10;
		while(b > 0) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
		
		//for문의 10부터 시작해서 1씩 감소
		for(int i=10; i > 0; i--) {
			System.out.print(i +" ");
		}
		
		// While문의 무한루프
		
		/*while(true) {
			System.out.println("While의 무한 루프");
		}
		*/	
		
		// while 의 무한루프 중지		
		int c1 = 0;
		while (true) {
			
			if( c1 > 100) {
				break;
			}
			System.out.println(c1);
			
			c1++;
		}
		
		
	}

}
