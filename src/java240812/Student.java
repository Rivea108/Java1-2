package java240812;

class Departmant{ //학부(과)
	String dname; //과이름
	
    public void 전과신청(String dname) {
    	this.dname = dname;
    }
	
}
//extends : 상속(슈퍼클래스 기능을 서브클래스가 사용할수 있음)
public class Student extends Departmant {

	String name; //학생이름
	String grade; //성적
	int year; //학년
	
	@Override //부모클래스 메소드 '재정의'
	//무조건 재정의된 메소드가 실행됨
	public void 전과신청(String dname) {
		super.dname = dname; //super : 부모클래스에 의미
		this.grade = "A+";
	}
	
	public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.grade = "B+";
        s1.year = 3;
        s1.dname = "기계과";
        /*
         * Student클래스에는 dname이라는 필드변수가 없는데,
         * 부모클래스를 상속받았기에 사용가능하다.
         */
        System.out.println("학생이름 : " + s1.name+", "+"과 : "+s1.dname + ", 학점 : "+s1.grade);
        s1.전과신청("간호학과");//부모클래스에 있는 메소드 호출
        System.out.println("학생이름 : " + s1.name+", "+"과 : "+s1.dname + ", 학점 : "+s1.grade);
        
        //퀴즈. 학생이름 : 김길동, 과 : 수학교육과, 학점 : C0인 학생을 출력 후
        //'컴퓨터공학' 으로 전과신청하려고 합니다. 전과신청 후 이름,과.학점을 출력해주시오(정답 스스로맞추기)
        
        Student s2 = new Student();//내가해봐야함 정답을 맞춰봐야함
        s2.name = "김길동";
        s2.grade = "C0";
        s2.dname = "수학교육과";
        
        
        
        
	}

}
