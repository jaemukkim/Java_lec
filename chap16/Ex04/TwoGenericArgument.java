package chap16.Ex04;

//���ʸ� Ŭ���� : �Ű����� (Argument : 2��) 

class KeyValue<K,V> {
	private K key;
	private V value;
	
	// getter , setter
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}

public class TwoGenericArgument {

	public static void main(String[] args) {
		
		KeyValue<String, Integer> kv1 = new KeyValue<String, Integer>();
		//KeyValue<String, Integer> kv1 = new KeyValue();  / �����ڿ����� ��������
		kv1.setKey("���");
		kv1.setValue(1000);		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		System.out.println("=========================");
		
		KeyValue<Integer, String > kv2 = new KeyValue();
		kv2.setKey(404);
		kv2.setValue("Not Found (��û�� �������� ã�� �� �����ϴ�.)");		
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		System.out.println("========================");
		
		KeyValue<String, Double > kv3 = new KeyValue(); //Double�� �빮�ڷ�
		kv3.setKey("��հ�");
		kv3.setValue(55.555);
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		System.out.println("==========================");
		
		// Ư�� Ÿ���� ������� ���� ��� Void Ű�� ����մϴ�. / ���� Void : �޼ҵ忡�� ������ ������ ���.
		KeyValue <String, Void> kv4 = new KeyValue();  // Ÿ���� ����������
		kv4.setKey("Ű���� ���");
//		kv4.setValue(1111);  //���Ұ�
		
		System.out.println(kv4.getKey());
		
		

	}

}
