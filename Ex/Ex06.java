package Ex;
public class Ex06 {
	public static void main(String[] args) {
		//문항6. 주어진 배열의 항목에서 최대값을 구해보세요(for문 이용)
		
		int max = 0;
		int[] array = {4,5,1,2,3};
		for(int i=0; i<array.length; i++) {		//각방의 값을 순환 하면서 가지고 온다.
			if(max<array[i]) {		//방의 값이 max 변수의 값보다 클때
				max = array[i];		//max 변수에 큰값을 저장
			}
		}		
		
		System.out.println("max: "+max);
	}

}
