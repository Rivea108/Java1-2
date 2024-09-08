package java240805;

/*
 * 클래스 안에는 
 * 필드변수와 메소드가 존재한다.
 * 
 * 클래스는 객체(햄버거)의 속성(필드변수)과 행위선언(메소드)으로 이루어짐
 * 모든 사물이 객체이다.
 * 객체 : 자동차, 학교, 비행기 등등
 */
class 자동차{ 
	//클래스 이름이 자동차니깐 해당 클래스 안에는 자동차와 관련된 속성과 행위가 온다
	String 자동차타입; //경차 or 대형차
	String 브랜드명; //현대 or 기아
	
	public void 주행거리를조회하다( ) { //행위 (메소드)
		
	}
}
class 햄버거3{//햄버거 클래스 선언
	String 햄버거종류; //필드변수 선언(전역변수)
	
	public void 햄버거출력() {//메소드 선언
		System.out.println(햄버거종류); //전역변수 출력
	}
	
}
class 리그오브레전드{
	/*
	 * 리그오브레전드와 관련된 속성(필드변수) 선언
	 */
	String 닉네임;
	String 주포지션;
	String 티어;
	int 승리횟수;
	
	//생성사 == 메소드인데, 리턴타입이 없는 메소드이다
	//1. 생성자는 리턴타입이 없다.
	//2. 생성자이름은 무조건 해당 클래스 이름과 동일해야 합니다.
	//3. 생성자의 목적은 ***필드변수 초기화***이다.
	public 리그오브레전드(String 닉네임, String 주포지션, int 승리횟수) {
		this.닉네임 = 닉네임; //this : 필드변수를 의미함
		this.주포지션 = 주포지션;
		this.승리횟수 = 승리횟수;
	}
	/*
	 * 자바에서는 행위(메소드) 이름이 중복될 수 있는데
	 * 단, 파라미터 값만 다르면 중복해서 사용 가능하다. => '오버로딩'
	 */
	public 리그오브레전드() {
		
	}
	
	
	public void 사용자정보조회( ) {
		System.out.println("사용자 닉네임: " + 닉네임 + "");
	}
}
/*
 * public class : 해당 클래스 파일 이름을 의미
 * 클래스 파일 하나에 public class는 한번만 사용가능하다
 */
public class 클래스복습 {

	public static void main(String[] args) {
		햄버거3 햄버거1 = new 햄버거3(); //객체 생성하기.
		햄버거1.햄버거종류 = "치즈버거"; //. <- 의미는 해당 객체에 접근하겠다.
	    햄버거1.햄버거출력(); //메소드 불러오기
		
	    //리그오브레전드() : 생성자
	    
		리그오브레전드 lol = new 리그오브레전드("페이커","미드",3000); //lol : 해당 객체의 변수이름
		//lol.닉네임 = "페이커";
		//lol.티어 = "마스터";
		lol.사용자정보조회();
		// 아래에 lol2를 만들고, 닉네임 홍길동, 티어 브론즈를 출력하시오.
		
		리그오브레전드 lol2 = new 리그오브레전드("홍길동","탑",5000); 
		//lol.닉네임 = "홍길동";
		//lol.티어 = "브론즈"; 
		lol2.사용자정보조회();
		//클래스를 만들면 재사용할 수 있다.
		//즉, 객체지향언어(== 클래스개념이 있는 언어)가 나온 이유가 프로그래밍을 재사용하기 위해서다.
		//대표적인 객체지향언어는 : C++, JAVA, PYTHON, R, GOLANG, RUST ...
		
	}

}
