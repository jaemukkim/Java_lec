package Ex;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		/*����12. ��ǻ�Ϳ� ���������� / "�׸�" �Է��ϸ� ������ ������.	
		
		System.out.println("���� ���� ��!");
		Scanner scan= new Scanner(System.in);
		String me = scan.next();
		int n = (int)(Math.random()*3);
		String str[] = {"����", "����", "��"};
		//if(str[n].equals("����"));
		
		if(me.equals("����") || str[n].equals("����")) {
			System.out.println("����� ���� = "+"��ǻ�� = ���� "+"  ����ڰ� �̰���ϴ�.");
			return;
		}else if(me.equals("����") || str[n].equals("����") ) {
			System.out.println("����� = ���� "+"��ǻ�� = ���� "+"  �����ϴ�.");
			return;
		}else {
			System.out.println(" ������ �����մϴ�.");
		}
		scan.close();
		*/
		/*		
		int n =(int)(Math.random()*3);	//0,1,2 : n�� ��
			//Math.random() : 0.000000xxx ~ 0.999999xx
		System.out.println(n);
		*/
		
		Scanner sc = new Scanner(System.in);
		String[] str = {"����", "����", "��"};
		String user, com; // user : ����� ����(��ĳ�ʷ� ��ǲ)
						  // com  :	��ǻ�Ͱ� �� �� (���� �߻���(Math.random()���� ��ǲ
		int n ; //��ǻ�Ͱ� �� ��(0, 1, 2), 0 : ����, 1 : ����, 2 : ��
		
		System.out.println("��ǻ�Ϳ� \'���� ���� ��\' ������ �մϴ�. ");
		
		do {
			System.out.println("���� ���� �� ! >>> ");
			user = sc.next();				//����� ���� �� : ��ǲ
			if(user.equals("�׸�")) break; // {break;}
			
			n = (int)(Math.random()*3);		//��ǻ�Ͱ� ���� �� : 0, 1, 2
			com = str[n];				//��ǻ�Ͱ� ���� ��: 0:����, 1:����, 2:��
			
			if(user.equals("����")) {				// ����ڰ� �����϶� ?
				if(com.equals("����")) {
					System.out.println("����� = "+ user + " , ��ǻ�� = "+ com + " �����ϴ�.");
				}else if(com.equals("����")) {
					System.out.println("����� = "+ user + " , ��ǻ�� = "+ com + " ��ǻ�Ͱ� �̰���ϴ�.");
				}else if(com.equals("��")) {
					System.out.println("����� = "+ user + " , ��ǻ�� = "+ com + " ����� �̰���ϴ�.");
				}
				
				
			}else if(user.equals("����")){		//����ڰ� ���� �϶� ?
				if(com.equals("����")) {
					System.out.println("����� = "+ user + " , ��ǻ�� = "+ com + " ����� �̰���ϴ�.");
				}else if(com.equals("����")) {
					System.out.println("����� = "+ user + " , ��ǻ�� = "+ com + " �����ϴ�.");
				}else if(com.equals("��")) {
					System.out.println("����� = "+ user + " , ��ǻ�� = "+ com + " ��ǻ�Ͱ� �̰���ϴ�.");
				}
				
			}else if(user.equals("��")) {		//����ڰ� �� �϶� ?
				if(com.equals("����")) {
					System.out.println("����� = "+ user + " , ��ǻ�� = "+ com + " ��ǻ�Ͱ� �̰���ϴ�.");
				}else if(com.equals("����")) {
					System.out.println("����� = "+ user + " , ��ǻ�� = "+ com + " ����� �̰���ϴ�.");
				}else if(com.equals("��")) {
					System.out.println("����� = "+ user + " , ��ǻ�� = "+ com + " �����ϴ�.");
				}
			}
			
					
			
		}while(true);
		
		sc.close();
		System.out.println("���α׷��� ���� �մϴ�. ");
		
		
		
	}

}
