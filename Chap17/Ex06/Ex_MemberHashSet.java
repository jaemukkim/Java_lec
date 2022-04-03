package Chap17.Ex06;

//HashSet���� ��ȯ
//Member Ŭ������ memberid �÷��� equals(), HashCode() �������̵�

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;



class Member {			//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;
	private String memberName;
	private Object hashSet;
	
	public Member(int memberid, String memberName) { //�����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
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
		return memberName + " ȸ������ ���̵�� " + memberid + " �Դϴ�. ";
		}
}
	


class MemberHashSet {		//MemberArrayList�� ��üȭ �ϸ� ArrayList ��ü�� �����ȴ�.
	private Set<Member> hashSet;	
	
	public MemberHashSet() {	//�⺻������
		hashSet = new HashSet<Member>();
	}
	public void addMember(Member member) { //Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼ҵ�		
		//�ڵ� ���
		hashSet.add(member);
	}

	public boolean removeMember(int memberid) {
		
		//iterator ����ؼ� remove
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
			//�޼ҵ� ȣ���ϱ� ���ؼ� ��ü ����.
			//addMember(), addMember2(), removeMember(), showAllMember();
				
		
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");
		Member memberHong = new Member(1004,"ȫ�浿");
		Member memberLee2 = new Member(1001,"������");
		
		memberHashSet.addMember(memberLee);		//�� ��ü�� �����ؼ� ArrayList�� ����
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);
		
		
		
		memberHashSet.showSize();	//4�� ���
		
		//��� ����� ���� ���
//		memberHashSet.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberHashSet.removeMember(1004);
		
	}

}
