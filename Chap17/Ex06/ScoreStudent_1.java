package Chap17.Ex06;

/*
	1. 학생수 : 임의의 값을 입력 했을때 ArrayList의 capacity 크기지정
	2. 점수입력 : 입력 받은 학생수에 따라서 점수 입력. ArrayList에 객체를 저장
	3. 점수 리스트 : ArrayList에 저장된 Student 객체를 가져와서 score 출력.
	4. 분석 : 최고점수 :     ,  평균점수 : 
	5. 종료
*/
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int score; 
}

public class ScoreStudent_1 {

	public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<Student>();

        boolean run = true;
        int studentNum = 0;
        Scanner sc = new Scanner(System.in);
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = sc.nextInt();

            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                	//코드 작성 
                
                System.out.println("입력완료");
                
            } else if(selectNo == 2) {
            		//코드작성
               
            } else if(selectNo == 3) {
            		//코드작성
             
            } else if(selectNo == 4) {
            	//코드작성
            	int maxScore = 0;
            	int sum = 0;
            	
              System.out.println("최고점수 : " + maxScore);
              System.out.println("평균점수 : " + (float) sum / studentNum);
         
            } else if(selectNo == 5) {
            	//코드작성
            	break;
              }
        }
        System.out.println ("프로그램 종료");
	}
}
