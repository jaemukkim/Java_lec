package chap14.Ex05;
//���� ������ ��ü���� AutoCloseable �� ����� ����,
	//try (��ü ��������) {} catch {} : �ڵ����� close() ��. //try (with Resource)
	//1. AutoCloseable �������̽��� close() �޼ҵ带 �������̵� �ؾ��Ѵ�.

	//java.lang.Autocloseable  :  java.lang  <=== import ���� ������� �ʾƵ� ��.
	//java.lang.Object		   :

	//���ܸ� ó���ϴ� ���
		//1. try catch �� ����ؼ� ���� ó�� : �ڽ��� ���� ���ܸ� ó���ϰڴ�.
		//2. throws�� ���ؼ� ���ܸ� ó���ϴ� ��� : ���ܸ� ���� ó������ �ʰ� ȣ���ϴ� ������ ���ܸ� ó���ϵ��� �̷��.
										// ���� ����. �޼ҵ� ���� ����
				//throw  :  ���ܸ� ������ �߻���Ű��.
		


class A implements AutoCloseable{
	String resource;		//resource = null
	
	A (String resource){	//�������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε�
		this.resource = resource;
	}
	public A(String string, int i, int j, int k, int l) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void close() throws Exception {	//close() �޼ҵ尡 �ڵ����� ȣ��ȴ�.
		System.out.println(resource);
		
		if(resource != null) {
			resource = null;
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
			System.out.println(resource);
		}
	}
}




public class TryWithResource_2 {

	public static void main(String[] args) {
		//1. �ڵ� ���ҽ� ���� ���
		try (A a1 = new A("Ư�� ����");){
			
		}catch(Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}	//finally ����� a1.close() �޼ҵ带 �ڵ����� ȣ���.
		
		System.out.println("================================");
		
		//2. �������� ���ҽ� ����
		
		A a2 = null; 
		try {
			a2 = new A("������ �ʱⰪ �Ҵ�");
		}catch(Exception e) {
			
		}finally {
			if(a2.resource != null) {
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}			
		}		
	}

}
