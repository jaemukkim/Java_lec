package Ex;

import java.util.Scanner;

public class Ex11me {
	public static void main(String[] args) {
		//문항11.  다음 코드와 같이 과목과 점수가 짞을 이루도록 2개의 배열을 작성하라.
		
		System.out.println("과목 이름");
		Scanner scan= new Scanner(System.in);
		int score =  scan.nextInt();
		String c = scan.next();
		String name;
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int scores[] = {95, 88, 76, 62, 55};
		
		for(int i=0; i<course.length; i++) {
			if(course[i].equals("Java")) {
				System.out.println("Java의 점수는 "+scores[i]);
				return;
			}else if(course[i].equals("C++")){
				System.out.println("C++의 점수는 "+scores[i]);
				return;
			}else if(course[i].equals("HTML5")) {
				System.out.println("HTML5의 점수는 "+ scores[i]);
				return;
			}else if(course[i].equals("컴퓨터구조")) {
				System.out.println("컴퓨터구조의 점수는 "+scores[i]);
				return;
			}else if(course[i].equals("안드로이드")) {
				System.out.println("안드로이드의 점수는 "+scores[i]);
				return;
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}	
		scan.close();
	}		
}
