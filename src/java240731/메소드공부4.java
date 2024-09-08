package java240731;

public class 메소드공부4 {
	
	public static void 짝수출력(int[] array) { //리턴이 없는 메소드 선언
		for(int i=0; i<array.length; i++) {
	    	  if(array[i] % 2 == 0) {
			System.out.println(array[i]+"는 짝수입니다. : ");
		}
	}
	}
	public static void main(String[] args) {
		
      int [] array = {2,5,7,10};
      int [] array2 = {3,4,5,6,10,20,20,22};
      /*
       * 퀴즈) 메소드를 사용하지말고, array와 array2 원소 중 짝수만 출력하시오
       */
      for(int i=0; i<array.length; i++) {
    	  if(array[i] % 2 == 0);
		System.out.println(array[i]+"는 짝수입니다. : ");
		}
      

	for(int i=0; i<array2.length; i++) {
		if(array2[i] % 2 == 0);
		System.out.println(array2[i]+"는 짝수입니다. : ");
	}

	System.out.println("==========================");

	//메소드를 활용하여 짝수 판별하기
	짝수출력(array); // 파라미터에 배열 넣어주기
	짝수출력(array2);
	
	/*
	 * 이처럼, 메소드를 사용하는 이유는 '로직 분리'다
	 * 한 메도스에 모든 코드를 다 작성하면 재사용하기 어렵다.
	 * 
	 * 좋은 코드는 메소드를 잘 활용하는 것이다.\
	 * 메소드에 리턴이 있으면 값을 변수에 대입할 수 있고,
	 * 메소드가 void라면 메소드 호출만 가능하다.
	 */
     }
}