package Ex;
public class Ex10 {
	public static void main(String[] args) {
		//문항10. 반복문을 이용하여 369 게임 1~99		
		
		for(int i=1; i<=100; i++) {
			int a = i%10;		// 1의 자리를 의미, i를 10으로 나누어서 나머지만 가져옴.
			int b = i/10;		// 10의 자리를 의미, i를 10으로 나누어서 몫만 가져옴.
			
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println(i+" 박수 짝짝");
			}else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)) {
				System.out.println(i+" 박수 짝");
			}
		}
//		for(int i=1; i<100; i++) {
//			int a = i%10;		// 1의 자리를 의미, i를 10으로 나누어서 나머지만 가져옴.
//			int b = i/10;		// 10의 자리를 의미, i를 10으로 나누어서 몫만 가져옴.
//			
//			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
//				System.out.println(i+" 박수 짝짝");				
//			}else if ((a==3 || a==6 || a==0) &&(b!=3 || b!=6 || b!=9)) {
//				System.out.println(i+" 박수 짝");
//			}else if ((a!=3 || a!=6 || a!=9) && (b==3 || b==6 || b==9)) {
//				System.out.println(i +" 박수 짝");
//			}
//		}
	}

}
