package Ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int nu = 0;			//스캐너로 번호를 인풋 받는 변수
		
		do {
			nu = sc.nextInt();
			
			System.out.println("================================================");
			System.out.println(" 1.19단 출력 | 2. 홀수단만 출력 | 3. 3의배수단만 출력 | 4. 프로그램 종료");
			System.out.println("================================================");
			System.out.println("번호를 입력해주세요 >>>");
			
			if(nu == 1) { //이중 for 문을 사용해서 19단 출력
				for(int i=1; i<=19; i++) {
					for(int j=1; j<=19; j++)
						System.out.println(i + " * " + j + " : " + (i*j));
				}
				
			}else if(nu == 2) { //홀수단만 출력
				for(int i=1; i<=19; i++) {
					for(int j=1; j<=19; j++)
						if(i%2==1){
						System.out.println(i + " * " + j + " : " + (i*j));
						}
				}				
			}else if(nu == 3) { //3의 배수단만 출력
				for(int i=1; i<=19; i++) {
					for(int j=1; j<=19; j++)
						if(i%3==0) {
							System.out.println(i + " * " + j + " : " + (i*j));
						}
				}				
			}else if(nu == 4) { //프로그램 종료
				break;				
			}			
			
		}while(run);
		
		//스캐너를 메모리에서 삭제후 프로그램 종료
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
