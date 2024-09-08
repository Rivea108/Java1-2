package java0726;

public class 중첩for문 {

	public static void main(String[] args) {
		/*
		 * for문 : 특정 조건이 정해질 때 (ex 5번만 실행해라)
		 * for(int i=0;(초기식) i<5;(조건식) i++(증감식, 1씩 증가)) {
		 * 실행문장;
		 * {
		 * while문 : 특정 조건을 만족할 때까지 (5번이나 100번이든 원하는 결과가 나올 때까지)
		 * while(조건식)
		 * 실행문자;
		 * break; //브레이크로 멈춤.
		 * }
		 */
		
		/*
		 * 7월 26일 
		 * 중첩 for문 : 반복문 안에 반복문을 사용할 수 있다.
		 * 이것을 중첩 반복이라고 한다.
		 * 
		 * 반복은 몇 번이고 중첩 가능하지만, 너무 많은 중첩은 코드를 복잡하게 한다.
		 */
		
		/*for(int i=0; i<3; i++) {//아우터 for
		
			for(int j=0; j<3; j++) {//이너 for
				System.out.println("j의 값은 " + j); //안에 있는 for문이 모두 돌고. 아래 코드가 실행됨.
			}
			System.out.println("i의 값은 " + i);
			//System.out.println(j); -> j 오류, j는 더이상 사용할 수 없음.
		}*/
		//2중 for문을 이용한 구구단 출력하기
        for(int i=0; i<=9; i++) {
        	for(int j=0; j<=9; j++) {
        		System.out.println(i + "*" + j + "="+ i*j);
        	}
        	   System.out.println();//공백 용도
        }
		
		
		
		
		
	}

}
