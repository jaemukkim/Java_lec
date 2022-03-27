package chap15.Ex06;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		//1. 객체 가져오기(currentThread())  // 쓰레드 수 (activeCount())
			//static 
		Thread curThread = Thread.currentThread();	//main Thread
		//클래스(타입) 참조변수 = 클래스명.메소드명
		System.out.println("현재 스레드의 이름 : " + curThread.getName());
		System.out.println("동작하는 스레드수 : " + Thread.activeCount());
		
		//2. 스레드의 이름 출력(자동출력) - JVM 스레드이름을 자동 할당 - Thread-0 ,,,,Thread-9
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()); //쓰레드 이름 출력
			thread.start();
		}
		
		System.out.println("============================");
		//3. 쓰레드 이름 직접 시청 : 객체명.setName()
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			thread.setName(i + " 번째 쓰레드 ");
			System.out.println(thread.getName());
			thread.start();
		}
		System.out.println("==========================");
		//4. 스레드의 이름 출력 (자동출력) -JVM 스레드이름을 자동 할당 - Thread-0 ,,,Thread-9
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()); //쓰레드 이름 출력
			thread.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
		//5. 쓰레드 수 출력하기
		System.out.println("동작하는 쓰레드 수: " + Thread.activeCount());
		
		
		
	}

}
