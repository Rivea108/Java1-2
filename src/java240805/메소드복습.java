package java240805;

public class 메소드복습 {

	/*
	 * 메소드(함수)구성 형석
	 * public : 접근지정자
	 * void :리턴타입
	 * () :매개변수, 파라미터, 인자
	 * => 빈괄호는 '파라미터값이 없다.' 라고 말한다.
	 */
	
	public static void printWord() {
		System.out.println("안녕하세요.");
	}
	/*
	 * 파라미터값이 존재하는 메소드 형식
	 * int타입과 return하는 메소드 작성
	 * int x와 int y를 파라미터로 받고 있음
	 */
	
	public static int getValue(int x, int y) {//모든 변수는 라이프 사이클(태어나고 죽음)이 존재하는데,
		return x + y;                        //파라미터에 있는 변수들은 메소드 안에서만 사용이 가능하다.
		                                     //즉, 메소드가 Main함수에서 호출 될 때 태어나고 끝나면 생을 마감한다.
	}
	
	public static void main(String[] args) {
		/*
		 * 메소드는 C/C++의 함수와 동일한 개념.
		 * 자바의 모든 메소드는 반드시 클래스안에 있어야 한다.
		 * 작성한 메소드는 Main함수에 불러와야 실행이 됩니다.
		 * 
		 * 자바는 C/C++과 다르게 Main함수에 static이라는 문법이 존재한다.
		 * static은 '공유'한다 라는 의미이고, Java 메모리에서 따로 관리하는 영역입니다. 
		 * Main함수는 static 메소드인데, static 메소드에서ㅗ 다른 메소드를 불러오려면,
		 * 해당 메소드는 static이어야 합니다
		 */

		printWord(); //오류 발생 -> static이 없어서, printWord에 static 작성하기 
		getValue(10, 20); //오류발생 -> 메소드에 파라미터 값이 존재한다면 *무조건 파라미터 값을 대입해야합니다.
		//순서에 맞게 파라미터 값이 대입이된다.
		//System.out.println("x의 값은? + x"); x를 호출할 수 없습니다.
		String x = getWord("치즈돈까스");//메소드에 리턴이 존재하면 (void가 아니라면) 변수에 대입이 가능하다
		/*
		 * 메소드를 잘 활용하면, ***중복된 코드를 간소화*** 해줍니다.
		 * 숙련자들은 메소드에 코드를 여러줄 적는 것 보다 메소드를 작게 작게 나눠서 구현합니다.
		 */
		
	}

	/*
	 * 메소드 작성은 Main함수 위에하던 아래하던 상관이 없다.
	 */
	public static String getWord(String word) {
	return word;
}
}