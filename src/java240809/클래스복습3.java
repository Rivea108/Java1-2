package java240809;

class 갈마동도서관{
   String 주소;
}

class 둔산동도서관{
   String 주소;
}
//자바는 다중상속을 지원하지 않습니다.
//C++ 다중상속 가능.
//즉, 둔산동 도서관만 book을 가질 수 있게된다.
//인터페이스라는 개념을 이용해서 마치 '다중상속'을 가능하게 한다.
class Book extends 둔산동도서관 implements 탄방동도서관{
   String title;
   String author;
   public Book() { //기본생성자
      
   }
   public Book(String title, String author) {
      this.title = title; //this는 필드변수를 가르킨다.
      this.author = author;
      System.out.println("제목 : "+this.title +"저자 : "+this.author);
   }
}

public class 클래스복습3 {
   
   public static void main(String[] args) {
      
      Book b = new Book("돈의속성","김승호");
      b.주소 = "둔산동 *** ***";//오류나는거 맞음
   }
}
