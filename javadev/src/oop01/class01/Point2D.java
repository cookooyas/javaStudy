package oop01.class01;

public class Point2D {
	private int x; // 외부에서 직접적으로 변수 x, y에 접근하지 못하도록 설정한다. 캡슐화||정보은닉
	private int y;

	// 만약 생성자가 없다면, 컴파일 단계에서 클래스 이름과 같고 반환형이 없는 기본 생성자를 알아서 만듬.
//	public Point2D() {
//		// 기본생성자
//	}

	// 어차피 생성자는 자동으로 생성됨으로, 생성자를 정의해두면 원하는 값으로 초기화 가능하다.

	// 생성자 오버로딩 가능
	public Point2D() {
		this(1,2); 	// 자기자신(생성자)를 호출한다. 오버로딩 된 함수가 있기에 가능하다.
					// 반드시 첫줄에만 사용가능.
//		System.out.println("Point2D() 수행중");
	}
	
	// 만약 하나이상의 생성자를 정의했다면, 컴파일러는 기본생성자를 만들지 않는다.
	// 따라서 상황에 맞는 코드를 짜줘야한다.
	public Point2D(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
//		System.out.println("Point2D(x,y) 수행중");
	}

	// 단축기 Source-generate getter setter-select all-generate 하면 getter, setter가
	// 만들어짐.
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void print() {
		System.out.println("x = " + getX());
		System.out.println("y = " + getY());
	}
//	public int getX() { // getter
//		return x;
//	}
//
//	public int getY() {
//		return y;
//	}
//
//	public void setX(int x) { // setter
//		this.x = x; // 인스턴스 자기 자신의 변수를 구분하는 this
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
}
