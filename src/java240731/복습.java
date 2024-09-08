package java240731;

public class 복습 {

	public static void main(String[] args) {
		
		int n[] = {2,5,8,9,10}; //배열선언
		//for=each를 이용해서 배열 출력하기
		int max = 0; //최댓값을 저장할 변수
		//forEach는 배열길이 만큼만 반복한다.
		for(int i : n ) { //배열안에 있는 값을 차례대로 에 대입을 한다.
			System.out.println("i : " + i);
			if(i % 2 == 0) {
				System.out.println(i+"는 짝수입니다.");
			}
			if(max < i) {//이해안됨
				max = i;	
			}
			
		}
		System.out.println("최댓값은 ? " + max);
		
		//배열 값 오름차순 정렬하기
		//오름차순 정렬하는 알고리즘이 여러개인데, 그 중 대표가 '버블정렬' 입니다.
		//1. 2중 for문 파악하기 => 안에 있는 for문이 모두 다 실행한 후에 밖에 있는 for문이 다시 실행된다.
		System.out.println("==============================");
		for (int i=0; i<3; i++) {
			System.out.println("i : " + i);
			for(int j=0; j<3; j++) {
				System.out.println("j : " + j);
			}
			break;//강제로 멈추게 하기
		}
			//1. for문을 4회전만 세팅
		    // n.length : (n)배열 길이
		//'버블정렬 알고리즘'
		for(int i= n.length; i > 1; i--) {//증감연산자 자리에 ++ or -- 사용가능합니다.
	    for(int j=0; j < i-1; j++) {
	    	if(n[j] > n[j+1]) { //0번째가 1번째보다 크다면?
	    		//swap 로직
	    		int temp = n[j]; //0번째 값을 temp변수에 임시로 저장
	    		n[j] = n[j+1]; //1번째 원소가 더 작았으니 0번째로 간다.
	    		n[j+1] = temp; //0번째 원ㅅ고를 1번째에 대입
	    	}
	    }
		}
		//1~100 소수 구하기, (1하고 자기 자신만을 약수로 가지는 수)
		for(int i=1; i<=100; i++) {
			int count = 0; //1하고 자기 자신만 카운트
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					++count;
				}
			}
			if(count == 2) {
			System.out.println("해당숫자는 소수입니다 : " + i);
		}
		
		
		
	}
	}
}
