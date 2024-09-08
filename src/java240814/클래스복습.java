package java240814;

class Bank{// 클래스는 필드변수, 메소드, 생성자 => 캡슐화
	
	private int money;
	
	/*
	 * 메소드는 한가지 일만 잘하면 된다.
	 * set : 필드변수 대입
	 * get : 필드변수 호출 
	 */
	
	public void setmoney(int money) {
		this.money += money; //(+=모르겠다면 this.money + money 의미는 누적한다 계속 더한다는 의미)
	}
	public int getMoney() {
		return this.money;
	}
}




public class 클래스복습 {

	public static void main(String[] args) {
		
        Bank  신한은행 = new Bank();
        신한은행.setmoney(100);
        신한은행.setmoney(500);
        int money = 신한은행.getMoney();
        money = (int) (money + (money * 0.3));
        
        System.out.println("money : " + money);
        
        /*
         * try / catch
         * 문법에 맞지 않게 작성된 코드는 '컴파일러'에 의헤 오류를 걸러내지만, 사용자의 잘못된 입력으로 '예외'가 발생한다
         * 
         * 대표적인 예외
         * 1. 정수를 0으로 나눈 경우
         * 2. 배열의 크기보다 큰 인덱스로 배열의 원소를 접근하는 경우
         * 3. null 체크
         */
        int []intArray = new int[5]; //5(0,1,2,3,4)개의 공간을 가진 배열 선언
        try {//시도하다
        	 intArray[0] = 10; //0번째 인덱스에 10을 넣었음.
             intArray[4] = 10; //마지막 인덱스에 10을 넣었음.
             intArray[5] = 100; //배열에 없는 5번 인덱스에 100을 넣었음
        }catch(Exception e) { //잡다
       System.out.println("오류가 발생했습니다.");
        //e.printStackTrace(); // 오류 상세 설명
        }//실무에선 잘 사용하지 않는다.
        
        
        
	}
}
