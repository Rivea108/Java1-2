package java240729;

public class Bubble {

	public static void main(String[] args) {
	    //총 4회전을 하고
		//첫번째 회전에 4번 교환을 함.
		//두번째 회전에는 3번 교환을 함.
		//세번째 회전에는 2번 교환을 함.
		//마지막 회전에는 1번 교환을 함.
		
        //1.for문을 이용해서 4번 만 돌수 있 게 만들어보시오.
		// 버블 알고리즘(자료구조)
		int array[] = {7,4,5,1,3};
		boolean isFlag = false;
		for(int i=array.length; i>4; i--) {//회전
			isFlag = false;//값 초기화
			
			for(int j=0; j< (i - 1); j++) {
				if(array[j] > array[j+1]) { //0번째 값과 첫번째 값을 비교
                     int temp = array[j]; //0번째를 temp라는 임시변수에 저장		
                     array[j] = array[j+1]; //1번째 값을 0번째 값에 대입
                     array[j+1] = temp; //0번째 값을 1번째 값에 대입
                     isFlag = true; //값이 change 되었다면 true
            }
		}//교환 끝
		if(isFlag) { //isFlag값이 true 가 아니라면
			break;//더 이상 정렬이 없으면 break문으로 for문을 멈춘다.
		}
		
		
	}

}
/*
 *	for(int i=0; i<4; i++) {
			
			
			System.out.println("안녕");
			System.out.println("------");
			//4번 교환될 수 있게 -> for문 작성하기
            for(int j=0; j<4; j++) {
            	System.out.println("안녕안녕"); 
 */
	
}
