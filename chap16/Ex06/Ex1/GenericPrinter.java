package chap16.Ex06.Ex1;

//���ʸ� Ŭ���� : �پ��� Ÿ���� ����� �� �ִ� Ŭ����

public class GenericPrinter <T extends Material>{	
				// T : Ÿ������, Material ����Ŭ������ T Ÿ�Կ� ���� �� �ִ�. 

	private T material;		//meterial : �������� , ��ü, �ν��Ͻ�, 
	
	public T getMaterial() {	//��ü�� ����
		return material;
	}

	public void setMaterial(T material) {	//��ü�� Ȱ��ȭ
		this.material = material;
	}
	
	public String toString() {
		return material.toString();	 //�ش� ��ü�� toString() �޼ҵ� ȣ��
	}
	public void printing() {	//�޼ҵ常 ����
		material.doPrinting();
	}
	


}
