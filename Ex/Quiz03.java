package Ex;

class Student {
				//�ڹٴ� ���� ����� �Ұ�, �ڹ��� ��� Ŭ������ Object Ŭ������ �ڽ� Ŭ�����̴�.
						//Object Ŭ�������� ������ �ʵ峪 �޼ҵ带 ������ �� �ִ�.
	String name;	//�л��̸�
	int studentID;	//�й�
	int kor;		//��������
	int eng;		//��������
	int math;		//��������
	
	int sum;		//���� �հ�
	double avg; 	//���
	
	void hobby() {
		System.out.println("�� �л��� ��� �Դϴ�.");
	}

	@Override
	public String toString() {	//Object Ŭ������ �޼ҵ�, ��ü ��ü�� ����Ҷ�, [��Ű����.Ŭ������@�ؽ��ڵ�]
		return "�̸� : " + name + " , �й� : " + studentID + " , ���� : " + kor + " , ���� : " + eng + 
				" , ���� : " + math + " �հ� : " + sum + " ��� : " + avg;
	}	
	
}
class S_ö�� extends Student{
	S_ö��(){}
	
	S_ö��(String name, int studentID, int kor, int eng, int math){
		//������ : 1.Ŭ������� ����, 2.����Ÿ���� ������Ѵ�.		
		super.name = name;  //super �θ� Ŭ����, this : �ڽ��� ��ü
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;
	}
	
	@Override
	void hobby() {
		System.out.println("ö���� ��̴� ���� �Դϴ�. ");
	}
	
}
class S_���� extends Student{
	S_����(){}
	
	S_����(String name, int studentID, int kor, int eng, int math){
		super.name = name;
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;

		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;	//��� ����Ҷ� (double)�� ĳ����
	}
	@Override
	void hobby() {
		System.out.println("������ ��̴� �뷡��� �Դϴ�. ");
	}
	
}
class S_���� extends Student{
	S_����(){}
	
	S_����(String name, int studentID, int kor, int eng, int math){
		super.name = name;
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;

		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;
		
		
}		
		
	@Override
	void hobby() {
		System.out.println("������ ��̴� �౸ �Դϴ�.");
	}
	
}

public class Quiz03 {

	public static void main(String[] args) {
		
		Student cs = new S_ö��("ö��", 1111, 100, 90, 80);
		Student yh = new S_����("����", 2222, 70, 60, 50);
		Student ys = new S_����("����", 3333, 40, 30, 20);
		
		Student[] arr = {cs, yh, ys};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		System.out.println("=========================");
		for(Student k : arr) {
			System.out.println(k);
			k.hobby();
		}
	}

}
