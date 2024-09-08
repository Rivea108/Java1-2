package java_study;

import java.util.Scanner;

public class Java0724_00 {

	public static void main(String[] args) {
		/*
		 * while문 프로그래밍에서 사용하는 반복문 중 하나
		 * while : iot(사물인터넷) -> 드론, 냉장고, 공장기계
		 */
		int x = 0;
		while(x < 3) {
			System.out.println("오늘은 while문을 배웁니다.");
			++x; 
		}
		
		int y = 0;
		//조건없이 돌릴 떄 for문이 아닌 while문을 사용한다.
		while(true) { //조건이 true이기 때문에 while문이 멈추지 않는다.
			System.out.println("happy");
			++y;
			if(y == 3) {
				break;// 특정 조건에 while멈추게 하기.
			}
		}
		
		//퀴즈 while문을 이용해서 1~10까지 출력해보고, 짝수가 몇개인지 출력하기
		int z = 1;
		int w = 0;
		while(z <= 10) {
			System.out.println("z => " + z);
			++z;
			if(z % 2 == 0) {//짝수인지 판별
				++w;	
			}
		}
			System.out.println("짝수는 총 " + w + "개 입니다.");
		
	    //while문을 이용해서 1~10까지 합을 구하시오
	    int o = 0;	//총합을 구할 변수
	    int a = 1; 
	    while(a <= 10) {
	    	o += a;
	    	++a;
	    }		
	    System.out.println("총합은 : " +o+ "입니다.");
	    
	    /*
	     * 1937년 콜라츠라는 사람에 의해 제기된 이 추측은,
	     * 주어진 수가 1이 될 때까지 다음 작업을 반복하면, 모든 수를 1로 만들수 있다는 추측입니다.
	     * 
	     * 1-1. 입력된 수가 짝수라면 2로 나눕니다.(if-else)
	     * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
	     * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 곱합니다.(이럴때 while문)
	     */
	    Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int r1 = 10;
		while(r1 !=1) {//!은 부정을 의미 (1이 아닐때까지 돌린다는 뜻)
		    if(r1 % 2 == 0) {//1-1. 입력된 수가 짝수라면 2로 나눕니다.
			r1 = r1 / 2;    
		   }else {
			   r1 = (r1 * 3) + 1;//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
		   }
			break;
		}
		/*
		 * 길이나 n이고 "수박수박수박수..."와 같은 패턴을 유지하는 문자열을 만들어주세요.
		 * 예를들어 n이 4라면, "수박수박"이 나옵니다. 3이라면 "수박수"가 나옵니다.
		 */
	    int n = 7;
	    String su = "수";
	    String bak = "박";
	    String result = su +bak;
	    System.out.println(result);
	    
	    //for문을 이용해 풀것
	  		for(int i=1; i<=n; i++) {
	  			result += i % 2 !=0 ? su : bak;
	  			{ 
	  				System.out.println(result);	//수박수박수박수	
	  			}   
	}
	  	/*	
	  	 * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
	  	 * 처음 세균의 마리수 z와 경과한 시간 t가 주어질 때 t시간 후 세균의 시간을 구하시오.
	  	 */
	  		int e = 7;
	  		int t = 15;
	  		//int result2 = 0;//최종 세균 수
	  		for(int i=1; i<=t; i++) {
	  			z = z *2;
	  			//z *= 2; <=이렇게 많이 코딩함.
	  		}
	  		System.out.println("세균 수 : " + z);
	  		
	}
}
