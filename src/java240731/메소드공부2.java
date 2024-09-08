package java240731;

public class 메소드공부2 {

	public static int getSum(int[] array) {//배열을 인자로 받는 메소드 선언
		//배열안에 있는 원소(인덱스) 모두 더하기
		int sum = 0;
		for(int i=0; i<array.length; i++) {
	    sum += array[i];    
		}
		return sum;//최종 sum을 리턴합니다.
	}
	
	public static double getAvg(int[] array) {
		double avg = 0;
		for(int i=0; i<array.length; i++) {
			avg += array[i];
		}
	   avg = avg / array.length;
		return avg;
		
	}		
	public static void setNum(int x) {//return이 없는 메소드 선언
		System.out.println("x의 값은 ? " + x + "입니다.");
	}
	
	public static void main(String[] args) {
		
	int n[] = {3,6,9};//정수형 배열 선언
	//리턴이 있다는건, 변수에 대입을 할 수있음.
	int sum = getSum(n); //파라미터에 배열 넣기
	System.out.println("결과는 : " + sum);
	//퀴즈 n을 getAvg 파라미터에 넣어서 n에 평균을 출력하시오.
	double avg = getAvg(n);
	System.out.println("결과는 : " + avg);
	setNum(10);//오류발생 : setNum은 return이 없는 void 메소드임.
	
	
		
	
	
	}

}
