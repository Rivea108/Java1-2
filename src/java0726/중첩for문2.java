
package java0726;

public class 중첩for문2 {

	public static void main(String[] args) {
		/*
		 * 퀴즈. 2단부터~9단까지 했는데, 반대로 9단부터 2단까지 2중 for문을 이용해서 만들어보세요.
		 */
		
		for(int i=0; i<=9; i++) {
        	for(int j=0; j<=9; j++) {
        		System.out.println(i + "*" + j + "="+ i*j);
        	}
        	   System.out.println();//공백 용도
        }
        
		for(int i=9; i>=2; i--) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "="+ i*j);
	}
        	   System.out.println();//공백 용도
	}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	

		//별찍기
		for(int i=1; i<=5; i++) {
		  
			for(int j=0; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int m=1; m<=i; m++) {//별
				System.out.print("*");
			}
			System.out.println();
					}
		
		 
		
		 
		    for(int i=5; i>=1; i--) {
		  
		         for(int j=1; j<=i; j++) {
		            System.out.print("*");
		         }
		         System.out.println();
		      }

}
}