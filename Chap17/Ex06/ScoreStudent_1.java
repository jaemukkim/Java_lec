package Chap17.Ex06;

/*
	1. �л��� : ������ ���� �Է� ������ ArrayList�� capacity ũ������
	2. �����Է� : �Է� ���� �л����� ���� ���� �Է�. ArrayList�� ��ü�� ����
	3. ���� ����Ʈ : ArrayList�� ����� Student ��ü�� �����ͼ� score ���.
	4. �м� : �ְ����� :     ,  ������� : 
	5. ����
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
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = sc.nextInt();

            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                	//�ڵ� �ۼ� 
                
                System.out.println("�Է¿Ϸ�");
                
            } else if(selectNo == 2) {
            		//�ڵ��ۼ�
               
            } else if(selectNo == 3) {
            		//�ڵ��ۼ�
             
            } else if(selectNo == 4) {
            	//�ڵ��ۼ�
            	int maxScore = 0;
            	int sum = 0;
            	
              System.out.println("�ְ����� : " + maxScore);
              System.out.println("������� : " + (float) sum / studentNum);
         
            } else if(selectNo == 5) {
            	//�ڵ��ۼ�
            	break;
              }
        }
        System.out.println ("���α׷� ����");
	}
}
