package java_study;

import java.util.Scanner;

public class Java0717_01 {

	public static void main(String[] args) {
		
        //입력받은 숫자가 짝수일 때 값 출력하기
		// if-else문은 프로그래밍에서 정말 많이 사용하는 문법입니다.
		
		
		Scanner scan = new Scanner(System.in);//컨트롤 쉬프트 o => 자동임프트	
		/* System.out.println("값을 입력해주세요 : ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {//2로 나눌때 나머지값이 0이면 (== : 같다)
	       System.out.println("해당값은 짝수입니다.");
		}
	    */
		
		//if-else (조건식), 모든 프로그래밍언어에 존잰한은 조건식입니다.
		
		int x = 10;
		if(x == 10) {//변수도 태어나고 죽는다.
			
        int y = 10; //선언식 -> 태어남 y는 중괄호 안에서만 사용가능
		//y 는 생을 마감합니다
		System.out.println("y 의 값은? " + y);
		}
		
		/*퀴즈: 
		 *1번. 입력받은 숫자가 짝수인지 홀수인지 출력하시오. (if/else 이용할 것)
		 *2번. 입력받은 숫자가 5의 배수인지 아닌지 출력하시오. (if/else 이용할 것)
		 *3번. 한 층의 높이가 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력하시오.
		 *ex) 건물 층을 입력받고 높이를 구하는 단순 구현문제
		 *4번. 입력받은 점수가 80점 이상이면 "Excellent", 60점 이상이면 "Good",
		 * 그 외는 "Bye"라고 출력하시오. (if/else 이용할 것)
		 *5번. 음료수 종류와 잔수를 입력받으면 가격을 알려주는 프로그램을 작성하시오, 
		 *에스프레소는 2000원, 아메리카노 2500원, 카푸치노 4000원, 카페라떼 3500원이다. if/else 이용할 것
		 *6번(응용문제). 5번에서 아메리카노의 경우 10잔 이상을 주문하면 가격의 5%를 할인해준다. if/else 이용할 것
		 *ex) if안에 if를 또 사용할 수 있습니다.*/   
		 //6번 5% 할인에 대한 힌트 
		 int coffee = 3000;
		 int discount = (int) (coffee * 0.95); //할인계산
		 int discount2 = (int) (coffee - (coffee * 0.05));
		 System.out.println(discount);
		 System.out.println(discount2);
		 
		 //1번 문제
		 System.out.println("값을 입력해주세요 : ");
		 int num1 = scan.nextInt();
		 
		 if (num1 % 2 == 0) {
		 System.out.println("해당값은 짝수입니다.");
		 }else
         System.out.println("해당값은 홀수입니다.");
		 
         //2번 문제
		 System.out.println("5의 배수인지 아닌지 확인하세요 : ");
		 int num2 = scan.nextInt();
		 
		 if (num2 % 5 == 0) {
		 System.out.println("5의 배수입니다.");
		 }else
         System.out.println("5의 배수가 아닙니다.");
		
		 //3번 문제??
		 System.out.println("몇 층인지 입력하세요 : ");
		 int num3 = scan.nextInt();
		 System.out.println(num3 * 5 + " m입니다.");
	     
	     //4번 문제  
		 System.out.println("점수를 입력해주세요. : ");
		 int score = scan.nextInt();
		 if(score >= 80) {
	     System.out.println("Excellent");
		 }else if(score >= 60) {
		     System.out.println("good");
         }else {
 	    	System.out.println("bye");
 	     }
         
		 //5번문제
		 
		
		
		
		
		
		
		
	 }

}
