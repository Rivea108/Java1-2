package java240812;

class Box {

	private int width; // 박스의 너비
	private int height; // 박스의 높이
	private String fillStr; // 박스를 그리는데 사용하는 문자

	public Box() {// 파라미터가 없는 생성자를 '기본생성자'라 함
		/** 기본값 세팅 */
		this.width = 10;
		this.height = 1;
		this.fillStr = "*";
	}

	// width와 height, fillStr을 피라미터로 받는 생성자를 아래 선언하시오.
	// 파라미터를 필드변수에 대입하시오.
	public Box(int width, int height, String fillStr) {
		this.width = width;
		this.height = height;
		this.fillStr = fillStr;
	}

	public void draw() {// 박스 그리는 메소드
		// void이기 때문에 여기서 출력문을 사용할 예정
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				System.out.println(this.fillStr);
			}
			System.out.println("");
		}
	}

}