package Chap17.Ex07;

//LinkedHashSet : 값의 정보에 내 앞의 값의 위치 정보와 내 뒤의 값의 위치 정보를 가진다.
	//HashSet과 공통점 : 모든 메소드가 동일하다. 중복된 값을 저장하지 않는다. 방번호(index)값을 가지지 않는다.
						//기본 for문으로 출력할 수 없다. iterator 나 Enhanced for문을 사용.

	//LinkedHashSet과 다른점 : HashSet은 입력대로 출력되지 않는다. LinkedHashSet 은 입력대로 출력된다.

import java.util.Arrays;

//Set<E> : 인터페이스이며, 방번호(index)가 없다. 중복된 값을 넣을 수 없다.
	// - HashSet		: 중복된 값을 넣을 수 없다.  값을 꺼내면 순서대로 꺼내지지 않는다.
	// - LinkedHashSet  : 중복된 값을 넣을 수 없다.  출력시 순서대로 출력.
	// - TreeSet		: 저장될때 값이 정렬이 되어서 저장. ascending (오름차순 정렬) : 0 -> 9,  a -> z,  가 -> 하
										  //참고 : descending (내림차순 정렬) : 9 -> 0 , z -> a , 하 -> 가
	
//단축키 정보 : Ctrl + Shift + L
//찾기 / 바꾸기 : Ctrl + F

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;



public class LinkedHashSetMethod {

	public static void main(String[] args) {
		
		Set<String> LinkedSet1 = new LinkedHashSet();	//Set은 Interface 이므로 타입으로만 지정
		//Set의 제너릭 타입변수로 wrapper 클래스를 사용할 경우, equals(), hashCode(), toString() 가 재정의되어 있음.
		
		
		//1. add(E element) : Set에 값을 추가, 
		LinkedSet1.add("가");
		LinkedSet1.add("나");
		LinkedSet1.add("가");  //"가" 를 중복 저장 안됨.
		System.out.println(LinkedSet1);
		System.out.println(LinkedSet1.toString());	// toString 메소드가 재정의 되어있다.
		
		System.out.println("===========================");
		
		//2. addAll (다른 set 객체)	: 자신의 Set에 다른 Set에 저장된 값을 추가 : 중복된 값은 제거됨
		Set<String> LinkedSet2 = new LinkedHashSet<>();
		LinkedSet2.add("나");
		LinkedSet2.add("다");
		LinkedSet2.addAll(LinkedSet1);	
		System.out.println(LinkedSet2); //[나,다,가]	//입력과 출력이 동일하다.
		
		//3. remove (Object o) : 값으로 삭제, ( List인 경우 방번호로 삭제)
		LinkedSet2.remove("나");	//[다,가]
		System.out.println(LinkedSet2);
		
		//4. clear() : 모두삭제
		LinkedSet2.clear();
		System.out.println(LinkedSet2);
		
		//5.isEmpty() : 비어있으면 true, 비어있지않으면 false
		System.out.println(LinkedSet2.isEmpty());
		
		//6. contains(Object o) : 값이 Set에 존재하면 true, 그렇지 않으면 false
		Set<String> LinkedSet3 = new LinkedHashSet<>();
		LinkedSet3.add("가");
		LinkedSet3.add("나");
		LinkedSet3.add("다");
		System.out.println(LinkedSet3); 	// 입력과 출력이 동일하다.
		System.out.println(LinkedSet3.contains("나")); //true
		System.out.println(LinkedSet3.contains("라")); //false		
		
		//7. size() : Set에 포함된 값의 개수
		System.out.println(LinkedSet3.size());
		
		System.out.println("=========iterator()를 사용한 출력.==============");
		
		//8. iterator() : set 은 index를 가지지 않는다. for문은 방번호로 값을 출력해서,(set 은 사용불가) enhanced for문은 사용가능
						//순회자, Set의 값들을 순회하면서 출력. 
						//hasNext() : Set의 값이 존재하면 true, 존재하지 않으면 false
						//next()  : 현재 값을 출력하고 다음 값으로 이동.
		Iterator<String> iterator = LinkedSet3.iterator();
			//클래스<E> 참조객체 = Set객체.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "  ");
		}
		System.out.println();
		
		System.out.println("=============Enhaced For문 사용=============");
		
		for(String k : LinkedSet3) {
			System.out.print(k + "  ");
		}
		System.out.println();
		
		//9. toArray() : set의 값들을 배열로 보낸다. Object 타입으로 리턴, 다운캐스팅 필요.
		Object[] objArray = LinkedSet3.toArray();
		System.out.println(Arrays.toString(objArray));	//
		for(int i=0; i<objArray.length; i++) {
			System.out.print(objArray[i] + "  ");
		}
		System.out.println();
		System.out.println("=========================");
		for(Object k : objArray) {		//다운 캐스팅이 필요하다.
			System.out.print(k + "  ");
		}
		System.out.println();
		
		//10. toArray(T[] t) : 바로 다운 캐스팅을 한후 출력
		String[] strArray1 = LinkedSet3.toArray(new String[0]); // 0 : 방의 크기를 지정
														//방의 크기가 실제 값보다 작을 경우 컴파일러가 방의 크기만큼 지정
		System.out.println(Arrays.toString(strArray1));
		
		//11. 실제 Set의 값보다 방의 크기를 크게 했을 경우는 Null이 들어갈 수 있다.
		String[] strArray2 = LinkedSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		System.out.println("=============================");
		
		
		Set<Integer> intSet1 = new LinkedHashSet();
		
		intSet1.add(30); intSet1.add(50); intSet1.add(100); intSet1.add(10);
		
		//iterator 출력, Enhanced for문 출력.
		Iterator<Integer> iterator1 = intSet1.iterator();
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next() + "  ");
		}
		System.out.println();
		//Enhanced for문 출력.
		for(int k : intSet1) {
			System.out.print(k + "  ");
		}
		
	}

}
