package Ex;

public class Ex09 {

	public static void main(String[] args) {
			//����9. ������ 10�� �����ϴ� �迭�� ����� 1~10���� ������ ������ �����ϰ� ����/�迭, ��հ�
		/*
		int array[] = new int[10];
		int c = (int)(Math.random()*10+1);
		double sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
			System.out.print(c );
			
		}
		*/
		double c = (double) Math.random();	//���� �߻���(������ ���� �ڵ����� �߻���Ŵ)
				// 0.000000xxx ~ 0.999999xxx    <== ������ ������ ���� �߻���Ŵ
		System.out.println(c);
		
		int d = (int)(Math.random()*10); //0 ~ 9 ������ ������ ���� ����
		int e = (int)(Math.random()*10+1); //0 ~ 10 ������ ������ ���� ����
		
		System.out.println("0���� 9������ ������ �� : " + d);
		System.out.println("1���� 10������ ������ �� : " + e);
		
		// 1���� 100������ ������ �߻���Ŵ
		int f = (int)(Math.random()*100+1);
		System.out.println("1���� 100 ������ ������ �� : " + f);
	
		
		
		
		
		
		
	}

}
