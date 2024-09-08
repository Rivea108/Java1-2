
package java240812;

public class 클래스복습2 {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		/**
		 * 왜 에러나는지
		 * 1.파라미터를 받는 생성자만 있기 때문
		 * 2.기본생성자가 업기 때문
		 */
         double result = c.getArea();
         System.out.println("결과는 " + result);
         
         /**
          * 5개의 Circle getArea구하기
          * 0번째 - radius : 1
          * 1번째 - radius : 2
          * 2번째 - radius : 3
          * 3번째 - radius : 4
          * 4번째 - radius : 5
          * 구하고 출력하기
          * 배열하고 반복문이 같이 나왔을땐 for문을 이용할 것. 
          */
         Circle[] circleAtrray = new Circle[5];
         int num = 1; 
         for(int i=0; i<circleAtrray.length; i++) {
        	 circleAtrray[i] = new Circle(num);//풀지도 못했음
        	 num++; //증감연산자
         }
         //출력하는 for문(for-each로 출력해보기)
         //for-each 배열 길이만큼 자동으로 for문이 돈다.
         //배열안에 있는 값이 ':'(기준) 왼쪽으로 대입된다.
         for(Circle x : circleAtrray) {
        	 //리턴이 있는 메소드는 바로 출력이 가능하다.(변수에 대입하여 출력도 가능)
        	 System.out.println("결과 : " + Math.ceil(x.getArea()));
         }
	}

}
