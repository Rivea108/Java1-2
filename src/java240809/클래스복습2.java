package java240809;

public class 클래스복습2 {

	/*
	 * 상속 복습
	 */
	class 복싱코치{
		
		//필드변수에 private을 많이 합니다.
		private String 코치이름;
		
		public void set코치이름(String 이름) {//private
			 this.코치이름 = 이름;
		}
		public String get코치이름() {
			return this.코치이름;
		}
		
		/*
		 * 접근 지정자 : public, private, protected
		 * 대부분의 객체 지향 언어에는 '접근 지정자'를 두고 있습니다.
		 * 접근 지정자는 다른 클래스에서 접근해도 되는지의 여부를 선언하는 지시어입니다.
		 * 
		 * 자바에서는 클래스를 작성할 때 다른 클래스가 사용해도 되는지 
		 * 허용 여부를 지정해야 합니다. 
		 */
		public void 코치주특기() {
			System.out.println("왼손 쨉 => 왼손 쨉=> 왼손 훅");
		}
		private void 비밀기술() {
			System.out.println("비밀기술");
		}
	}
	
	class 복싱선수 extends 복싱코치 { //복싱선수라는 객체
		String 선수이름;
		int 선수나이;
		
		public void 필살기() {
			System.out.println("왼손 쨉 => 왼손 쨉=> 어퍼 컷");
		}
		
		@Override//오버라이딩 : 메소드 '재정의'
		public void 코치주특기() { //부모 클래스에 있는 메소드를 자식 클래스에서 사용할수 있음.
			System.out.println("기존 기술은 오래됨");
			System.out.println("왼손 훅 => 오른속 훅!");
		}
		
	}
	
	
	public static void main(String[] args) {
		
    복싱선수 a = new 복싱선수();
    a.선수이름 = "홍길동"; //필드변수 값 대입
    a.선수나이 = 20;
    a.필살기();
    a.코치주특기();
    //부모 클래스의 privated은 사용 할 수 없음
    
    복싱코치 b = new 복싱코치();
    //private으로 선언된 메소드 =>본인도 가져올수 없음.
    //getter, setter 함수라고 한다.
    b.set코치이름("김길동");
    String 이름 = b.get코치이름();
    System.out.println("코치 이름 : " + 이름);
	}


	
	}


	
	


