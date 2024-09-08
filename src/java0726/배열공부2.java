package java0726;

public class 배열공부2 {

	public static void main(String[] args) {
	//1.문제 배열 s에 있는 단어 합치기	
		String s[] = {"아이유","아이브","비비"};
		String word = "";
	    for(int i=0; i<s.length; i++) {
	    	word +=s[i];
	    }
	    System.out.println(word);
		
		
    //2.문제 배열 n에 있는 정수 중 최댓값 구하기.(for문 if 이용하기)
		int n[] = {2, 4, 10, 1, 15};
		int sum = 0;//최댓값 변수
		for(int i=0; i<n.length; i++) {
			if(n[i] % 60 == 0);
			++sum;	
		}
		System.out.println("최댓값"+sum+"입니다.");
		
    //3.문제 1~99까지 369게임에서 박수를 쳐야하는 경우 순서대로 화면에 출력하기.(for문 if 이용하기)
	//ex) 3 -> '박수한번' , 33 -> '박수두번'
		
		for(int i=1; i<=99; i++) {
	         int count = 0;
	         int f = i / 10; //10의 자리수
	         int second = i % 10; //1의 자리수
	         
	         if((f != 0) && (f % 3) == 0) {
	            count++;
	         }
	         if((second != 0) && (second % 3) == 0) {
	            count++;
	         }
	         if(count == 1) {
	            System.out.println("박수한번");
	         }
	         if(count == 2) {
	            System.out.println("박수두번");
	         }
	      }
					
		//금요일 마지막문제
		//두 개의 정수 n과 m이 주어집니다.
		//별(*) 문자를 이용해 가로의 길이 n1, 세로의 길이가 m인 직사각형 형태를 출력하시오.
		int n1 = 3; //가로
		int m = 5; //세로
		
		for(int i=1; i<=3; i++) {		
		
			for(int j=1; j<=5; j++) {
			}
				System.out.print("*");
			
						}
	}
}
