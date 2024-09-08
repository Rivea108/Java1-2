package java240809;


/*
 * 인터페이스 : 자바는 다중상속이 불가능하기에, '인터페이스'라는 개념을 통해 다중상속을 구현함.
 * 인터페이스에서는 필드변수, 메소드 정의만 가능하다.
 * 인터페이스에 있는 메소드는 무조건 'public'이어야만 한다.
 */
public interface 계산기인터페이스 {

	public int 곱하기(int x, int y);//중괄호를 입력할수 없다.
	public int 뻬기(int x, int y);
	}

