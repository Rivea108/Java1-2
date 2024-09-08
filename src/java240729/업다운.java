package java240729;

import java.util.Random;
import java.util.Scanner;

public class 업다운 {

	public static void main(String[] args) {
		
		//특정 숫자를 맞추는 게임
        Random random = new Random(); //컨트롤+쉬프트+o
        int num = random.nextInt(100); //0 ~ 99 사이의 정수 생성
        //System.out.println("num ===> " + num);
        int life = 5; //목숨 5개
        while(true) {//맞출때까지 계속 돌릴 예정
        	System.out.println("Up & Down게임입니다. 숨겨진 수를 맞추어 보세요.");
        	System.out.println("현재 남은 목숨 : " + life);
        	
        	System.out.print("숫자를 입력하세요 => ");
            Scanner scan = new Scanner(System.in);
        	int x = scan.nextInt(); //정수 입력받기
        	if(x > 99 || x < 0) {
        		System.out.println("숫자는 0부터 99까지 입력가능합니다.");
        		--life;//목숨 차감.
        	continue; //다시 while문 처음으로 돌아감. 아래 코드 실행 X
        	
        	}
        		if(x == num) {//랜덤숫자와 입력한 값이 일치한다면 게임 종료
        			System.out.println("맞았습니다.");
        			break;//while문 최종 종료.
        		}else if(x > num) {
                System.out.println("Down");
                   --life;
        		}else {
        			System.out.println("up");
        			--life;
        		}
        	
        	
        }//while문 끝
        System.out.println("게임종료");
        
        
        
}
	
	
}