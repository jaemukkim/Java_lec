package Chap19.Ex04;
/*
A ~ Z 까지의 아스키 코드값 출력

출력 결과
=================
 A, 65
 B, 66
 ...
 Z, 97

a ~ z 까지의 아스키 코드값 출력

출력 결과
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
