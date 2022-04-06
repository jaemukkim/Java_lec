package Chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

//이름과 나이를 입력시 이름을 오름차순으로 출력하도록 구현 . TreeSet에 name 컬럼을
// 1. Comparealbe<E>의 CompareTo() 메소드 재정의
		//기존의 객체 수정이 필요
// 2. Comparator<E> 의 compare() 구현 
		//기존의 객체를 수정없이 구현

class Abc {
	String name;	// <== 컬럼이 정렬 컬럼.  오름차순 정렬 : 가나다라...하
				// 홍길동, 이순신, 강감찬 ==> 강감찬, 이순신, 홍길동
	int age;	//나이
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " " + age;
	}
}

class Abc_T implements Comparable<Abc_T> {
	String name;
	int age;
	protected int charAt;	


	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Abc_T o) {
		return this.name.charAt(age);
	}

	@Override
	public String toString() {
		return name + " " + age;
	}
}

public class Ex_TreeSetMethod3 {

	public static void main(String[] args) {
		//1.Comparealbe<E>의 CompareTo() 메소드 재정의
		TreeSet<Abc_T> abc_T2 = new TreeSet();
		
		Abc_T ab1 = new Abc_T("홍길동", 24);
		Abc_T ab2 = new Abc_T("이순신", 27);
		Abc_T ab3 = new Abc_T("강감찬", 29);
		
		abc_T2.add(ab1);
		abc_T2.add(ab2);
		abc_T2.add(ab3);
		
		System.out.println(abc_T2);
		System.out.println("====================");
		
		
		
		//2. Comparator
		TreeSet<Abc_T> abc_T = new TreeSet(new Comparator<Abc_T>() {

			@Override
			public int compare(Abc_T o1, Abc_T o2) {
				if(o1.name.charAt(0) < o2.name.charAt(0)) {
					return -1;
				}if(o1.name.charAt(0) == o2.name.charAt(0)) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		Abc_T abc = new Abc_T("홍길동", 23);
		Abc_T abc2 = new Abc_T("이순신", 25);
		Abc_T abc3 = new Abc_T("강감찬", 27);
		
		abc_T.add(abc);
		abc_T.add(abc2);
		abc_T.add(abc3);
		
		System.out.println(abc_T);
		

	}

}
