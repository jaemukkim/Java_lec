package chap10.Ex04;

//�޼ҵ� �������̵��� ���� �����ڿ��� ����
	//�ڽ��� Ŭ�������� �θ��� �޼ҵ带 ������ �� ��� ���� �����ڴ� �θ�� ���ų� �о�� �ȴ�.

	//����������   public > protected > default > private

class Aaa {
	protected void abc() {}		//protected ���� �о���Ѵ�.
}
class B1 extends Aaa {
	@Override
	public void abc() {}		
}
class B2 extends Aaa {
	@Override
	protected void abc() {}
}
class B3 extends Aaa {
//	@Override
//	void abc() {}	//���� �߻� : �������̵� �� �޼ҵ��� ���� ������ ���� (protected ���� �۴�)
}
class B4 extends Aaa {
//	@Override
//	private void abc() {}  //���� �߻� : ���������ڰ� (protected ���� �۴�)
}

public class MethodOverriding_3 {

	public static void main(String[] args) {
		
		
	}

}
