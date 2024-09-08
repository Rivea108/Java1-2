package java240805;

class A{
	int x;
	public void setNum() {
		this.x = 10;
		System.out.println("x : " + this.x);
	}
}
class B extends A{ //B(서브클래스)클래스는 A(슈퍼클래스)클래스를 상속받다
	int y;
	
	//부모클래스에 정의된 메소드를 자식클래스에서 가져와 재정의함.
	@Override
		public void setNum() {
		this.x = 30;
		System.out.println("x : " + this.x);
		}
}
public class 상속복습 {

	public static void main(String[] args) {
		
		B b = new B();//객체생성
		//b는 a를 상속받았으므로, a클래스에 있는 필드변수와 메소드를 사용할 수 있다.
		b.x = 10; //슈퍼클래스에 선언된 필드변수 초기화
		b.setNum(); //부모클래스 메소드 호출
		//자식클래스에서 부모클래스 메소드를 재정의하면, 재정의한 메소드를 최종적으로 불러온다.(덮어 씌우기)
	}

}