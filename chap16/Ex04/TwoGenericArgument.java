package chap16.Ex04;

//제너릭 클래스 : 매개변수 (Argument : 2개) 

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
		//KeyValue<String, Integer> kv1 = new KeyValue();  / 생성자에서는 생략가능
		kv1.setKey("사과");
		kv1.setValue(1000);		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		System.out.println("=========================");
		
		KeyValue<Integer, String > kv2 = new KeyValue();
		kv2.setKey(404);
		kv2.setValue("Not Found (요청한 페이지를 찾을 수 없습니다.)");		
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		System.out.println("========================");
		
		KeyValue<String, Double > kv3 = new KeyValue(); //Double은 대문자로
		kv3.setKey("평균값");
		kv3.setValue(55.555);
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		System.out.println("==========================");
		
		// 특정 타입을 사용하지 않을 경우 Void 키를 사용합니다. / 주의 Void : 메소드에서 리턴이 없을때 사용.
		KeyValue <String, Void> kv4 = new KeyValue();  // 타입을 쓰지않을때
		kv4.setKey("키값만 사용");
//		kv4.setValue(1111);  //사용불가
		
		System.out.println(kv4.getKey());
		
		

	}

}
