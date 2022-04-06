package Chap17.Ex06;

//HashSet���� ��ȯ
//Member Ŭ������ memberid �÷��� equals(), HashCode() �������̵�

//�߿� : Set�� �ߺ��� ���� ������ �� ����.
	//Wrapper Ŭ������ Integer, Long, Double, Float, Charactor, Byte, Short, Boolean
	//Wrapper Ŭ������ equals(), hashCode() �޼ҵ尡 �����ǵǾ� �ִ�.
	//Ư�� ��ü�� ������ ��  ��ü�� Set�� ������ ��� �� ��ü�� Object Ŭ������ equals(), hashCode() �޼ҵ带 ������ �ؾ���
	//��ü�� Ư�� �ʵ��� ���� ������ �ߺ��� �ĺ��ϴ� �ʵ带 ����.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;



class Member {			//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;	//Set�� ���� �ĺ���, memberid �ʵ��� ���� ������ ���� ��ü��� ����.
							//equals(), hashCode()
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
	@Override		//member1.equals(member2)
	public boolean equals(Object obj) {	//��ü�� ������ Object�� ��ĳ����
		if(obj instanceof Member) {	//�ٿ�ĳ�����Ҷ� ��Ÿ�� ������ �����Ϸ���, Object�� Member ��ü�� ���ԵǾ� ������
			Member member = (Member) obj;  //obj�� object�� ��ĳ���� �Ǿ �ٿ� ĳ����
			if(this.memberid == member.memberid){
				return true;
			}else {
				return false;
			}
		}return false;	//obj�� Member Ÿ���� �������� ������
	}

		@Override
	public int hashCode() {			//memberid �ʵ��� ���� ������ �� ������ hashCode�� ����.
			//return memberid; 			//this.memberid
			//return this.memberid;		//�ϳ��� �ʵ常�� �������� hashCode() ����.			
			return Objects.hashCode(memberid);	//�������,
				//Objects.hashCode(memberid, memberName); �������� �ʵ带 �������� hashCode�� ������ �� �ִ�.
					//memberid, memberName �ʵ��� ���� ��� ������ ��� ������ hashCode();
		}
}
	


class MemberHashSet {		//MemberArrayList�� ��üȭ �ϸ� ArrayList ��ü�� �����ȴ�.
	private Set<Member> hashSet;	//Set ���� : <Member>, �ʵ��� private(������,setter)
	
		//Set<Member> hashSet = new HashSet<Member>();
	
	public MemberHashSet() {	//�⺻������ ȣ��� Set�� �������� Ȱ��ȭ.
		hashSet = new HashSet<Member>();
	}
	public void addMember(Member member) { //Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼ҵ�		
		//�ڵ� ���
		hashSet.add(member); 	//Member ��ü�� ��ǲ�޾� hashSet�� member ��ü�� ����, �ߺ� ����Ǹ� �ȵȴ�.
								//Member ��ü�� memberid �ʵ��� ���� ������ ���, ������ ��ü��� ����
								//equals(), hashCode() �޼ҵ� ������ : memberid
	}

	public boolean removeMember(int memberid) { //memberid�� Member��ü ���� �ʵ��̹Ƿ� Set�� ����� ��ü�� �����;��Ѵ�.
		//Set�� index�� �������� �����Ƿ� �⺻ for���� ���Ұ�
		//���� for ���� ����� �� �ִ�.
		//iterator ����ؼ� remove
		Iterator<Member> iterator = hashSet.iterator();  //iterator : ��ȸ��,
		while(iterator.hasNext()) {			//hashSet() : hashSet�� ���� �����Ҷ� true, false
			Member member = iterator.next();//next() : ���� �����ְ� ���� ������ �̵�.
			int tempid = member.getMemberid();
			
			if(tempid == memberid) {
				hashSet.remove(member);
				System.out.println("ȸ������ " + memberid + "���̵�� �����Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println("���̵� �������� �ʽ��ϴ�.");
			return false;
	}
		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.hasNext());
//			System.out.println("ȸ������ " + memberid + "���̵�� �����Ǿ����ϴ�.");
//			return true;
//		}
//		System.out.println(memberid + "�� �������� �ʽ��ϴ�.");
//		return false;
//	}
		
			
	public void showAllMember() {
		//iterator
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Member member = iterator.next();	//hashSet�� ���� ������ �´�.
			System.out.println(member); //hashSet�� ��ü�� ���, toString()������ : �ʵ��� ���� ���.
		}
		
	}
	public void showSize() {
		System.out.println(hashSet.size());
		
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
		Member memberLee2 = new Member(1001,"������"); //�ߺ��� ���� ������������.
		
		memberHashSet.addMember(memberLee);		//�� ��ü�� �����ؼ� ArrayList�� ����
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);
		
		
		
		memberHashSet.showSize();	//4�� ���
		
		//��� ����� ���� ���
		memberHashSet.showAllMember();
		System.out.println("=====================");
		
		//Ư�� id�� ���� ����� ����
		memberHashSet.removeMember(1004);
		memberHashSet.showAllMember();	//3�� ���
		
	}

}
