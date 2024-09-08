package java_study;

import java.util.Scanner;

public class Java0715_02 {

	public static void main(String[] args) {
		//두 개의 정수를 입력받아, 두 수의 합,차,곱,나누기한 몫과 나누기 출력
		
		/* 여러줄 주석
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 => ");
		int x = scan.nextInt(); //정수 입력받기
		System.out.println("숫자를 입력하세요 => ");
		int y = scan.nextInt(); //정수 입력받기
		
		System.out.println("합 "+  (x+y));
		System.out.println("차 "+  (x-y));
		System.out.println("곱 "+  (x*y));
	 	System.out.println("몫 "+  (x/y));
		System.out.println("나머지 "+  (x%y));
		System.out.println("시스템 종료.");
		*/
		
		//스캐너 선언부터 하셔야합니다
		/*퀴즈 1. 가로,세로 값을 실수형(double)으로 입력받아 사각형의 면적과 둘레를 계산하여 출력
		면적 : 가로 * 세로
		둘레 : (가로 +세로) * 2
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로 값를 입력하세요 => ");
		int x = scan.nextInt(); //가로 값 입력
		System.out.print("세로 값를 입력하세요 => ");
		int y = scan.nextInt(); //세로 값 입력
		
		System.out.println("면적"+ (x*y));
		System.out.println("둘레"+ (x+y)*2);
		
		
		
		/*퀴즈 2. 직각삼각형 빗변의 제곱은 a2제곱 + b2제곱 = c2제곱 피타고라스가 정의함. 즉, 두 변을 각각 제곱한 것의 합이 빗변임.
		          한 변의 길이를 나타내는 정수(int) a 변수와 빗변의 길이를 나타내는 정수(int) c의 변수가 주어질 때, 다른 한변의 길이 제곱 출력하기
		          
		          a,c를 scan으로 입력 받아주세요
		          ex) int a = scan.nextInt(); // 3받았다고 가정
	  	              int c = scan.nextInt(); // 5받았다고 가정
	  	              int b = (구현하기): //결과는 16이 나옴
		*/          
		
		System.out.println("a 값를 입력하세요 => ");
		int a = scan.nextInt();
		System.out.println("c 값를 입력하세요 => ");
		int c = scan.nextInt();
		int b = (c*c) - (a*a);
		System.out.println("정답은 : " + b);
		
		// 내용 정정답은
		/*
	        Scanner (키보드로 부터 데이터를 받아옴.)
	        next : 문자 받을 때 
	        nextInt :  숫자(정수형) 받을 때
	        nextdouble : 실수 받을때
	        nextBoolean : true or false를 받을 받을 때
	        
	        nextLong : 숫자(정수형) 받을 때, 약 21억 이상 숫자를 표현할 때
	        
	        프로그래밍 연산자 +(더하기), -(빼기), *(곱하기), /(몫), %(나머지)
	        프로그래밍 데이터타입 int(정수), double(실수), String(문자), boolean(논려형)
	        
	        8비트는 1바이트
	        1개의 비트에 0 혹은 1만 표현 가능.
	        한번 선언된 변수이름은 재사용은 가능하나, 같은 이름으로 선언은 불가능하다.
	        
	        int num = 10; //num이라는 변수 생성(선언)
	        num = 20; //num에 20숫자 대입.
	        
	        String num = "20"; // num이라는 숫자 중복(오류!)
	        
	        자바는,기본자료형 8개와 참조자료형 1개 => 총 9개의 데이터타입을 가지고 있다.
	        기본자료형 (byte, short, int, long, char, float, dorble, boolean)
	        참조자료형 (String 그 외 기타)
	        */
		
		}
	}
