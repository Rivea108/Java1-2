package java_study;

import java.util.Scanner;

public class Java0715_복습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Scanner 선언
		
		System.out.println("숫자를 입력하세요 : ");
		//int : 데이터 타입(정수), 4byte(31bit), 8 bit, 2의31승 -> 약 21억
		int x = scan.nextInt(); //숫자를 입력받을 때는 nextInt()
		System.out.println("문자를 입력하세요 : ");
		String y = scan.next();//문자열을 입력받을 때는 next();
		/*
		nextInt() : int(정수)형을 입력받을 때
		nextdouble() :double(실수)형을 입력받을 때
		next() : 문자열을
		nextboolean() : boolean형(논리형 true or false)를 입력받을 때
		
		자바는. 기본자료형 8개와 참조자료형 1개 총 9개의 데이터타입을 가지고 있습니다.
		기본자료형 byte, shor, int, long, shar, float, double, boolean
		참조자료형(C/C++ 포인터) String (앞에 대문자인게 특징이다.)
		*/
		
		// 퀴즈 1.이름(문자), 몸무게(실수), 나이(정수), 독신여부(boolean) 출력하기
		
		System.out.print("이름을 입력하세요");
		String name = scan.next(); 
		System.out.println("이름 : " + name);
		
		System.out.print("몸무게를 입력하세요");
		double weight = scan.nextDouble();
		System.out.println("weight : " + weight);
		
		System.out.println("나이를 입력하세요");
		int userage = scan.nextInt();
		System.out.println("나이 : " + userage);
		
	    System.out.println("독신여부를 입력하세요");
		String username = scan.next();
		System.out.println("");
		}
	}
