package java240729;

public class Java0729_00 {

	public static void main(String[] args) {
	//인덱스는 0부터 시작
	//0~4번째 까지 저장할 수 있는 배열선언
	int intArray[] = new int[5];
	
	int intArray1[] = new int[5];
	
	intArray1[0] = 5;//0번째 순서(인덱스)에 5 대입
	intArray1[1] = 10;//1번째 인덱스에 10대입
	//intArray[5] = 10;//오류 발생, 4번째 인덱스 까지 가능
	
	int size = intArray1.length; //배열의 길이
	System.out.println("배열의 길이는 : " + size);
	System.out.println("첫번째 인덱스 값 : " +intArray1[0]);
	
	
	intArray[2] = 10;
	intArray[3] = 20;
	intArray[4] = 30;//마지막 인덱스
	
	//배열에 정수형 데이터를 저장했습니다. 이제, 저장된 데이터를 출력해보겠습니다.
	
	//만약, for문을 몰랐더라면 아래와 같이 출력합니다.
	System.out.println(intArray[2]+","+intArray[3]+","+intArray[4]);
	
	//for문을 이용한 배열 인덱스 출력하기 -> 배열이 나왔다 -> 바로 반복문 
	for(int i=0; i<intArray.length; i++) {//배열은 0번 째 부터 시작되니 초기값을 0으로 한다
		System.out.println(intArray[i]);
	}
	
	
	System.out.println("==================================");
	int Array[] = {3,9,5,1,10}; //배열 선언과 동시에 값 입력 (선언 -> 초기화)
	int max = 0;//최댓값을 알아낼 변수
	//1. 배열 인덱스 안에 있는 값 중 최댓값 알아내기
    for(int i=0; i<Array.length; i++) {
    	if(max < Array[i]) {// 처음에  max는 0 이므로 첫번째 인덱스 안에 있는 값이 무조건 대입이 된다.
    		max = Array[i];
    	}
    }
	System.out.println("최댓값은 ? " + max);
	int min = Array[0];//배열의 첫 번째 값을 최솟값으로 초기화
	for(int i=0; i<Array.length; i++) {
		if(min > Array[i]) {
			min = Array[i];
		}
	}	
	System.out.println("최솟값은 ? " + min);	
    String strArray[] = {"치즈","치즈","감자","감자"};
    for(int i=0; i<strArray.length; i++) {
    	//자바는 C와C++달리 문자를 비교하는 수식이 다르다.
    	//if(strArray[i] == "치즈") (X)
    	if(strArray[i].equals("치즈")) {//equals 문자를 비교하는 함수
    		System.out.println(strArray[i]);
    	}
    }
    //자바는 C달리 새로운 형태의 for 문을 제공한다.
    for(String word : strArray) {//향상된 for문이라고 부르며, forEach라고도 한다.
    	/*firEach 특징
    	 * 1.배열길이만큼 for문이 자동으로 돈다.
    	 * 2.인덱스 안에 있는 값이 자동으로 초기값(word)에 대입된다.
    	 */
    	System.out.println("forEach문으로 출력하기 : " + word);
    }//word역시 for문 안에서만 사용할수 있는 '지역변수'입니다.
    
    int n[] = {1,2,3,4,5};
    //퀴즈,
    //1. for-each문을 이용해서 배열 k 출력하기
    for(int x : n) {
    	System.out.println(x);
    }
    //2. for-each문을 이용해서 배열 k안에 있는 값(원소) 총합 구하기
    int sum = 0;
    for(int x : n) {
    	sum += x;
    }
    	System.out.println(sum);
    	
 
	}

}
