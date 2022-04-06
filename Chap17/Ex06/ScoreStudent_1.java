package Chap17.Ex06;

/*
	1. �л��� : ������ ���� �Է� ������ ArrayList�� capacity ũ������
	2. �����Է� : �Է� ���� �л����� ���� ���� �Է�. ArrayList�� ��ü�� ����
	3. ���� ����Ʈ : ArrayList�� ����� Student ��ü�� �����ͼ� score ���.
	4. �м� : �ְ����� :     ,  ������� : 
	5. ����
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	int score; //������ �Է�, �ʵ��� �� �Ҵ�. (1.��ü ������ ����, 2.private (������, Setter, getter)
	
	Student() {}
	Student(int score){
		this.score = score;
	}


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<Student>();

        boolean run = true;
        int studentNum = 0;	//�л��� / while ����ۿ��� ����, ���� ����
        
        Scanner sc = new Scanner(System.in);
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = sc.nextInt();	//����
            List<Integer> List1 = new ArrayList<>(selectNo);     
            
            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                	//�ڵ� �ۼ� 
                 studentNum = sc.nextInt();		//�л��� ��ǲ ����.
                 System.out.println("�Է¿Ϸ�");
                 
            } else if(selectNo == 2) {
            		//�ڵ��ۼ�
            	if(studentNum == 0) {	//studentNum�� �Ҵ� �޾ƾ� for���� ������ ������ �� �ִ�.
            		System.out.println("�л����� ���� �Է��ϼ���.");
            	}else {
            		//for ���� ���ؼ� ��ǲ ���� �л� �� ��ŭ ������ �Է�.
            		for(int i=0; i<studentNum; i++) {
            			//��ǲ�� �޾Ƽ� ��ǲ ���� ���� Student ��ü�� score ������ �Ҵ�.
            			//��ü�� �����ؼ� 
            			Student student = new Student(); //�⺻ �����ڸ� ����ؼ� ��ü ����, ���� score �ʵ� ���� �Ҵ�
            			System.out.print((i + 1) + "��° �л� ������ �Է��ϼ���.");
            			student.score = sc.nextInt();
            			arr.add(student); //ArrayList�� �ʵ忡 ���� �Ҵ��� ��ü�� ArrayList�� ��
            			System.out.println("�Է� �Ϸ�"); //�Է� �Ϸ��� ����ϰ� ����
            		}
            	}
               
            } else if(selectNo == 3) {
            		//�ڵ��ۼ�  /  ���� ����Ʈ ���, ArrayList �� ������ �Ҵ�� ��ü�� ����. 
            					//��ü ������, �ʵ��� ���� �������, getter
            	if(studentNum == 0) {
            		System.out.println("�л����� ���� �Է� �ϼ���.");
            	}else {
            		for(int i=0; i<studentNum; i++) {//ArrayList ��ü�� �����ͼ� Student.score �ʵ��� ���� ���
            			Student student = arr.get(i);  //ArrayList�� get() ������ Student ��ü
            			//System.out.println(student.score); //�ʵ��� ���� ��ü�� ���� ���.
            			System.out.println(student.getScore()); //getter�� ���ؼ� ���            			
            		}
            	}
             
            } else if(selectNo == 4) {
            	//�ڵ��ۼ�
            	if(studentNum == 0 ) {
            		System.out.println("�л� ���� ���� �Է��ϼ���.");
            	}else {
            		int maxScore = 0; //�ִ� ������ �޴� �������� ���� <�ʱⰪ �Ҵ�>
            		int sum = 0;	
            		//ArrayList�� ��ü�� ������ �´�. 2.student ��ü�� score �ʵ��� ���� �����ͼ� ó��
            		for(int i=0; i<studentNum; i++) {
            			Student student = arr.get(i);
            			//�ִ� ���� ������ �Ҵ�.
            			//3�� �����ڸ� ����ؼ� �ִ밪�� ������ �Ҵ�.
            			maxScore = (student.score > maxScore)? student.score : maxScore;
            			sum += student.score; //sum = sum + student.score
            		}
            			//maxScore ������ ���� ���� ������, sum : ��� score ���� ���� ������ ��Ƽ�
            			System.out.println("�ְ����� : " + maxScore);
                        System.out.println("������� : " + (float) sum / studentNum);
            	} 	
              
         
            } else if(selectNo == 5) {
            	//�ڵ��ۼ�
            	//run = false;    / while�� false�϶� ��������.
            	break;
              }
        }
        sc.close();
        System.out.println ("���α׷� ����");
	}
}
