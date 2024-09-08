package java_study;

public class Java0722_03 {

	public static void main(String[] args) {
		
		//for문에 break문 사용해보기
		for(int i=1; i<=5; i++) {//i가 5일때까지 반복하는 for문
			System.out.println(i);
			if(i == 3) {//i가 3이라면 
				break; //for문 멈추기.
		}
		/*퀴즈
		 * 1. 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
		 *    모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 구하시오.(사칙연산문제)
		 *    int n = 8: //8명
		 *    int pizze = 0; //피자 수
		 *    
		 *    2. for 문을 이용하여, 10부터 20까지 숫자를 출력하시오
		 *    
		 *    3. (2번 문제이어서) 10부터 20까지 숫자를 모두 더하시오.
		 *    
		 *    4. (3번문제 이어서) 총합이 100이 넘으면 break 문을 이용하여 for문을 멈추시오.
		 */
		
			
	}
		//1.문제 
		int n = 8;
		int pizze = 0;
			
		pizze = n / 7;
		if((n % 7) > 0) {
			++pizze; //증감연산자로 한판 더 주문
		}
		System.out.println("최종 피자 는 " + pizze);
		//2.문제
		
		for(int i=10; i<=20; i++) {
			System.out.println(i);
		}
		//3.문제	
		int y = 0;
		for(int i=10; i<=20; ++i) {
			y = y + i;
		}
		
		//4.문제
		{
			System.out.println("y : " + y);
			if(y > 100)	{ 
				
		}
		
		}
		
		
	}		
}
	
