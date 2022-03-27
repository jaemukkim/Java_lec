package chap15.Ex02;

//새로운 쓰레드 생성
	//1. Thread 클래스를 상속 run()를 오버라이딩해서 구현 (run(){} : 완성된 메소드)
	//2. Runable 인터페이스의 run()를 구현	( run(); : 미완성된 메소드 )

class  SMIFileThread extends Thread {
	
	@Override
	public void run() {	//생성된 쓰레드에서 작업할 내용을 구현
		//2번째 쓰레드에서 작업할 내용.
		//자막을 출력하는 쓰레드
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
//		try {Thread.sleep(20);} catch (InterruptedException e1) {}	//0.2 지연
		
		//자막 출력구문
		for(int i=0; i<strArray.length; i++) {
			System.out.println(" - (자막 번호) " + strArray[i]);
			//0.2초 지연후 출력
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
		
	}
}

public class CreateAndStartThread {

	public static void main(String[] args) {
		//0 쓰레드 작동
		Thread sm = new SMIFileThread();
		sm.start();		//run(); 메소드를 실행. - 쓰레드 시작
				//주의 : run()을 직접 호출하면 쓰레드가 작동되는 것이 아니고 메소드만 출력.
				//start() : 쓰레드를 작동하기 위한 메모리 할당 후 run() 호출 : 쓰레드로 작업됨.
		
		
		
		//1. 첫번째 쓰레드 (main Thread 에서 작동) - 비디오 프레임 출력
		int[] intarray = {1,2,3,4,5};
		
		//비디오 프레임 출력
		for(int i=0; i<intarray.length; i++) {
			System.out.print("(비디오 프레임)" + intarray[i]);
					//print
			//작업 지연(0.2초 딜레이)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	
		
	}

}
