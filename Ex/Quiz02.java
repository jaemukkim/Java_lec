package Ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int nu = 0;			//��ĳ�ʷ� ��ȣ�� ��ǲ �޴� ����
		
		do {
			nu = sc.nextInt();
			
			System.out.println("================================================");
			System.out.println(" 1.19�� ��� | 2. Ȧ���ܸ� ��� | 3. 3�ǹ���ܸ� ��� | 4. ���α׷� ����");
			System.out.println("================================================");
			System.out.println("��ȣ�� �Է����ּ��� >>>");
			
			if(nu == 1) { //���� for ���� ����ؼ� 19�� ���
				for(int i=1; i<=19; i++) {
					for(int j=1; j<=19; j++)
						System.out.println(i + " * " + j + " : " + (i*j));
				}
				
			}else if(nu == 2) { //Ȧ���ܸ� ���
				for(int i=1; i<=19; i++) {
					for(int j=1; j<=19; j++)
						if(i%2==1){
						System.out.println(i + " * " + j + " : " + (i*j));
						}
				}				
			}else if(nu == 3) { //3�� ����ܸ� ���
				for(int i=1; i<=19; i++) {
					for(int j=1; j<=19; j++)
						if(i%3==0) {
							System.out.println(i + " * " + j + " : " + (i*j));
						}
				}				
			}else if(nu == 4) { //���α׷� ����
				break;				
			}			
			
		}while(run);
		
		//��ĳ�ʸ� �޸𸮿��� ������ ���α׷� ����
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}

}
