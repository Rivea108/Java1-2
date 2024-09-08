package java_study;

public class Java0712_00 {

	public static void main(String[] args) {
		//사칙연산
		/*(여러줄 주석) ; (세미콜론, 세미콜론은 문장(코딩한줄)의 끝을 의미합니다.
		자바에서는 문장의 끝에 세미콜론을 사용하지 않으면 에러가 납니다.)
		System.out.println();
		*(에스터리스크,asterisk, 키보드 자판상으로 숫자8위에 있습니다.)
		에스터리스크는 프로그래밍에서 곱하기를 사용할때 사용하는 기호이기도 합니다.
		
		*/
		System.out.println(1 + 2); // 1 더하기 2
	    System.out.println(1.2 + 1.3); // 소수 더하기
	    System.out.println(2 * 5); //곱하기
	    System.out.println(6 / 2); // 나누기를 할때는 /(슬래쉬, 키보드 자판상 오른쪽 shift 키 왼쪽)을 사용한다.
	    //문자 더하기
	    System.out.println("제육" + "치즈" + "덮밥" + "곱빼기"); //한 문자로 만들어 준다.
	    //여러줄을 표시하고 싶을 때는 아래와 같이 하면 됩니다.
	    System.out.println("나이키\n아디다스\n노스페이스\n");
	    //퀴즈 여러분 소개글을 \n 이용하여 이름, 사는곳, 나이, 취미를 작성(출력)해보세요
	    System.out.println("고건우\n변동\n28세\n자전거타기\n");
	    // System.out,println : 자바에서 결과를 확인할 때 사용하는 출력기능(메소드)
	    //프로그래밍에서는 변수(variable) 이라는 개념을 이용해서, 값을 받습니다.
	    int x = 10;                            // int : 정수형 데이터 타입
	    System.out.println("x의 값은 : " + x); // = : 대입 연산자
	    int y = 20;                            // 10: 데이터
	    System.out.println("y의 값은 : " + y); // 대입은 오른쪽에서 왼쪽으로 진행한다.
	    int result = x + y; 
	    System.out.println("결과는 ? "+ result);
	    
	    //문자 변수
	    String food = "토마토 피자";
	    System.out.println("오늘 야식은 ?" + food); //변수를 활용한 최종 출력
	    
	    food = "토마토치즈피자"; //변수를 이용하면 값(데이터)를수정할 수 있습니다,
	    System.out.println("오늘 야식은 ?" + food);
	    
	    String food2 = "돈까스";
	    food2 = "치즈돈까스";
	    System.out.println("오늘 야식은 ? " + food2);
	    //항상 끝에 세미콜론(;)을 작성해야 컴퓨터가 문장을 이해할 수 있습니다.
	    System.out.println("===================시작=============");
	    String name = "홍길동"; //이름
        int age = 0; //나이(int는 숫자만 받을 수 있습니다.)
	    String like = "독서"; //취미
	    String addr = "나이"; //거주지
	    //퀴즈) 이름부터 ~거주지 까지 작성해서 출력해보세요.
	    System.out.println("고건우\n28세\n변동\n자전거타기");
	    System.out.println("고건우 "+"28세"+"변동"+"자전거타기");

	    
	   System.out.println("===================종료==============");
	   /*
	   int, String을 데이터 타입이라고 하며,
	   int는 숫자만 입력할수 있있습니다
	   String 문자만 입력할 수 있습니다.
	   
	   '데이터타입'이 있어야 컴퓨터가 더 빠르게 해석할수 있습니다.
	   */
	   
	   /*1. 퀴즈
	   '제육치즈덮밥'이 나오게 출력하기. */
	   String food3 = "제육";
	   String food4 = "덮밥";
	   
	   System.out.println("제육"+"치즈"+"덮밥");
	   System.out.println(food3+"치즈"+food4);
	   /* 2. 퀴즈 
	   math, science, society 점수 총합을 result에 대입 후 출력하기
	    */
	    int math = 90;
	    int science = 100;
	    int society = 60;
	    //변수명은 한번 선언하면 동일한 이름으로 선언할 수 없다.
	    int result2 = 0;
	    
	    result2 = math + science + society;
	    System.out.println("결과" + result2);
	    System.out.println("총합" + result2);
	    System.out.println("평균 : " + result2 / 3); // 나누기를 이용해서 평균구하기
	   /*3. 퀴즈
	   name변수에 본인의 '이름'만 넣어서 아래와 같이 출력하기.
	   ex) 안녕하세요 홍길동입니다.
	   */
	   String word = "안녕하세요, ";
	   String name2 = "고건우";
	   System.out.println("안녕하세요, 고건우.");
	   System.out.println(word+name2+"입니다.");
	   
	   int money = 54000; //5만 4천원
	   int man = 0; //만원 변수
	   int rest = 0; //남은 잔돈 변수
	   
	   man = money / 10000; //man에 5가 대입됩니다.
	   rest = money % 10000; //나머지값을 구할 수 있습니다. (나머지 값은 곧 잔돈)
	   System.out.println("만원 수 : " +man);
	   System.out.println("잔돈 : " +rest);
	   
	   /*
	   길동이는 54000을 만원 짜리 5장으로 바꾸고 싶습니다.
	   man 변수에 5가 (만원 5장) 대입 될 수 있게 수정하고, 남은 잔돈 4000원이 rest에 들어가도록 수정해보세요.
	   힌트) 사칙연산 이용 => 나누기(/), 나머지(%)
	   */
	   
	   
	}
}

