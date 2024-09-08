package java240805;

import java.util.Scanner;

public class 메소드복습4 {
	
	public static String 캐릭터생성하기() {
	    System.out.println("캐릭터를 생성해주세요.");
		System.out.println("[1] 아무무 [2]이즈리얼 [3]가렌 [4] 카직스");
		String [] 캐릭터 = {"아무무", "이즈리얼", "가렌", "카직스"};
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String 선택한캐릭터 = 캐릭터[num-1];//입력한 값에서 빼기 1해주기.
		return 선택한캐릭터;
	}

	public static void 캐릭터조회하기(String 캐릭터) {
		System.out.println("선택한 캐릭터는 " + 캐릭터 + "입니다.");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String 선택한캐릭터 = null;
		while(true) {
			System.out.println("프로그램 시작");
			System.out.println("[1] 캐릭터 생성 [2] 캐릭터 조회 [3] 종료");
			int num = scan.nextInt(); //1~3 숫자 입력받기
			if(num > 3 || num < 1) {
				System.out.println("없는 메뉴를 선택했습니다.");
				break;
			}
			switch(num) {
			case 1: 
				선택한캐릭터 = 캐릭터생성하기();//리턴값 받기
			break;
			case 2: 
				//퀴즈)선택한 캐릭터를 파라미터값으로 넘겨주는 메소드 선언해보기
				캐릭터조회하기(선택한캐릭터);
				break;
			case 3: break;
			}
			System.out.println("시스템을 종료합니다.");
			System.exit(0);//강제종료 코드
			break;
		
			
			
		}
	}
}
