package chap06_07.Ex02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		//�迭�� ���̰� �������� �ʰ� �������� ���
		//1. method1 ( int...values) <<== �������̸� ó���ϴ� input �Ű����� ����
		method1 ();				//�ڸ޼ҵ� �������̵��� : �޼ҵ���� ��� ����, �Ű������� Ÿ��, ������ ����
		method1 (1,2);							// �ش� �޼ҵ� ���
		method1 (1,2,3);
		method1 (1,2,3,4);
		method1 (1,2,3,4,5);
		method1 (1,2,3,4,5,6,7,8,9,10);
		
		//* method2
		method2("�ȳ�", "�氡");
		method2("��", "ȭ", "��", "��", "��", "��", "��");
		method2("�䳢", "ȣ����", "����", "��");
		
		
	}
	static void method1 (int...values) { //values �������� �迭�� ���� ����
		System.out.println(values.length);
		System.out.println("=====Arrays.toString()=========");
		System.out.println(Arrays.toString(values));
		
		//for
		for(int i=0; i<values.length; i++) {
			values[i]=i;
			System.out.print(values[i]+" ");
		}
		
		System.out.println();
		System.out.println("====================");
		//enhanced for
		for(int k : values) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("=====================");
		System.out.println();
	}
	
	
	static void method2 (String...values) {
		System.out.println("=======Arrays.toString=====");
		System.out.println(Arrays.toString(values));
		System.out.println();
		System.out.println("========for=======");
	
		//for
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" "); 			
		}
		
		System.out.println();
		System.out.println("=======enhanced for===========");
		System.out.println();
		//enhanced for
		for(String k : values) {
			System.out.print(k+" ");
		}
	
	
	
	
	
	
	}
	
	
	/*
		static void method1 () {
			System.out.println("�Ű������� ���� �޼ҵ� ȣ��");
		}
		static void method1 (int a, int b) {
			System.out.println(a+" , "+ b);
		}
		static void method1 (int a, int b, int c) {
			System.out.println(a+" , "+ b + " , " + c);
		}
		static void method1 (int a, int b, int c, int d) {
			System.out.println(a+" , "+ b + " , " + c + " , " + d);
		}
		static void method1 (int a, int b, int c, int d, int e) {
			System.out.println(a+" , "+ b + " , " + c + " , " + d + " , " + e);
		}
	*/
	
	
	
	

}
