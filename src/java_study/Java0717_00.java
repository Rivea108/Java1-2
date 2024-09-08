package java_study;

import java.util.Scanner;

public class Java0717_00 {

	public static void main(String[] args) {
		

    //변수 이름 규칙
		/*
		 * 1. 자바는 한글지원
		 * 2. 대소문자 구별할 것
		 * 3. 길이 제한 없음
		 * 4. 첫 번째 문자로는 숫자가 불가능
		 * 5.'_','$'외 특수문자 불가능
		 * 
		 */
		int 나이 = 22; //한글지원
		int 햄버거222 = 3; //첫번째 문자 숫자 불가능
		
		System.out.println("나이는 ? " + 나이); //실행은 Ctal + F11
		/*
		 *  사칙연산 (+, -, *, /, %)
		 *  비교연산 (>, <,  <=, >=)			
		 *  삼항연산자
		 *  and 연산자, or 연산자
		 */
		
		//삼항연산자
		int x = 5;
		int y = 3;
		int big = (x < y) ? 20 : 10; //맞으면 20이 대입, 틀리면 10 대입
		System.out.println(big);
		
		// 조건문
		/*
		 * 조건문 : 조건문을 이용하면 조건의 참, 거짓에 따라 서로 다른 작업을 수행할 수 있습니다.
		 * 자바의 조건문은 C/C++와 거의 동일하며 크게 IF-ELSE문 switch문으로 나눈다
		 * 
		 * if(조건식){
		 *  ..실행 문자..
		 *  }
		 */
		
		
		int n = 4;
		if(n > 2 ) {//n이 2보다 크다면? => 조건이 참
			//결과가 참이면 if 중괄호안에 있는 내용이 실행됩니다
			n= n * 2;
		}
		System.out.println("n의 최종값은? "+n);
		if(n ==8) {//n이 8이랑 같다면 (==)
		 System.out.println("동일하다.");
		}
		
		Scanner scan = new Scanner(System.in); //ctal + shift + o (자동 import)
		System.out.println("나이를 입력하세요");
		int age =scan.nextInt();
		
		if(age >= 20 && age <= 30) {//&& and 연산자, and 연산자는 두 조건이 모두 만족해야함.
			System.out.println("20대 입니다.");
		}else {//if의 조건식이 거짓인 경우 실행합니다.
			System.out.println("당신은 20대가 아니군요");
		}
	    //1. 퀴즈 : 점수(정수형)를 입력받고, 80점이 넘어가면 '합격입니다.'를 출력하고,
		//80점 미만일시 '불합격입니다.'를 출력하시오.
		System.out.println("점수를 입력해주세요. : ");
		int score = scan.nextInt();
	    if(score >= 80) {
	    	System.out.println("합격입니다.");
	    }else {
	    System.out.println("불합격입니다.");
	    }
	    
	    //다중 if-else문
	    if(score >= 90) { //90점이라면?
	    	System.out.println("A학점 입니다.");
	    }else if(score >= 80) {
	    	System.out.println("B학점 입니다.");
	    }else if(score >= 70) {
	    	System.out.println("C학점 입니다.");
	    }else {
	    	System.out.println("F");
	    }
	
	
	}

}