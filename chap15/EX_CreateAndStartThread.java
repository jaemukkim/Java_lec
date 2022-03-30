package chap15;

/*
������ 4�� ���� : 1, Thread�� ���,  2. Runnable ����,   3. �͸� ����Ŭ������ �����ؼ� ����
�� ���� String �迭�� ���� �� �Ʒ��� ���� ����ϼ���.
1		2 		3		4
�̸�		ȫ�浿	�̼���	�Ż��Ӵ�
����		40		50		60
����
����
����


*/
class name extends Thread {
	@Override
	public void run() {
		try {Thread.sleep(0);} catch (InterruptedException e1) {}
		String[] name = {"�̸� ", "���� ", "���� ", "���� ", "���� " };
//		try {Thread.sleep(0);} catch (InterruptedException e1) {}
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	};
}

class Student implements Runnable {
	@Override
	public void run() {

		
		try {Thread.sleep(10);} catch (InterruptedException e1) {}
		String[] score = {"ȫ�浿","10" , "20" , "30" , "40" };
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + "\t");
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	};
}


public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		//1. Thread ���
		Thread score = new name();
		score.start();		
		

		//2.Runnable ����
		Runnable sco = new Student();
		Thread thread = new Thread(sco);
		thread.start();
		
		
		//3.�͸� ����Ŭ������ �����ؼ� ����
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				
				try {Thread.sleep(20);} catch (InterruptedException e1) {}
				String[] score = {"�̼���","50", "60", "70", "80"};
				for(int i=0; i<score.length; i++) {
						System.out.print(score[i] + "\t");
						try {Thread.sleep(200);} catch (InterruptedException e1) {}
						
					}
			};			
		}			
				);thread2.start();
				
				
				Thread thread3 = new Thread(new Runnable() {
					public void run() {
						try {Thread.sleep(30);} catch (InterruptedException e1) {}
						String[] score = {"�Ż��Ӵ�", "100", "90", "80", "70"};
						for(int i=0; i<score.length; i++) {
							System.out.println(score[i] + "\t");
							try {Thread.sleep(200);} catch (InterruptedException e1) {}						
						}
					};
				}
						);
				thread3.start();
		
		
		
		
		
		

	}

}
