package java240809;

public class SuperPizza {

	private int 피자가격;
	
	//접근할수있게 메소드를 만들어야한다.
	//1.set 함수 만들기 => 리턴타입 void, 메소드이름 set피자가격, 파라미터타입 int 피자가격
	
	public void 피자를만들다(String 재료1, String 재료2) {
		System.out.println(재료1+","+재료2+"가 들어간 피자를 만들고있습니다.");
	}
	
	public void set피자가격(int 피자가격) {
		this.피자가격 = 피자가격;// <=== set
	}
	//2. get 함수 만들기 => 리턴타입 int, 메소드이름 get피자가격, 파라미터타입 없음
	public int get피자가격() {
		return this.피자가격;//get함수는 필드변수를 리턴만 한다고해서 get
	}
	
	
}
	
		




