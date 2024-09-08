package java240812;

/*
 * 인터페이스를 받은 클래스는 무조건 '재정의' 해야한다.
 */
class 삼성폰 implements PhoneInterface{

	@Override
	public void 결제하다() {
		System.out.println("삼성페이 결제");	
	}

	@Override
	public void 운영체제조회() {
		System.out.println("안드로이드");	
	}
	
}
class 애플폰 implements PhoneInterface{

	@Override
	public void 결제하다() {
			System.out.println("애플페이 결제");
	}

	@Override
	public void 운영체제조회() {
			System.out.println("IOS");
	}
	
}

public class 클래스복습4 {

	public static void main(String[] args) {
		
		삼성폰 갤럭시 = new 삼성폰();
		갤럭시.결제하다();
		갤럭시.운영체제조회();
		//아이폰 출력해보기

		애플폰 Iphone14 = new 애플폰();
		Iphone14.결제하다();
		Iphone14.운영체제조회();
		
		
	}

}
