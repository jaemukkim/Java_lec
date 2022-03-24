package chap04;
import java.util.Scanner;
public class PPP {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.print("랜덤으로 나온 10개의 정수는 ");
		
		
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*10+1);{
					System.out.print(array[i]+" ");				
			}						
		}
		double sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
			
			}
		System.out.println("\r\n평균값은" + sum/array.length);
			
		
		
		
	}
	
}
	
		



