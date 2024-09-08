package java_study;

import java.util.Scanner;

public class Java0722_00 {

	public static void main(String[] args) {
		
		//if-else
		
		/*
		 * 조건식이 참(true)이면 if 내부의 '실행 문장'이 실행되며
		 * 거짓이면 if문을 벗어나거나, else문이 있으면 else문이 실행된다.
		 * if(조건식){
		 *  ..실행문장..
		 *  }
		 *  
		 */
    int score = 90;
    
    	
    	/*
    	 * if문이나, if-else문, 혹은 else문의 '실행문장'에 if문이나 if-else문을 내포할수 있습니다.
    	 * 
    	 */
    	
    	//정수와 학년을 입력받아 60점이상이면 합격,아니면 불합격을 출력하라, 단 4학년 이상이어야 합격.
    	//아니면 불합격을 출력하라, 단 4학년은 70점 이상이어야 합격.
    	Scanner scan = new Scanner(System.in); //컨트롤 + 쉬프트 + o(자동 임프트)
    	System.out.println("점수를 입력하세요 : ");
    	int socre = scan.nextInt();
    	System.out.println("학년을 입력하세요 : ");
    	int year = scan.nextInt();
    	
    	if (socre >= 60) {//60점이상이면 합격
    		if(year != 4) {//프로그래밍에서 느낌표는 부정을 의미함.
    	System.out.println("합격");
    		}else if(socre >= 70) {//4학년이라면 70점 이상
        System.out.println("합격");
    		}else {
    			System.out.println("불합격");
    		}
    	}else {
    		System.out.println("불합격");
    	}
    	
    	/*
    	 * 10만원 이상 구매 -> 5%할인
    	 * 30만원 이상 구매 -> 10%할인
    	 * 50만원 이상 구매 -> 20%할인
    	 * fi-else if 문으로 풀어보세요.
    	 */
    	
    	System.out.println("구매한 금액");
    	int money = scan.nextInt();//구매한 금액 입력받기
        
    	if(money >= 500000) {
    		money = (int)(money * 0.8); //형변환
    	}else if(money >= 300000) {
    		money = (int)(money * 0.9); //형변환
    	}else if(money >= 100000) {
    		money = (int)(money * 0.95); //형변환
		}
    	
    	int x = 10;
    	x = x * 5; //해당 문잔 간략하게 작성하기
    	x *= 5; //대입연산자 왼쪽에 사친연산이 올수 있다. x = x * 5; 와 x* = 5; 동일하다
    	/*
    	 * +=,-=,*=,/=,%= 같은 사칙연산
    	 */
        //증감연산자
    	int num = 10;
    	++num; // 1씩 더해진다. ++(증감연산자)
    	
    	{	
  	}
     	}	
 	}    	
