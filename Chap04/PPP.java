package chap04;
import java.util.Scanner;
public class PPP {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.print("�������� ���� 10���� ������ ");
		
		
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*10+1);{
					System.out.print(array[i]+" ");				
			}						
		}
		double sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
			
			}
		System.out.println("\r\n��հ���" + sum/array.length);
			
		
		
		
	}
	
}
	
		



