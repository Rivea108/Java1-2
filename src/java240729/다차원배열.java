package java240729;

public class 다차원배열 {

	public static void main(String[] args) {
        /*
         * 자바에서는 여러차원의 배열을 만들 수 있습니다.
         * 그러나 일반적으로 3차원 이상의 배열은 사용하지 않습니다.
         * 2차원 배열 알아보기
         */
		
		int array[][] = new int[2][5]; //2차원 배열 선언
		//2차원 배열 선언과 초기화
		//{3,5} ==> 1행, 3은 1열
		int score[][] = {{3,5},{3,7},{3,4}}; 
		int sum = 0;
		
		//2차원 배열에 있는 값 모두 더하기
	    //2차원 배열은 이중for문이랑 같이 사용 
		for(int i=0; i<score.length; i++) {//score[i].length 베열 전체 길이
			for(int j=0; j<score[i].length; j++) {//score[i].length 행의 길이
				sum += score[i][j]; //i는 행, j는 열 의미.
				
			}
		}
		System.out.println("총합은 : " + sum);
		
	}

}
