package Ex;
public class Ex09_1 {
	public static void main(String[] args) {
		
		int[] num = new int[10];
		int sum = 0;
		double avg = 0;		//��� = ��ü���� ���ؼ� (sum) / ���� ����
							//����� ��� �ҋ��� �ݵ�� double ������ ����
		
		System.out.print("������ ������ : ");
		
		//�迭�� �� �濡 ������ ���� �߻����Ѽ� �Է� : 1 ~ 10
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10+1); // num[0] ~ num[9] ������ ���� : 1~10
			System.out.print(num[i]+" ");	
		}
		
		//��հ� : �迭�� �� ���� ������ ���� ���ؼ� ��ü ���� ������ ������.
		for(int i=0; i<num.length; i++) {	
			sum += num[i];
			avg = (double)sum / num.length;			
		}
		System.out.println("\r��հ��� " + avg );
		System.out.println("���� : " + sum);
		System.out.println("���� ������ : " + num.length);
	}

}
