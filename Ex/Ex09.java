package Ex;

public class Ex09 {

	public static void main(String[] args) {
			//문항9. 정수를 10개 저장하는 배열을 만들고 1~10까지 범위의 정수를 랜덤하게 생성/배열, 평균값
		/*
		int array[] = new int[10];
		int c = (int)(Math.random()*10+1);
		double sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
			System.out.print(c );
			
		}
		*/
		double c = (double) Math.random();	//난수 발생기(임의의 수를 자동으로 발생시킴)
				// 0.000000xxx ~ 0.999999xxx    <== 범위의 임의의 값을 발생시킴
		System.out.println(c);
		
		int d = (int)(Math.random()*10); //0 ~ 9 까지의 랜덤한 값을 생성
		int e = (int)(Math.random()*10+1); //0 ~ 10 까지의 랜덤한 값을 생성
		
		System.out.println("0부터 9까지의 랜덤한 값 : " + d);
		System.out.println("1부터 10까지의 랜덤한 값 : " + e);
		
		// 1부터 100까지의 난수를 발생시킴
		int f = (int)(Math.random()*100+1);
		System.out.println("1부터 100 까지의 랜덤한 값 : " + f);
	
		
		
		
		
		
		
	}

}
