package Chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

/*
  TreeSet�� ���� : 1. �ߺ� ������� �ʴ´�.(Set)
				 2. �������� ���ĵǾ� �Է�.
				 3. ���ĵǾ� ��� (��������)
				 4. �˻������ ���.
				 5. Ư�������� ���� ����
				 6. asc(��������), desc(��������)

	TreeSet�� �Ϲ� ��ü�� ������ ���, Ư�� �ʵ带 ũ��� ���� �ʵ尡 �����ؾ� �Ѵ�.
	1. Comparable<E> �������̽��� compareTo() �޼ҵ� ������ : TreeSet�� �Ϲ� ��ü�� �����Ҷ� �Ϲ� ��ü�� Ư�� �ʵ带 �������ؾ� �Ѵ�.
		//������ Ŭ������ �����ؼ� ���. Comparable<E> �������̽��� ����� copareTo() �޼ҵ� ������
		//������ Ŭ������ ����
	2. Comparable<E> �������̽� compare() �޼ҵ带 ������ ��. <<�͸��� ��ü�� ���>>
		//������ ��ü�� �������� �ʰ� ����Ҷ�.
		//TreeSet<E> ��ü�� �����Ҷ� �����ڿ� Compartor<E> �������̽��� ������ �͸� ��ü�� ����.
*/

class MyClass {
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
		public String toString() {
		return data1 + " " + data2;
		}
}

//Comparable<E> �������̽��� ������ Ŭ���� ����
class MyComparableClass implements Comparable<MyComparableClass> {
	int data1;		// <<== �ʵ带 �񱳱������� ����, compareTo() ������
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public int compareTo(MyComparableClass o) { //��ü�� ũ��� ������ �����ϴ� �޼ҵ�, <TreeSet���� ���>(����, 0, ���)
		//�������� ó�� ��� asc
		
		/*
		if(this.data1 < o.data1) { 			//this.data1�� ���ذ��� ���� ��� : -1(����)
			return -1;
		}else if(this.data1 == o.data1){	//this.data1�� ���ذ��� ���� ��� : 0
			return 0;
		}else {								//this.data1�� ���ذ��� Ŭ ��� : 1(���)
			return 1;
		}	
		*/	
		
		//�������� ó�� ��� dsec		
		
		if(this.data1 < o.data1) { 			//this.data1�� ���ذ��� ���� ��� : 1(���)
		return 1;
		}else if(this.data1 == o.data1){	//this.data1�� ���ذ��� ���� ��� : 0
		return 0;
		}else {								//this.data1�� ���ذ��� Ŭ ��� : -1(����)
		return -1;
		}
	}
	
	@Override
	public String toString() {
		return data1 + " " + data2;
	}
}




public class TreeSetMethod2 {

	public static void main(String[] args) {
		// wrapper Ŭ������ comparable<E> �������̽��� compareTo() �޼ҵ带 �������ϰ� �ִ�.
			//wrapper Ŭ������ ���� TreeSet�� ������ ���ĵǾ� ����.
		
		//1. Integer wrapper Ŭ������ ũ�� ��.
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>(); //TreeSet�� Set���� �θ�X
		Integer intVaule1 = new Integer(20);	//ū ��
	//	Integer intVaule1 = 20;
		Integer intvalue2 = new Integer(10);	//���� ��
		
		treeSet1.add(intVaule1);
		treeSet1.add(intvalue2);
		
		System.out.println(treeSet1); //�������� ���ĵǾ ��µ�.
		
		//2. String wrapper Ŭ������ ũ�� ��.
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("����");		//������
		//String str1 = "����";
		String str2 = new String("�ٶ�");		//ū��
		
		treeSet2.add(str1);		//treeSet2.add()�� ����ؼ� ��ü�� ������ ��� ���� ũ�⸦ ���ϴ� �ʵ尡 ���ǵǾ� �־�� �Ѵ�.
		treeSet2.add(str2);		//Comparable<E> �������̽��� compareTo() �޼ҵ尡 �����ǵǾ�� �Ѵ�.
		
		System.out.println(treeSet2);
		
//		//3. MyClass�� TreeSet�� ������ �ɱ�?, X  /  Comparable<E> �������̽��� compareTo() �޼ҵ尡 �����ǵǾ�� TreeSet �÷��ǿ� ���� ����
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass myClass1 = new MyClass(2, 5);
//		MyClass myClass2 = new MyClass(3, 3);
//		
//		treeSet3.add(myClass1);		//TreeSet���� Comparable<E> �������̽��� compareTo() �޼ҵ带 �������� Ŭ������ ���� �� �ִ�.
//		treeSet3.add(myClass2);		//
//		
//		System.out.println(treeSet3); //����� �����߻�.
		
		//TreeSet�� �Ϲ� ��ü�� ������ ���
		//4. ���1. MyComparableClass ��ü ũ�� ��. : Comparable<E> �������̽��� compareTo() ������
				//���� ��ü�� ������ �ʿ�.	�ٽ� ������
		TreeSet<MyComparableClass> treeSet4 = new TreeSet();
		
		MyComparableClass m1 = new MyComparableClass(2, 5);	//TreeSet�� ����ɶ� Comparable<E> �������̽��� compareTo() ������
		MyComparableClass m2 = new MyComparableClass(5, 3);
		MyComparableClass m3 = new MyComparableClass(4, 3);
		
		
		treeSet4.add(m1);
		treeSet4.add(m2);
		treeSet4.add(m3);
		
		System.out.println(treeSet4);	//���ĵǾ ��µ�.
		System.out.println("===============================");
		
		//5. ���2. ������ ��ü�� �������� �ʰ� TreeSet�� ������ ���.
		//TreeSet ������ ���ο� Comparetor<E> �������̽��� compare() �������ؼ� �͸�ü�� ����.
		TreeSet<MyClass> treeSet5 = new TreeSet<MyClass>(new Comparator<MyClass>() {
			//Comparator<MyClass>�� ������ �͸� �ڽ� Ŭ���� ���
			@Override
			public int compare(MyClass o1, MyClass o2) { //�������� ���� ó�� (data1 ��������)
				if(o1.data1 < o2.data1) {
					return -1;
				}else if(o1.data1 == o2.data1) {
					return 0;
				}else {
					return 1;					
				}
			}
		});
		
		MyClass myClass1 = new MyClass(4,5);
		MyClass myClass2 = new MyClass(3,3);
		
		treeSet5.add(myClass1);
		treeSet5.add(myClass2);
		
		System.out.println(treeSet5);
	}	

}
