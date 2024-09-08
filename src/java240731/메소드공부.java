package java240731;

public class 메소드공부 {
	/*
	 * 리턴타입이 void가 아니라면, 리턴타입에 해당하는 데이터타입을 retune해줘야 합니다.
	 */
	public static int getNum(int x ,int y) {//메소드 선언(리턴 타입이 정수형인 메소드)
		int result = 0;
		result = x + y;//10+20
		return result;//x와 y를 더한 값을 return 함.
	}    
	/*
	 * public : 접근지정자
	 * String : 데이터타입
	 * getStr : 메소드 이름
	 *(String word) : 인자값(*파라미터값, 매개변수)
	 */
	public static String getStr(String word) {//문자형 리턴을 가지고 있는 getStr 메소드
		String a = "입니다.";
		return word + a; 
	}
	/*
	 * public : 접근 지정자
	 * String : 리턴타입이 없다
	 * double : 메소드 이름
	 * (double x) : 인자값 (파라미터 값)
	 */
	public static double getDou(double x) {
		return 0;
	}
	
	/*
	 * public : 접근지정자
	 * void : 리턴타입이 없다
	 * main : 메소드 이름
	 * (String[] args) : 인자값 (파라미터 값)
	 */
	
	public static void main(String[] args) {
	int result = getNum(10,20);//메소드 호출 	
	//리턴값이 있으면 변수에 대입이 가능합니다.
		System.out.println("result : " + result);
		String word = getStr("홍길동");
		System.out.println(word);
		
		
		//getDou 함수를 호출하고, '88.8'를 출력해보시오.
		double x = getDou(88.8);
		System.out.println("x : " + x);
		
		/*
		 * 리턴타입 : 자바 기본 데이터타입(int, long double, boolean ...) 레퍼런스 타입(String ...)
		 *       +void(리턴 타입이 없다).
		 *       
		 * 파라미터(인자) : 자바 기본 데이터타입(int, long, double, boolean ...) +레퍼런스 타입(String ...)
		 * 
		 * 접근지정자 : public. private, protected
		 */
		
	}

}
