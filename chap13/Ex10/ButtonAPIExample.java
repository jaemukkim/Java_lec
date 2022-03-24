package chap13.Ex10;

class Button {
	// OnClickListener : ��ü Ÿ��,  ocl : ���� ����
	OnClickListener ocl;	//ocl �⺻ ������  null
	
	
	//setter�� ���ؼ� OnClickListener�� ���� ���� ocl�� ��ü �ּҸ� ��´�.
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	//�������̽��� �����ϰ� ������ �ڽ� Ŭ������ �������� �ʴ´�.
	//ȣ���ϴ� ������ OnClick() �޼ҵ带 �������ؼ� ȣ��
	interface OnClickListener {	//InnerInterface, static(������), Button.OnClickListener : 
		void OnClick();		//�޼ҵ� ���𸸵�. �������� �������̵� �ؼ� ������
	}
	void click() {		//���������� ocl.OnClick()�� ȣ��
		ocl.OnClick();	//ocl : �������� : null ===> setOnClickListener (OnClickListener ocl)
		System.out.println(ocl);
	}
}

public class ButtonAPIExample {

	public static void main(String[] args) {
		//������ 1 : Ŭ���� ���� ���
		Button button1 = new Button();	// button1 ��ü ����
		
		//A.B = new A.B(){�̳��������̽�B�� �޼ҵ带 ������ �ڵ�};
		
		//OnClickListener ��üŸ������ ��ü ���� �Ű������� ����
		
		button1.setOnClickListener(new Button.OnClickListener() {			
			@Override
			public void OnClick() {
				System.out.println("������ 1. ���� ���");
			}});					
		button1.click();
		
		System.out.println("========================");
		
		//������ 2 : Ŭ���� ���̹� ����
		Button button2 = new Button();
		//setOnClickListener �޼ҵ忡 �Ű������� OnClickListener�� ���� �͸�ü�� ������ OnClickListener
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("������ 2. ���̹� ����");
			}
		});
		button2.click();
		
	}

}
