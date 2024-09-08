package java240805;

import java.util.Random;
import java.util.Scanner;

public class 메소드복습3 {

	//배열을 받고 배열을 리턴하는 메소드 선언
	public static int[] 번호작성하기(int array[]) {
		System.out.println("번호를 작성해주세요.");
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<array.length; i++) {
			System.out.println(i+"번째 번호 입력 : ");
			int num = scan.nextInt();//숫자 입력받기
			array[i] = num;//입력 받은 숫자를 배열에 대입하기
		}
		System.out.println("번호 작성이 종료되었습니다.");
		//scan.close();
		return array;
	}
	
	public static void 결과확인하기() {
		int [] array = new int[6];
		Random random = new Random();//자바에서 사용하는 랜덤함수(숫자랜덤)
		for(int i=0; i<array.length; i++) {
		int randomNum = random.nextInt(50) + 1;//0부터 49까지의 숫자가 랜덤으로 나옴
		array[i] = randomNum; //랜덤으로 나온 숫자를 배열에 대입
	}
		System.out.println("===결과 확인===");
		for(int n : array) {
			System.out.println(n+", ");
		}
	}
	public static void 내번호확인하기(int []array) {
		System.out.println("=== 내번호 확인 ===");
		for(int n : array) {
	         System.out.print(n+", ");
		}
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * 메소드 만들기 응용
		 */
		int [] array = new int[6]; //사이즈가 6인 배열 선언
		Scanner scan = new Scanner(System.in);
		int [] result = null; //결과 배열 선언, null은 '값이 없다'라는 걸 의미한다.
		
		while(true) {//while 조건식이 true면 -> while문이 계속 실행됨.
			System.out.println("============프로그램 시작============");
			System.out.print("[1] 번호생성 [2]내번호 확인하기 [3]결과확인 [4]강제종료");
			
			int num = scan.nextInt();
			switch(num) {
			    case 1: 
			    	result = 번호작성하기(array); //작성한 번호 리턴 
			    	break;
			    case 2:
			    	내번호확인하기(result);
			    	break;
			    case 3: 
			    	결과확인하기();//리턴없는메소드
			    	break;
			    case 4: 
			    	System.out.println("===프로그램 종료===");
			    	System.exit(0);
			    	break;
			}
			
			
		}
		
	}

}
