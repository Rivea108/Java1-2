package java_study;

import java.util.Scanner;

public class Java0722_02 {

	public static void main(String[] args) {

		/*
		 * 프로그램에서는 동일한 연산이나 코드 블록을 반복적으로 실행하는 경우가 허다합니다.
		 * 예를 들면, 1에서 100까지 더하기를 하는 경우 덧셈을 100번 반복해야합니다.
		 * 
		 * 자바는 이러한 반복연산을 프로그래밍으로 할수 있도록 다음 3가지 종류의 반복문을 제공합니다.
		 * 1. for 2. while 3. do-while(잘 안씀 이런게 있다라고 알고계시면 됩니다. 프로그래밍 시험 X 실무 X)
		 * 
		 * 
		 */
		
		//문법
		for(int i=1; i<=5; ++i) {
			System.out.println("i의 값은 " + i);
		}

		/*for문 순서
		 * 1. int i=0; => 초기문
		 * 2. i<5; => 조건식
		 * 3. System.out.println("i의 값은 : " +1); => 실행문
		 * 4. ++i => 증감연산자(1씩 증가한다)
		 */
		//퀴즈) 1부터 20까지 출력해보세요.
		for(int i=1; i<20; i++) {
			System.out.println(i);
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("직업을 선택해주세요.");
		String job = scan.next();
		System.out.print("현재 레벨을 선택해주세요.");
		int lv = scan.nextInt();
		
		if(lv >= 30) { //레벨이 30이상이면 //if 무
			switch(job) {//switch문
			case "도적" :
			System.out.println("2차전직은, 커닝시티로 가시오.");			
			break;
			case "전사" :
			System.out.println("2차전직은, 페리온로 가시오.");			
			break;
			case "궁수" :
			System.out.println("2차전직은, 헤네시스로 가시오.");
			for(int i=0; i<1; i++) {
				System.out.println("야호,전직한다. 카니발 할수 있다");
			}
			break;
			case "마법사" :
			System.out.println("2차전직은, 엘리니아로 가시오.");			
			break;
			}
		}
		else {//레벨이 30미만이면
			System.out.println("사냥하고 오세요 용사여!");
		}
		//반복문 for문안에 즉,실행문에 if/else문도 사용할 수 있습니다.
		
		int y = 0;
		for(int i=1; i<=10; ++i) { //총 10번 실행하는 for문입니다.
			int z = 10; //z는 for문 안에서만 사용가능하다(==지역변수)
		//실행문안에 if/else이용해서 코딩하기
			if(i % 2 == 0) {
				System.out.println("i " + i+ "는 짝수입니다.");
			}
		}//중괄호 안에 선언된 변수는 중괄호가 끝날때 소멸된다.(중괄호 안에서 탄생하고 
		System.out.println("y :" + y);
		//1부터 10까지 더해보기
		//1+2+3+4+5+6+7+8+9+10=>55
		int sum = 0;
		for(int i=1; i<=10; ++i) {
			sum = sum + i;
		}
		System.out.println("총 합은 : " + sum +"입니다.");
		
		//퀴즈1. 5부터 15까지 출력하기
		for(int i=5; i<=15; ++i) {
			System.out.println(i);
		}
		//퀴즈2. 1~10까지 중 3의 배수만 출력하기
		//증강연산자를 이용해서 3의 배수 몇개인지 알아내기.
		for(int i=1; i<=10; i++) {
			if(i%3 == 0) {
				System.out.println(i);
			
			}
		}
		
		}
		
		}
   
