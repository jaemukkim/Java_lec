package chap15.Ex04;

//Runnable �������̽��� run()�� �����ؼ� ������ ����
class SMIFileRunnable implements Runnable { //�������̽�
	@Override
	public void run() {
		//1. �ڸ� ��ȣ ���
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {Thread.sleep(10);} catch (InterruptedException e1) {} //0.1�� ����
		for(int i = 0; i<strArray.length; i++) {
			System.out.println(" - �ڸ���ȣ " + strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		//2. ���� ������ ���
		int[] intArray = {1,2,3,4,5};
		for(int i=0; i<intArray.length; i++) {
			System.out.print("(���� ������)" + intArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_3 {

	public static void main(String[] args) {
		//ù��° ��ü ������ ����
		Runnable smi = new SMIFileRunnable();
//		smi.start(); 	//start() �޼ҵ�� Runnable �������̽� ���� �������� �ʴ´�.
		Thread thread = new Thread(smi); //Runnable ��ü�� Thread ������ ���ο� �ִ´�.
		thread.start();	//
		
		//�ι�° ��ü ������ ������ ����
		Runnable vid = new VideoFileRunnable();
		Thread thread2 = new Thread(vid);
		thread2.start();

	}

}
