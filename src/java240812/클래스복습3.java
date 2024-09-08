
package java240812;

public class 클래스복습3 {

	public static void main(String[] args) {
		
		Box b = new Box();
		b.draw();
		
		//퀴즈. 20(가로)*3(높이) 사각형 생성하기
		//박스 문자는 '$'
		
		Box b2 = new Box(20, 3, "$");
		b2.draw();
		
		//퀴즈. 5(가로)*5(높이) 사각형 생성하기
	    //박스 문자는 '#'
		
		Box b3 = new Box(5, 5, "#");
		b3.draw();
	}
}
