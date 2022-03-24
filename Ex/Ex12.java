package Ex;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		/*문항12. 컴퓨터와 가위바위보 / "그만" 입력하면 게임은 끝난다.	
		
		System.out.println("가위 바위 보!");
		Scanner scan= new Scanner(System.in);
		String me = scan.next();
		int n = (int)(Math.random()*3);
		String str[] = {"가위", "바위", "보"};
		//if(str[n].equals("바위"));
		
		if(me.equals("바위") || str[n].equals("가위")) {
			System.out.println("사용자 바위 = "+"컴퓨터 = 가위 "+"  사용자가 이겼습니다.");
			return;
		}else if(me.equals("가위") || str[n].equals("가위") ) {
			System.out.println("사용자 = 가위 "+"컴퓨터 = 가위 "+"  비겼습니다.");
			return;
		}else {
			System.out.println(" 게임을 종료합니다.");
		}
		scan.close();
		*/
		/*		
		int n =(int)(Math.random()*3);	//0,1,2 : n의 값
			//Math.random() : 0.000000xxx ~ 0.999999xx
		System.out.println(n);
		*/
		
		Scanner sc = new Scanner(System.in);
		String[] str = {"가위", "바위", "보"};
		String user, com; // user : 당신이 낸값(스캐너로 인풋)
						  // com  :	컴퓨터가 낸 값 (난수 발생기(Math.random()으로 인풋
		int n ; //컴퓨터가 낸 값(0, 1, 2), 0 : 가위, 1 : 바위, 2 : 보
		
		System.out.println("컴퓨터와 \'가위 바위 보\' 게임을 합니다. ");
		
		do {
			System.out.println("가위 바위 보 ! >>> ");
			user = sc.next();				//당신이 내는 값 : 인풋
			if(user.equals("그만")) break; // {break;}
			
			n = (int)(Math.random()*3);		//컴퓨터가 내는 값 : 0, 1, 2
			com = str[n];				//컴퓨터가 내는 값: 0:가위, 1:바위, 2:보
			
			if(user.equals("가위")) {				// 사용자가 가위일때 ?
				if(com.equals("가위")) {
					System.out.println("사용자 = "+ user + " , 컴퓨터 = "+ com + " 비겼습니다.");
				}else if(com.equals("바위")) {
					System.out.println("사용자 = "+ user + " , 컴퓨터 = "+ com + " 컴퓨터가 이겼습니다.");
				}else if(com.equals("보")) {
					System.out.println("사용자 = "+ user + " , 컴퓨터 = "+ com + " 당신이 이겼습니다.");
				}
				
				
			}else if(user.equals("바위")){		//사용자가 바위 일때 ?
				if(com.equals("가위")) {
					System.out.println("사용자 = "+ user + " , 컴퓨터 = "+ com + " 당신이 이겼습니다.");
				}else if(com.equals("바위")) {
					System.out.println("사용자 = "+ user + " , 컴퓨터 = "+ com + " 비겼습니다.");
				}else if(com.equals("보")) {
					System.out.println("사용자 = "+ user + " , 컴퓨터 = "+ com + " 컴퓨터가 이겼습니다.");
				}
				
			}else if(user.equals("보")) {		//사용자가 보 일때 ?
				if(com.equals("가위")) {
					System.out.println("사용자 = "+ user + " , 컴퓨터 = "+ com + " 컴퓨터가 이겼습니다.");
				}else if(com.equals("바위")) {
					System.out.println("사용자 = "+ user + " , 컴퓨터 = "+ com + " 당신이 이겼습니다.");
				}else if(com.equals("보")) {
					System.out.println("사용자 = "+ user + " , 컴퓨터 = "+ com + " 비겼습니다.");
				}
			}
			
					
			
		}while(true);
		
		sc.close();
		System.out.println("프로그램을 종료 합니다. ");
		
		
		
	}

}
