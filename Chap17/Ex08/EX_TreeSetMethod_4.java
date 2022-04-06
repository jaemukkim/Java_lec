package Chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

// �̸��� ���̸� �Է½� ������������ ����ϵ��� ������ ��. treeSet�� name �÷��� �̿��ؼ�

//1. Comparable<E>�� compareTo() �޼��� ������
		//���� ��ü ���� �ʿ�

//2. Comparable<E> ����
		// ���� ��ü ���� ���ʿ�

class Abc1{
	String name; // << a�� ���� �÷� // ��~ �ϱ��� �������� ������ ��. ȫ�浿 �̼���, ������ ������ �־ �������� ���� �������� ����
	int age;
	
	public Abc1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		
		return "����: " + name + " ����: " + age;
	}
}
class Abc1_T implements Comparable<Abc1_T>{
	String name; 
	int age;
	
	public Abc1_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Abc1_T o) { // ��ü�� ũ�� �� ������ �����ϴ� �޼���. <TreeSet���� ����>> (����, ���, 0 �� �ϳ��� ������.) �� �κ��� �����ǽ������� ������ ������ ��.  
		int att = this.name.compareToIgnoreCase(o.name) ; // IgnoreCase �߰�, ��ҹ��� ����, �빮�� �ҹ��ڿ� ��� ���� �� ��
		
		// �Ʒ� �ּ�ó�� 3���� Ȱ��ȭ ��Ű�� �������� �ƽ�Ű�ڵ� ���� �� ��µ�.
		//System.out.println(this.name);
		//System.out.println(o.name);
		//System.out.println(att);
		  
		return att;
	}
	@Override
	public String toString() {
		return "����: " + name + " ����: " + age;
	}
}

public class EX_TreeSetMethod_4 {
	public static void main(String[] args) {
		
		//1. ���� ��ü�� �����ؼ� TreeSet�� �����ϴ� ���
		TreeSet<Abc1_T> treeSet1 = new TreeSet();
		
		Abc1_T Abc11 = new Abc1_T("���ƹ������̺�", 13); 
		Abc1_T Abc12 = new Abc1_T("���ε帮�Խ��˷��ѵ��", 14);
		Abc1_T Abc13 = new Abc1_T("������", 15);
		
		treeSet1.add(Abc11);
		treeSet1.add(Abc12);
		treeSet1.add(Abc13);
		
		System.out.println(treeSet1);
		
		//2. ��ü�� �������� �ʰ� TreeSet�� �����ϴ� ���
		TreeSet<Abc1> treeSet2 = new TreeSet<Abc1>(new Comparator<Abc1>() { //for �� ������ �𰡴�
			public int compare(Abc1 o1, Abc1 o2) {
				int run = 0;
				int i =0;
				try {
					while(i < (o1.name.length())*(o2.name.length())) { // �̸��� �� ���������� �𸣴� �ƿ� �̸� ���̵� ��ŭ �˳��ϰ�
						if(o1.name.charAt(i) < o2.name.charAt(i)) {
							run = -1;
							break; //while�� Ż�� ���� // �� ���� ���� ���̸� ã������ �̹� ���� �񱳴� ���� �׸���
						}else if(o1.name.charAt(i) > o2.name.charAt(i)) {
							run = 1;
							break; //while�� Ż�� ���� // �� ���� ���� ���̸� ã������ �̹� ���� �񱳴� ���� �׸���
						}else {
							i = i+1; // ���� ��
						}
					}
				}catch(Exception e){} // outIndex �ӽñ� ����ó���ؼ� �����Ŵ
				return run;
				}
			});
		
		Abc1 Abc14 = new Abc1("���ε帮�Խ��˷��ѵ��", 15); 
		Abc1 Abc15 = new Abc1("������", 14);
		Abc1 Abc16 = new Abc1("���ƹ������̺�", 13);
		
		treeSet2.add(Abc14);
		treeSet2.add(Abc15);
		treeSet2.add(Abc16);
		
		System.out.println(treeSet2);
		
	//�����ǳ�
	}
}
