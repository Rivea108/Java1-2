package java240805;

//자바에서 클래스란 '객체'를 의미한다.
//모든 사물이 '객체'가 될 수 있다.
class 햄버거{//클래스 햄버거를 생성(햄버거 객체 선언)
	String 햄버거타입; //필드 변수(전역변수)
	int 햄버거가격;
	
	public void 햄버거출력하기() {//메소드
	System.out.println("햄버거 : " + 햄버거타입);
	System.out.println("가격 : " + +햄버거가격);
	}
}

public class 클래스공부 {

	public static void main(String[] args) {
		//햄버거 객체(class) 불러오기
		//new : 클래스를 호출하겠다
		햄버거 x = new 햄버거(); //햄버거 객체(클래스) 생성
		
		//.이 의미하는건 해당 클래스 변수에 '접근하겠다' 라는 뜻이다.
		x.햄버거타입 = "주니어치즈와퍼";
		x.햄버거가격 = 7000;
       x.햄버거출력하기();
		햄버거 y = new 햄버거();
		y.햄버거타입 = "치즈버거";
		y.햄버거가격 = 15000;
		y.햄버거출력하기();
		
		
	}

}
