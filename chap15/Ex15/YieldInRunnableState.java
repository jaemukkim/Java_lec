package chap15.Ex15;

import chap15.Ex06.ThreadProperties_1;

//Thread.yield() : �������� ������� (RUNNABLE)�� �ִ� Ư�� �����忡�� �ڽ��� ������� �Ͻ� �纸
	// ������� ���ο��� �ٸ� �����带 ���� ���� �ϵ��� �纸.
	// ����ȭ���� key�� ���� �����ϴ� ������ �߻��Ǵµ�.... Ű�� �纸�ؼ� �յ��ϰ� ó���ϵ��� �� �� ���

class MyThread extends Thread {
	boolean yieldFlag;
	@Override
	public void run() {
		while (true) {	//���ѷ���
			if(yieldFlag) {		//yieldFlag�� True�϶� �����带 �纸 ����.
				Thread.yield(); 	//�����带 �纸 ����.
			}else { 	//yieldFlag�� False�϶� ������ ������ �������
				System.out.println(getName() + "����");
				for(long i=0; i<1000000000; i++) {}  //0.5�� �ð� ����
				
			}			
		}
	}
}

public class YieldInRunnableState {
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;	//false �϶� ������ ���� ���
		thread1.setDaemon(true);	//������ �����尡 ����ɶ� ����
		thread1.start();
		
		MyThread thread2 = new MyThread();		
		thread2.setName("thread2");
		thread2.yieldFlag = true;	//ture �϶� ������ ���� ���
		thread2.setDaemon(true); 	//������ �����尡 ����ɶ� ���� 	//while ���ѷ����� ���� ���������� ����
		thread2.start();
		
		
		//������ 6�� ���� (1�ʸ��� �ѹ��� �纸)
		for(int i=0; i<6; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e) {} //0.01�� ������
			thread1.yieldFlag =! thread1.yieldFlag;	 // ���϶� ������ �����ϰ� �����϶� ���� ����
			thread2.yieldFlag =! thread2.yieldFlag;
		}
		
	}

}
