package Chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		
		//1. List 구현 클래스의 생성자를 사용하여 객체 생성
		// List는 인터페이스이므로 new 키 뒤에 올 수 없다. ArrayList, Vector, LinkedList
		// capacity : 메모리의 방의 크기를 할당, 기본값은 10
		// size()  : 방의 저장된 값의 개수  <<===========
		
		
		List<Integer> aList1 = new ArrayList<>();	//capacity = 0
		List<Integer> aList2 = new ArrayList<>(30);	//capacity = 30, 메모리 공간 확보.
		
		List<Integer> aList3 = new Vector();
		List<Integer> aList4 = new Vector(30);
		
		List<Integer> aList5 = new LinkedList();
//		List<Integer> aList6 = new LinkedList(30);  //LinkedList는 저장공간 할당 불가.
		
		//2. Arrays 클래스의 정적 메소드를 이용하는 방법 : 데이터 크기를 바꿀 수 없다.
			//요일, 계절, 하루24시간.  <== 고정된 값을 저장할 때 사용.
		
		List<Integer> aList7 = Arrays.asList(1,2,3,4);	//고정된 값을 저장
		List<String> aList8 = Arrays.asList("월", "화", "수", "목", "금", "토", "일");
		
		aList7.set(1, 7);	// set() : 기존의 값을 수정, index 1에 7을 할당 하겠다.
		System.out.println(aList7);
//		aList7.add(5);	//오류 발생. add() ==> 마지막에서 값을 더 추가할 때 사용. (고정되어있음) 추가 불가
		
		aList8.set(0, "일");
//		aList8.add("일");  //오류, 추가 불가능
		System.out.println(aList8);
		
		
	}

}
