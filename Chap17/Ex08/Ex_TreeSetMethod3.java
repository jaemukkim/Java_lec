package Chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

//�̸��� ���̸� �Է½� �̸��� ������������ ����ϵ��� ���� . TreeSet�� name �÷���
// 1. Comparealbe<E>�� CompareTo() �޼ҵ� ������
		//������ ��ü ������ �ʿ�
// 2. Comparator<E> �� compare() ���� 
		//������ ��ü�� �������� ����

class Abc {
	String name;	// <== �÷��� ���� �÷�.  �������� ���� : �����ٶ�...��
				// ȫ�浿, �̼���, ������ ==> ������, �̼���, ȫ�浿
	int age;	//����
	
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
		//1.Comparealbe<E>�� CompareTo() �޼ҵ� ������
		TreeSet<Abc_T> abc_T2 = new TreeSet();
		
		Abc_T ab1 = new Abc_T("ȫ�浿", 24);
		Abc_T ab2 = new Abc_T("�̼���", 27);
		Abc_T ab3 = new Abc_T("������", 29);
		
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
		Abc_T abc = new Abc_T("ȫ�浿", 23);
		Abc_T abc2 = new Abc_T("�̼���", 25);
		Abc_T abc3 = new Abc_T("������", 27);
		
		abc_T.add(abc);
		abc_T.add(abc2);
		abc_T.add(abc3);
		
		System.out.println(abc_T);
		

	}

}
