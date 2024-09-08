package java_study;

public class Java0724_01 {

	public static void main(String[] args) {
		String gift = "황금올리브치킨";
		
		switch(gift) {
		case "지코바" :
			System.out.println("밥이랑 같이");
			break;
		case "황금올리브치킨" :
			System.out.println("음료이랑 같이");
			break;
			
		case "땅땅치킨" : case "굽네치킨" :
			System.out.println("땅땅");
		break;
		//case의 수에는 제한이없다. 계속 쓸 수 있다.
		default : //case에 일치하는게 아무것도 없을 때 실행함.
			System.out.println("안녕");
			break;
			
			/*프로그래밍에서는 반복하는 작업을
			 * for문이나 while문을 이용해서 작용하는데,
			 * 
			 * for문은 조건식이 정해질 때 사용하고 (ex. 10kg 빼려면 운동장 10바퀴 돌고와)
			 * while문 조건식이 모호할 때 사용한다. (ex. 10kg 빼려면,뺄때까지 계속 돌아)
			 */
        //System.out.println(a);//a라는 변수는 for문 초기식에 생성한 변수이기에,
		//for문 중괄호 안에서만 사용이 가능한 '지역변수'이다	
			
		}

		for(int a=0; a<5; a++) {
		    System.out.println(a);
			}
	
	}

}
