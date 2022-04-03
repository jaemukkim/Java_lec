package Chap17.Ex06;

//HashSet으로 변환
//Member 클래스의 memberid 컬럼을 equals(), HashCode() 오버라이딩

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;



class Member {			//DTO, VO : 각 계층간의 데이터를 받아서 전달해주는 클래스
	private int memberid;
	private String memberName;
	private Object hashSet;
	
	public Member(int memberid, String memberName) { //생성자를 통해서 필드의 값 할당
		this.memberid = memberid;
		this.memberName = memberName;				
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
		public String toString() {
		return memberName + " 회원님의 아이디는 " + memberid + " 입니다. ";
		}
}
	


class MemberHashSet {		//MemberArrayList를 객체화 하면 ArrayList 객체가 생성된다.
	private Set<Member> hashSet;	
	
	public MemberHashSet() {	//기본생성자
		hashSet = new HashSet<Member>();
	}
	public void addMember(Member member) { //Member 객체를 받아서 맨마지막 방에 값을 추가하는 메소드		
		//코드 블락
		hashSet.add(member);
	}

	public boolean removeMember(int memberid) {
		
		//iterator 사용해서 remove
		Set<Integer> hashSet = new HashSet();
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
		}
		return true;
		
	}
			
	public void showAllMember() {
		//iterator
		Iterator<Member> iterator2 = hashSet.iterator();
		while(hashSet.size())
		
	}
	public void showSize() {
		System.out.println(hashSet.size());
		
	}
	public boolean equals(Object obj) {
		if(obj instanceof MemberHashSet) {
			if(this.hashSet == ((MemberHashSet)obj).hashSet);
			return true;
		}
		return false;
	}
		@Override
	public int hashCode() {			
			return Objects.hash(hashSet);
		}
	}

	


public class Ex_MemberHashSet {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
			//메소드 호출하기 위해서 객체 생성.
			//addMember(), addMember2(), removeMember(), showAllMember();
				
		
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서원");
		Member memberHong = new Member(1004,"홍길동");
		Member memberLee2 = new Member(1001,"이지원");
		
		memberHashSet.addMember(memberLee);		//각 객체를 생성해서 ArrayList에 저장
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);
		
		
		
		memberHashSet.showSize();	//4개 출력
		
		//모든 사용자 정보 출력
//		memberHashSet.showAllMember();
		
		//특정 id를 가진 사용자 제거
		memberHashSet.removeMember(1004);
		
	}

}
