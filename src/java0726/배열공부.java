package java0726;

public class 배열공부 {

	public static void main(String[] args) {
		int n[] = {100,60,70,95};
		/*
		 * 문제 1. 배열 n에 있는 총합구하기!
		 * 문제 2. 배열 n에 있는 값 중 짝수 개수 구하기!
		 * 문제 3. 배열 n에 있는 평균값 구하기!
		 * 문제 4. 배열 n에 있는 값 중 100이 있으면, '참, 잘 했어요' 출력하기.! 
		 */
		
		//1번
		int sum = 0;
		for(int i=0; i<n.length; i++ ) {
			sum += n[i];
		}
		System.out.println("총합은 : " + sum + "입니다.");
		//2번
		int count = 0;
		for(int i=0; i<n.length; i++ ) {
			if(n[i] % 2 == 0);
			++count;	
		}
		System.out.println("총 수는 "+count+"입니다.");
		//3번
		System.out.println("평균 값은 : "+sum / n.length);
		//4번
		for(int i=0; i<n.length; i++) {
			if(n[i] == 100) {
				System.out.println("참 잘했어요");
			}
		}
		
	}

}
