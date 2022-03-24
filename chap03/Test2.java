package chap03;

public class Test2 {

	public static void main(String[] args) {
		
		int a = (5<4) ? 3:6; 
		System.out.println(a);
		
		int b = (5>4) ? 3:6;
		System.out.println(b);
		
		int c= 5;
		if(c * 3 == 15 ) {
			System.out.println("Â¦¼ö"); //Âü
		}else {
			System.out.println("È¦¼ö"); //°ÅÁş
		}
	}

}
