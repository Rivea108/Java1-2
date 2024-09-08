package java240809;

class Pizza extends SuperPizza{
	
	String pizzaType;//필드변수
	
	public Pizza(String pizzaType) {//생성자(클래스와 이름이 동일해야한다.)
		this.pizzaType = pizzaType;
	}
	//리턴타입이 void, 파라미터 타입이 없고, 메소드 이름은 printpizza
	
	public void printpizza() {
	System.out.println("주문하신 피자는 : " + this.pizzaType);	
	}
	//퀴즈1. 피자를만들다를 재정의 하는데,
	//안에 메소드 내용을 "피자 제작 중...." 이라고 변경하시오 
	
	@Override //부모 클래스에 있는 메소드를 재정의(간단히 말하면 덮어씌우기라고 하심)
	public void 피자를만들다(String 재료1, String 재료2) {
		System.out.println("피자 제작 중....");
	}
	
	
	
}

public class 클래스복습4 {

	public static void main(String[] args) {
		
        Pizza p = new Pizza("치즈피자"); //new : 객체(클래스)생성 
		//printPizza 메소드를 호출하시오.
		p.printpizza();
		p.피자를만들다("치즈", "피망");//재정의 한 메소드가 출력됨

		
		//퀴즈2. 부모클래스에 있는 피자가격에 100대입하고 100출력하시오. 
		p.set피자가격(100);
		int 가격 = p.get피자가격();
		System.out.println("가격 : " + 가격);
		}
		
		
		
	}


