package oop02.modifier;

public class Point2D {	// 자바에서 최상위 부모 클래스는 Object이다. 이는 명시하지 않더라도 컴파일 단계에서 자동으로 정의된다.
//	private int x; // private 임으로 같은 클래스 내에서 접근 가능함.
//	int x; // 아무것도 작성하지 않았다면 이는 default 제한자를 두고 있는 것이다. 같은 클래스 내에서 접근 가능함
//	protected int x; // protected는 같은 클래스 내에서 접근 가능함.
	public int x; // public은 같은 클래스 내에서 접근 가능함.
	int y;
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	// source-generate toString
	
}
