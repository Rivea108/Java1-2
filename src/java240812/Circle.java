package java240812;

public class Circle {
	/*
	 * 자바의 필드변수는 '디폴트값'이 존재한다.
	 */
	int radius;
	
	public Circle() {//기본생성자
		
	}
	
	public Circle(int radius) {//생성자
		//파라미터 값을 필드변수에 대입하기
		this.radius = radius;
	}
	public double getArea() {//메소드
		return 3.14 * radius * radius;
	}
}
