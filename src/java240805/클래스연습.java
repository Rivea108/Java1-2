package java240805;

class 계산기{
	
	public int 더하기(int x, int y) {
		return x + y;
}
	public int 빼기(int x, int y) {
		if(x > y) {
			//리턴을 만나는 순간 메소드 종료
		
		return x - y;
	}else {
		return y - x;
	}
}
	public int 나누기(int x, int y) {
		return x/y;
	}
	public int 곱하기(int x, int y) {
		return x * y;
	}
	
	public int 총합더하기(int [] array) {
		//총합을 구하는 로직을 아래 구현
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}	
public class 클래스연습 {

	public static void main(String[] args) {
		계산기 c = new 계산기();//계산기 객체 생성
		int 더하기결과 = c.더하기(5, 10);
		int 빼기결과 = c.빼기(5, 10);
		int 나누기결과 = c.나누기(5, 10);
		int 곱하기결과 = c.곱하기(5, 10);
		
		System.out.println("더하기 : " + 더하기결과);
		System.out.println("빼기 : " + 빼기결과);
		System.out.println("나누기 : " + 나누기결과);
		System.out.println("곱하기 : " + 곱하기결과);
		
		int[] array = {1,2,3,4,5}; //int형 배열 선언
		int 총합 = c.총합더하기(array); //배열 파라미터에 대입
		System.out.println("총합 : " + 총합);
	}
	
}

