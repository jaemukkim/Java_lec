package Ex;
public class Ex04 {
	public static void main(String[] args) {
		//문항4. for 문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성하세요.
//		
//		for(int i=0; i<=3; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// int lineCount; // 다음 라인으로 개행 변수
		// int starCount; // 별을 출력하는 변수
		
		 for(int lineCount=0; lineCount<=3; lineCount++) {
			 for(int starCount=0; starCount<=lineCount; starCount++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}

}
