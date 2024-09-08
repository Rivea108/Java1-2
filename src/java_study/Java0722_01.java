package java_study;

import java.util.Scanner;

public class Java0722_01 {

	public static void main(String[] args) {
		
		int num = 5;
    	++num; 
    	System.out.println("num의 값은 ? " + num);

    	//switch문
    	/*
    	 * switch문은 값에 따라 여러 방향으로 분기하는 경우,
    	 * if문보다 switch문을 사용하면 가독성이 높은 좋은 코드를 작성할수 있다.
    	 */
    	
    	String day = "monday";
    			switch(day) {
    			case "monday" ://day값이 monday와 같을 때 아래 문장 실행
    				System.out.println("오늘은 월요일입니다");
    				break; //break문을 작성하지 않으면 모든 case가 실행됩니다.
    			case "friday" ://day값이 friday와 같을 때 아래 문장 실행
    				System.out.println("오늘은 금요일입니다");
    				break;
    			}
    			String grade ="A";
    			switch(grade) {
    			case "A" : case "B": //case를 나열해서 작성할 수 있습니다.
    				System.out.println("Excellent");
    				break;  			
    			}
    	/*정수로 월을 입력받는 변수를 생성 후
    	 * 값이 3~5면 -> 봄입니다. 출력 
    	 *     6~8이면 -> 여름입니다. 출력
    	 *     9~11이면 -> 가을입니다. 출력
    	 *     12~2이면 -> 겨울입니다. 출력
    	 *     
    	 *     출력하는 switch문을 작성해보시오.
    	 *     Spring (봄) summer(여름) autumn(가을) winter(겨울)
    	 */
    			Scanner scan = new Scanner(System.in);//입력받기 위해 Scanner입력
    			int month = scan.nextInt();
    			switch(month) {
    			case 3 : case 4 : case 5 :
    		    System.out.println("봄입니다");
    		    break; //조건이 맞는 case문만 실행 후 빠져나간다.
    			case 6 : case 7 : case 8 :
    		    System.out.println("여름입니다");
    	        break;
    			case 9 : case 10 : case 11 :
        		System.out.println("가을입니다");
        	    break;
    			case 12 : case 1 : case 2 :
        		System.out.println("겨울입니다");
        	    break;	    
	    }


    }
}
