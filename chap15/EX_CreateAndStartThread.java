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
		String[] name = {"�̸� ", "���� ", "���� ", "���� ", "���� " };
//		try {Thread.sleep(0);} catch (InterruptedException e1) {}
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
			try {Thread.sleep(10);} catch (InterruptedException e) {}
		}
	};
}

class Student implements Runnable {
	@Override
	public void run() {

		
		String[] score = {"ȫ�浿","10" , "20" , "30" , "40" };
		try {Thread.sleep(60);} catch (InterruptedException e1) {}
		for(int i=0; i<score.length; i++) {
			System.out.print(" " + score[i]);
			try {Thread.sleep(50);} catch (InterruptedException e) {}
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
				
				String[] score = {"�̼���","50", "60", "70", "80"};
				try {Thread.sleep(60);} catch (InterruptedException e1) {}
				for(int i=0; i<score.length; i++) {
						System.out.println(" " + score[i]);
						try {Thread.sleep(60);} catch (InterruptedException e1) {}
						
					}
			};			
		}			
				);thread2.start();
				
				
				Thread thread3 = new Thread(new Runnable() {
					public void run() {
						String[] score = {"�Ż��Ӵ�", "100", "90", "80", "70"};
						try {Thread.sleep(60);} catch (InterruptedException e1) {}
						for(int i=0; i<score.length; i++) {
							System.out.print(" " + score[i]);
							try {Thread.sleep(50);} catch (InterruptedException e1) {}						
						}
					};
				}
						);
				thread3.start();
		
		
		
		
		
		

	}

}
