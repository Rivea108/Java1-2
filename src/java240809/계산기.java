package java240809;

/*
 * 클래스에서 인터페이스를 받게되면
 * 인터페이스에 선언된 메소드를 전부다 무조건 '재정의'해야한다. (다형성이라한다)
 * 
 * 객체지향 프로그래밍 3가지 특징
 * 1. 캡슐화 2. 상속 3. 다형성
 */

public class 계산기 implements 계산기인터페이스{

	public int 더하기(int x, int y) {
		return x + y;
	}
	
	
	public static void main(String[] args) {
		
      계산기 a = new 계산기();
      int 결과 = a.더하기(10, 20);
      System.out.println("더하기 결과는 : " + 결과);
      
      
	}


	@Override
	public int 곱하기(int x, int y) {
		System.out.println("곱하기 값은?" + x*y);
		return 0;
	} 

	@Override
	public int 뻬기(int x, int y) {
		System.out.println("빼기 값은?" x-y);
		return 0;
	}

}
