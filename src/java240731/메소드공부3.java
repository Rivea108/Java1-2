package java240731;

public class 메소드공부3 {

	public static void getSum(int[] array) {//정수형을 리턴하는 함수 선언
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println("최종 값은? : " + sum);
		//return sum;
		
	}
	/*
	 * public : 접근지정자
	 * void : 리턴타입이 없음
	 * main : 메소드 이름
	 */
	public static void main(String[] args) {
		/*
		 * 메소드?
		 * 메소드를 사용하는 이유
		 * 1. 소스가 길어지는 이슈를 방지한다. (main함수에 소스를 전부 구현하면, 소스 파악이 힘들다.)
		 * 재사용성(*****)
		 */
        int n[] = {1,2,4,6};
        //int sum = getSum(n);
        getSum(n);
 		//System.out.println("총합은 : " + sum);
        int n2[] = {7,8,9,10};
        //int sum1 = getSum(n2);
        getSum(n2);
  		//System.out.println("총합은 : " + sum1);
	}
}
