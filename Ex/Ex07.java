package Ex;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
//			//����7. ���� ������ 10�� �޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �� 3�� ����� ���
//		int[] array = {1,5,99,22,345,125,2346,55,32,85};
//		for(int i=0; i<array.length; i++) {
//			if(array[i]%3==0) {
//				System.out.print(array[i]+" ");
//			}
//		}
//		
		Scanner sc =new Scanner(System.in);
		int[] arr1 = new int[10];
		
		System.out.println("���� ���� 10���� �Է��ϼ���.");
		
//		System.out.println("3�� ����� : ");
		
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
			if(arr1[i]%3==0) {
				System.out.print(arr1[i]+" ");
			}
		}
		sc.close();
	}

}
