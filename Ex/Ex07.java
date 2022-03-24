package Ex;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
//			//문항7. 양의 정수를 10개 받아 배열에 저장하고, 배열에 있는 정수 중 3의 배수만 출력
//		int[] array = {1,5,99,22,345,125,2346,55,32,85};
//		for(int i=0; i<array.length; i++) {
//			if(array[i]%3==0) {
//				System.out.print(array[i]+" ");
//			}
//		}
//		
		Scanner sc =new Scanner(System.in);
		int[] arr1 = new int[10];
		
		System.out.println("양의 정수 10개를 입력하세요.");
		
//		System.out.println("3의 배수는 : ");
		
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
			if(arr1[i]%3==0) {
				System.out.print(arr1[i]+" ");
			}
		}
		sc.close();
	}

}
