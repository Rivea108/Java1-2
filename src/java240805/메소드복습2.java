package java240805;

public class 메소드복습2 {
	
    /*
     * 배열을 파라미터 값으로 받는 메소드 선언
     */
	public static void 짝수홀수판별하기(int[] array) {
		//array.length : 배열길이(사이즈)만큼
	

	  for(int i=0; i<array.length; i++) {
		  if(array[i] % 2 == 0) {
			  System.out.println(array[i]+"는 짝수입니다.");
		  }else {
			  System.out.println(array[i]+"는 홀수입니다.");
		  }
	  }
	}
	
	public static void main(String[] args) {
		/*
		 * 메소드를 이용해서 짝수, 홀수 판별하기
		 */
        int [] array = {2,3,7,10,15};//int형 배열 초기화
        짝수홀수판별하기(array); //선언한 메소드에 파라미터값 대입
        int [] array2 = {2,3,7,10,15,89,299,100};
        짝수홀수판별하기(array2);//이미 소스가 메소드로 구현이 되어 있으므로 ***재사용***이 가능하다.
        
        
        
	}

}
