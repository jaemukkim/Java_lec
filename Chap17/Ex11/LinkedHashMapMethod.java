package Chap17.Ex11;

//Map<K,V> : Key는 중복되지 않는다. <== Set으로 관리된다.
//HashMap vs LinkedHashMap
	//HashMap<K,V>  :  입력과 출력이 다를 수 있다. 출력이 랜덤하게 출력
	//LinkedHashMap<K,V>  :  key는 링크되어 있다. 앞의 값과 뒤의 값의 정보를 가진다.
							//입력 순서대로 출력이 된다.

import java.util.Hashtable;
import java.util.LinkedHashMap;

/*	Map<K,V> : K : Key , V : Value 형식으로 데이터를 저장.
 		Key는 중복될 수 없다. ==>  Set으로 관리.  	index가 아니다. index는 0부터 할당, JVM이 할당.
 		Value는 중복된 값 가능.
 
 		//HashMap : 출력이 랜덤하게 출력. 단일 쓰레드 환경에 적합. 모든 메소드가 동기화 되어있지않다.
 		//Hashtable : 모든 메소드가 동기화되어 있다. 멀티 쓰레드 환경에 적합.
 		 			  모든 메소드는 HashtMap과 동일
 
 
 */

import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> LhMap1 = new LinkedHashMap<>();
		
		//1. put(K key, V value) : 값을 넣을때.
		LhMap1.put(2, "나다라");
		LhMap1.put(1, "가나다");
		LhMap1.put(3, "다라마");
//		LhMap1.put(3, "가가가");	//키는 중복해서 저장될 수 없다. 값을 넣을 경우 기존의 값이 수정이 된다.
		System.out.println(LhMap1);
		
		//2. putAll(다른맵 객체) : 다른 맵을 복사해서 사용.
		Map<Integer, String> LhMap2 = new LinkedHashMap();
		LhMap2.putAll(LhMap1);
		System.out.println(LhMap2);
		
		//3. replace(K V) : key의 저장된 값을 value로 수정.
		LhMap2.replace(1, "가가가");
		LhMap2.replace(4, "라라라");	//key 4는 존재하지 않는다. 작동X, 예외발생도X
		System.out.println(LhMap2);
		
		//4. replace(K key, V oldValue, V newValue) : oldValue를 newValue로 수정
		LhMap2.replace(1, "가가가", "나나나");
		LhMap2.replace(2, "다다다", "라라라");	//동작안됨.. 예외발생도X ===> Key와 Value가 정확히 일치해야 수정됨. 
		System.out.println(LhMap2);
		
		//5. get(Object Key) : Map의 값을 가져올때.		Key를 넣어줘야 Key에 할당된 Value를 출력.
		System.out.println(LhMap2.get(1)); 	//주의 1은 index가 아니라 1번 Key의 값.
		System.out.println(LhMap2.get(2));	//2번 key의 값
		System.out.println(LhMap2.get(3));
		
		//6. containsKey(Object key) : 맵에 해당키가 존재하는지 확인, true, false
		System.out.println(LhMap2.containsKey(1)); // 1번 key가 있느냐 / true
		System.out.println(LhMap2.containsKey(5)); // 5번 key가 있느냐 / false
		
		//7. containsValue(Object value) : 맵에 해당 값이 존재하는지 확인
		System.out.println(LhMap2.containsValue("나나나")); //true 
		System.out.println(LhMap2.containsValue("다다다"));  //false
		
		//8. Set<K> keySet() : 키만 추출
		Set<Integer> keySet = LhMap2.keySet();	//LhMap2의 저장된 keySet을 추출 / 저장된 key만 
		System.out.println(keySet);
		
		//9. Set<Map.Entry<K,V>> entrySet() : 키와 값의 셋(Set)을 추출
		Set<Map.Entry<Integer, String>> entrySet = LhMap2.entrySet();
		System.out.println(entrySet); // key와 value 모두 출력
		
		//10. size() : 총 개수
		System.out.println(LhMap2.size()); // 3
		
		//11. remove(Object Key) : 키를 넣어서 key와 value를 삭제.
		LhMap2.remove(1);	//1번 key 삭제
		LhMap2.remove(4);	//4번 없음 / 동작X
		System.out.println(LhMap2);
		
		//12. remove (Object key, Object Value) : Key와 value가 정확하게 일치할때 삭제.
		LhMap2.remove(2, "나다라");	
		LhMap2.remove(3, "다다다");  //동작X / key와 value가 정확하게 일치해야함.
		System.out.println(LhMap2);
		
		//13. clear() : 모두 삭제
		LhMap2.clear();
		System.out.println(LhMap2);
		
		
		
		
	}

}
