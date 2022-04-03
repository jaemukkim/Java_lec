package Chap17.Ex05;

import java.util.ArrayList;

class Member {			//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;
	private String memberName;
	
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

class MemberArrayList {		//MemberArrayList�� ��üȭ �ϸ� ArrayList ��ü�� �����ȴ�.
	private ArrayList<Member> arrayList;
	
		//List<Member> aList = new ArrayList<Member>();		���ʸ� Ÿ��Ŭ���� ��ü ����.
		//ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberArrayList() {	//�⺻������
		arrayList = new ArrayList<Member>();
	}
	public void addMember(Member member) { //Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼ҵ�		
		//�ڵ� ���
		arrayList.add(member);
	}
	public void addMember2(int a,Member member) {	//�Ű����� 2���� �޾Ƽ� //Ư�� index ���ȣ�� ���� �߰�.
		
		try {
			arrayList.add(a, member);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�. ���ȣ�� ��Ȯ�ϰ� �Է��ϼ���.");
		}
		
	}
	public boolean removeMember(int memberid) {
		// ArrayList�� ����� memberid�� �˻��ؼ� �ش� ��ü�� �����ϴ� �޼ҵ�		
		
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);	//�� �濡 ����� Member ��ü�� member ���������� �Ҵ�.
			int temid = member.getMemberid(); 	//��ü�� getMemberid(), ��ü ������ memberid
			
			if(temid == memberid) {
				arrayList.remove(i);	//arrayList ���� ����� ��ü�� ����
				System.out.println("ȸ������ " + memberid + " ���̵�� �����Ǿ����ϴ�.");
				return true;
			}
		}		
		System.out.println(memberid + " �� �������� �ʽ��ϴ�. ");
		return false;
	}
	public void showAllMember() {
			//ArrayList�� ����� ��� ����� ������ ����ϴ� �޼ҵ�		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));  //������ Member ��ü�� 
		}		
	}
	public void showSize() {
		System.out.println(arrayList.size());
		
	}
	
}

public class Ex_MemberArrayList {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList(); //��ü�� �����ϴ� ���� arrayList �ʵ尡 Ȱ��ȭ
			//�޼ҵ� ȣ���ϱ� ���ؼ� ��ü ����.
			//addMember(), addMember2(), removeMember(), showAllMember();
		
		
		
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");
		Member memberHong = new Member(1004,"ȫ�浿");
		
		memberArrayList.addMember(memberLee);		//�� ��ü�� �����ؼ� ArrayList�� ����
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showSize();
		
		
		//Ư�� index�濡 �߰��� ����� ����� �߰�
		memberArrayList.addMember2(5, memberHong);	//����ó��
		
		memberArrayList.showSize();
		
		//��� ����� ���� ���
		memberArrayList.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberArrayList.removeMember(1004);
		
	}

}
