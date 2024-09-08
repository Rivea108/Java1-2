package java0726;

public class 배열 {

	public static void main(String[] args) {
		
		
		/*
		 * 배열 대한 레퍼런스 변수는 다음 두 가지 방법으로 선언한다.
		 * int array[];
		 * int []array;
		 */
		
		String week[] = {"월","화","수","목","금"}; {//문자열을 담은 week 배열 생성.		
			
		}
		System.out.println(week[0]);//0번째 인덱스 월 출력
		System.out.println(week[1]);//1번째 인덱스 월 출력
		System.out.println(week[week.length -1]);//마지막
		//week.length-1 : 배열 길이를 구함. => 5(배열 최대수)
		
		//배열생성
		/*
		 * 배열 생성은 new 연산자를 이용하여 배열을 생성하며 []안에 생성할 인덱스(or 원소) 개수를 지정한다.
		 * 아래 코드는 5개의 정수를 받는 배열을 생성한다.
		 */
		int []array =new int[5]; //배열 선언과 동시에 배열 생성.
		array[0] = 5;
		array[1] = 4;
	    array[2] = 3;
	    array[3] = 2;
	    array[4] = 1; //마지막 인덱스에 1저장.
	    System.out.println(array[0]);
	    //array[100] = 5; //배열 길이는 new int[5] 즉, 5라고 지정했기에 100번째 인덱스는 없다.(오류)
	    //배열은 반복문하고 같이 사용되는 동반자이다.
	    
	    for(int i=0; i<array.length; i++) {
	    	System.out.println(array[1]); //for문을 이용하여 배열 인덱스 출력하기
	    }
		
	    //퀴즈, 배열 안에 있는 값을 총 더해서 출력하시오.
	    int n[] = {5,10,458,50};
	    
	    int n1 = (n[0] + n[1] + n[2] + n[3]);
	    System.out.print("결과"+n1);
		//반복문 이용해서	
	    
	    //sum출력

	    System.out.println("============================");
	    //배열을 이용해서 문자열 합치기.
	    String s[] = {"선배!","마라탕","사주세요","후루후루","탕탕"};//문자를 담는 배열
	    System.out.println(s[2]);
	    
	    //반복문을 이용해서 문자열 합치기
	    String word = "";
	    for(int i=0; i<s.length; i++) {
	    	word +=s[i];
	    }
	    System.out.println(word);
	    System.out.println("============================");
	    
	    }
	    
	}

