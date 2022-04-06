package Chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//java.lang�� ��Ű���� Ŭ�������� import�� �ʿ����� �ʴ�.
/*
 	�÷��� : ������ �ڷ����� ����. ���� ũ�Ⱑ �������� ��ȭ.  
 	�迭[] : ������ �ڷ����� ����. ���� ũ�Ⱑ �����Ǿ� �ִ�. �迭 ������ ���� ũ�⸦ ����
 			���� ũ��� ���� �Ұ�.
 
	List<E> : �������̽�, ���ʸ� �������̽� : �پ��� ������ Ÿ���� ��� ����
			: �ε���(index / ���ȣ)�� ������ �ִ�.(�˻��� ������) ���� ũ��� �������� ��ȭ�Ѵ�.
			 
		- ArrayList<E> : �̱� ������ ȯ�濡�� ���.	 �˻��� ������ ���� �߰��ϰų� ������ ������. ����ȭX
		- Vector<E>    : ��Ƽ ������ ȯ�濡�� ���.	 ��� �޼ҵ尡 ����ȭ �Ǿ��ִ�.
		- LinkedList<E>: �˻��� ������ ���� �߰��� ������ ������.

*/
public class ArrayList_1 {

	public static void main(String[] args) {
		//[1]. �迭 
		String[] array = new String[] {"��","��","��","��","��","��","��"};
		System.out.println(array.length); //7
		array[2] = null;
		array[5] = null;
		System.out.println(array.length); //7
		
		//1. Array.toString(�迭����)
		System.out.println(Arrays.toString(array));	//Arrays.toString(�迭����)
		//2. for���� ����ؼ� ���
		for(int i=0; i<array.length; i++) {			
			if(i==array.length -1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]+" , ");
			}
		}
		System.out.println();
		System.out.println(" ===========================");
		
		//3. Enhanced for��
		for(String k : array) {
			System.out.print(k + " , ");
		}
		System.out.println();System.out.println();
		
		//[2]. List : �������̽�, ��ü ������ �� �� ����, Ÿ���� ���� ����
		
		List<String> aList = new ArrayList<String>();	
		List<String> aList2 = new ArrayList<>();	//			
		List<String> aList3 = new ArrayList();		//<String> ��������
		
		//List ���� ���� ���� ��� : aList.size(); <<== List    ,  �迭������ ==> .length()
		System.out.println(aList.size());	//���� ũ�� : 0
		
		//List�� �� �Ҵ� �ϱ�(���� ��) : aList.add("���Ҵ�"); ���� �������� ���� �߰���.
		aList.add("��"); aList.add("��"); aList.add("��"); aList.add("��"); aList.add("��");
		aList.add("��");aList.add("��");  
		
		//List�� ����� �������� ���� ���ϱ� : aList.size();
		System.out.println(aList.size());
		
		//List�� ����� ���� ���� : aList.remove("������ ����")
		aList.remove("��");
		aList.remove("��");
		System.out.println(aList.size());	//5
		
		//List�� index�� ������ �ִ�.
		for(int i=0; i<aList.size(); i++) {	//List������ aList.size(); : ���� ���� ���
			System.out.print(aList.get(i)+ " , ");
		}
		System.out.println();
		System.out.println("===================");
		//2.Enhanced For ���� ����ؼ� ���
		for(String k : aList) {
			System.out.print(k + " ");
		}System.out.println();
		
		//3. ��ü�� toString()�� ȣ���ؼ� ���
		System.out.println(aList);	// List�� toString �޼ҵ尡 ������ �Ǿ��ִ�.
		System.out.println(aList.toString());
		
		
		
		
		
		
		
	}

}
