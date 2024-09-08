package java_study;

import java.util.Scanner;

public class Java0715_01 {

	public static void main(String[] args) {
		System.out.println("===========입력===========");
		
		System.out.print("이름을 입력하세요 : "); //print(ln) <----- 개행
		Scanner scan = new Scanner(System.in); //스캐너 선언
		String name = scan.next(); //문자는 next (), 숫자는 nextint()
		System.out.println("입력하신 이름은 : " + name +"입니다.");
		
		//퀴즈 나이를 입력받아보세요.
	    System.out.print("나이을 입력하세요 : ");
	    int age = scan.nextInt();//숫자를 입력받을때는 nextInt();
	    
	    
	    //여러 종류의 데이터를 받아보자
	    
	    System.out.println("몸무게를 임력하세요 : ");
	    double wright = scan.nextDouble();
	    System.out.println("입력하신 몸무게는 : " + wright + "입니다.");
	    
	    System.out.println("결혼을 하셨습니다? : "); // yes or No
	    boolean wedding = scan.nextBoolean(); //true 혹은 false만 입력가능
	    System.out.println("결혼여부 : " + wedding);
	    
		System.out.println("============종료============");
		scan.close (); //스캐너 종료
	
	
		
	}
}
