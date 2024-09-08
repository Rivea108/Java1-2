package java_study;

import java.util.Scanner;

public class Java0715_00 {

	public static void main(String[] args) {
		//문장 마지막에 세미콜론을을 찍어야 한다.	
		System.out.println("안녕하세요, 오늘은 월요일입니다.");	
		//프로그래밍은 위에서 아래로 해석
		
		System.out.println(3 + 3 ); //더하기 연산
		System.out.println("치즈"+"돈까스"); //문자 연산 => 문자가 합쳐짐
		
		int value = 10;//int(데이터타입), value(변수이름), = (대입연산자)
		System.out.println("value : " + value);
		
		int math = 90; //int에는 최대 숫자 2의 31승까지만 대입할수있다
		int eng  = 100;
		int kor  = 95;
		int result = math + eng + kor;
		System.out.println("총합은 : " + result);
		System.out.println("평균 점수는 : "+result / 3); // /(몫), %(나머지)
		
		
	    //값을 입력
	    //자바에서는 scanner라는 클래스(기능)을 이용해서 콘솔에 데이터를 받아볼 수 있다.
	    Scanner scan = new Scanner(System.in); //스캐너 선언
	    System.out.print("숫자를 입력하세요 : ");
	    int num = scan.nextInt(); //키보드에 입력된 값을 받받아볼
	    System.out.println("입력핫긴 숫자는 " + num + "입니다.");
	    
	    System.out.println("================시작====================");
	    System.out.print("아이디를 입력해주세요 : ");
	    String username = scan.next(); //문자열 입력 받음
	    System.out.print("비밀번호를 입력해주세요 : ");
	    String userpassword = scan.next();
	    
	    System.out.println("유저 아이디 :  " + username);
	    System.out.println("유저 비밀번호 : " + userpassword);
	    System.out.println("======================종료===============");
		
		}
	}
