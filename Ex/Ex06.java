package Ex;
public class Ex06 {
	public static void main(String[] args) {
		//����6. �־��� �迭�� �׸񿡼� �ִ밪�� ���غ�����(for�� �̿�)
		
		int max = 0;
		int[] array = {4,5,1,2,3};
		for(int i=0; i<array.length; i++) {		//������ ���� ��ȯ �ϸ鼭 ������ �´�.
			if(max<array[i]) {		//���� ���� max ������ ������ Ŭ��
				max = array[i];		//max ������ ū���� ����
			}
		}		
		
		System.out.println("max: "+max);
	}

}
