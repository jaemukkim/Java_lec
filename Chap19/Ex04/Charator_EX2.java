package Chap19.Ex04;
/*
A ~ Z ������ �ƽ�Ű �ڵ尪 ���

��� ���
=================
 A, 65
 B, 66
 ...
 Z, 97

a ~ z ������ �ƽ�Ű �ڵ尪 ���

��� ���
=================
 a, 97
 b, 98
 ...
 z, 122

*/
public class Charator_EX2 {

	public static void main(String[] args) {
		
		
		System.out.println("=========A ~ Z==========");
		//A ~ Z
		for(int i=65; i<=90; i++) {
			System.out.println((char)i + " , " + i);
		}
		
		System.out.println("========a ~ z=========");
		//a ~z
		
		for(int i=97; i<=122; i++) {
			System.out.println((char)i + " , " + i);
		}
		
	}

}
