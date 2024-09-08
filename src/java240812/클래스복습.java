package java240812;

class Book{//클래스 (필드변수, 생성자, 메소드) => 캡슐화
	/** 필드변수*/
	String title;
	String author;
	
	public Book(String t) {//생성자
		this.title = t;
		this.author ="작가미상";
	}
	
	public Book(String t, String a) { //생성자,이름은 동일한테 파라미터값이 다름. => 오버로딩
		this.title = t;
		this.author = a;
	}


	public void printBook() {//메소드
        System.out.println("title : " + this.title);
	    System.out.println("author : " + this.author);
    }
}
public class 클래스복습 {

	public static void main(String[] args) {
		Book book1 = new Book("어린왕자", "생텍쥐페리"); //Book클래스 호출
        //new : 클래스를 '객체화' or '인스턴스화' 하는 키워드
		//Book("어린왕자", "생텍쥐페리") : 생성자 호출
		//생성자는 메소드이지만, 객체화 할떼 무조건 처음 호출하는 메소드이다.
		//처음엔, 기본생성자가 존재하여서 new Book();이 가능했다
		
		Book book2 = new Book("춘향전");
		
		book1.printBook(); //생성자로 넣은 값이 출력된다.
		book2.printBook();
		
		
		/** 객체 배열*/
		Book[] bookarray = new Book[2]; //Book 객체를 담을 수 있는 배열 선언
		bookarray[0] = book1; //0번째 인덱스에 book1 저장.	
		bookarray[1] = book2; //1번째 인덱스에 book2 저장.	
		
		bookarray[0].printBook(); //0번째 인덱스에 있는 book1 정보 출력.	
		bookarray[1].printBook(); //0번째 인덱스에 있는 book1 정보 출력.
		
		
		}
    
}
