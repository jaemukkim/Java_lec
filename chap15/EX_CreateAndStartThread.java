package chap15;

/*
쓰레드 4개 생성 : 1, Thread를 상속,  2. Runnable 구현,   3. 익명 내부클래스를 생성해서 구현
각 값을 String 배열에 저장 후 아래와 같이 출력하세요.
1		2 		3		4
이름		홍길동	이순신	신사임당
나이		40		50		60
국어
영어
수학


*/
class name extends Thread {
	@Override
	public void run() {
		String[] name = {"이름 ", "나이 ", "국어 ", "영어 ", "수학 " };
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

		
		String[] score = {"홍길동","10" , "20" , "30" , "40" };
		try {Thread.sleep(60);} catch (InterruptedException e1) {}
		for(int i=0; i<score.length; i++) {
			System.out.print(" " + score[i]);
			try {Thread.sleep(50);} catch (InterruptedException e) {}
		}
	};
}


public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		//1. Thread 상속
		Thread score = new name();
		score.start();		
		

		//2.Runnable 구현
		Runnable sco = new Student();
		Thread thread = new Thread(sco);
		thread.start();
		
		
		//3.익명 내부클래스를 생성해서 구현
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				
				String[] score = {"이순신","50", "60", "70", "80"};
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
						String[] score = {"신사임당", "100", "90", "80", "70"};
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
