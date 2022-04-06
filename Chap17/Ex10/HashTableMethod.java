package Chap17.Ex10;

import java.util.Hashtable;

/*	Map<K,V> : K : Key , V : Value �������� �����͸� ����.
 		Key�� �ߺ��� �� ����. ==>  Set���� ����.  	index�� �ƴϴ�. index�� 0���� �Ҵ�, JVM�� �Ҵ�.
 		Value�� �ߺ��� �� ����.
 
 		//HashMap : ����� �����ϰ� ���. ���� ������ ȯ�濡 ����. ��� �޼ҵ尡 ����ȭ �Ǿ������ʴ�.
 		//Hashtable : ��� �޼ҵ尡 ����ȭ�Ǿ� �ִ�. ��Ƽ ������ ȯ�濡 ����.
 		 			  ��� �޼ҵ�� HashtMap�� ����
 
 
 */

import java.util.Map;
import java.util.Set;

public class HashTableMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> hTable1 = new Hashtable<>();
		
		//1. put(K key, V value) : ���� ������.
		hTable1.put(2, "���ٶ�");
		hTable1.put(1, "������");
		hTable1.put(3, "�ٶ�");
//		hTable1.put(3, "������");	//Ű�� �ߺ��ؼ� ����� �� ����. ���� ���� ��� ������ ���� ������ �ȴ�.
		System.out.println(hTable1);
		
		//2. putAll(�ٸ��� ��ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> hTable2 = new Hashtable();
		hTable2.putAll(hTable1);
		System.out.println(hTable2);
		
		//3. replace(K V) : key�� ����� ���� value�� ����.
		hTable2.replace(1, "������");
		hTable2.replace(4, "����");	//key 4�� �������� �ʴ´�. �۵�X, ���ܹ߻���X
		System.out.println(hTable2);
		
		//4. replace(K key, V oldValue, V newValue) : oldValue�� newValue�� ����
		hTable2.replace(1, "������", "������");
		hTable2.replace(2, "�ٴٴ�", "����");	//���۾ȵ�.. ���ܹ߻���X ===> Key�� Value�� ��Ȯ�� ��ġ�ؾ� ������. 
		System.out.println(hTable2);
		
		//5. get(Object Key) : Map�� ���� �����ö�.		Key�� �־���� Key�� �Ҵ�� Value�� ���.
		System.out.println(hTable2.get(1)); 	//���� 1�� index�� �ƴ϶� 1�� Key�� ��.
		System.out.println(hTable2.get(2));	//2�� key�� ��
		System.out.println(hTable2.get(3));
		
		//6. containsKey(Object key) : �ʿ� �ش�Ű�� �����ϴ��� Ȯ��, true, false
		System.out.println(hTable2.containsKey(1)); // 1�� key�� �ִ��� / true
		System.out.println(hTable2.containsKey(5)); // 5�� key�� �ִ��� / false
		
		//7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ��
		System.out.println(hTable2.containsValue("������")); //true 
		System.out.println(hTable2.containsValue("�ٴٴ�"));  //false
		
		//8. Set<K> keySet() : Ű�� ����
		Set<Integer> keySet = hTable2.keySet();	//hTable2�� ����� keySet�� ���� / ����� key�� 
		System.out.println(keySet);
		
		//9. Set<Map.Entry<K,V>> entrySet() : Ű�� ���� ��(Set)�� ����
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet); // key�� value ��� ���
		
		//10. size() : �� ����
		System.out.println(hTable2.size()); // 3
		
		//11. remove(Object Key) : Ű�� �־ key�� value�� ����.
		hTable2.remove(1);	//1�� key ����
		hTable2.remove(4);	//4�� ���� / ����X
		System.out.println(hTable2);
		
		//12. remove (Object key, Object Value) : Key�� value�� ��Ȯ�ϰ� ��ġ�Ҷ� ����.
		hTable2.remove(2, "���ٶ�");	
		hTable2.remove(3, "�ٴٴ�");  //����X / key�� value�� ��Ȯ�ϰ� ��ġ�ؾ���.
		System.out.println(hTable2);
		
		//13. clear() : ��� ����
		hTable2.clear();
		System.out.println(hTable2);
		
		
		
		
	}

}
