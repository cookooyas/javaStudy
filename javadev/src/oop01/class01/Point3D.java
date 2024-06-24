package oop01.class01;

public class Point3D extends Point2D {
	private int z; // getter, setter 생각하기

	// 자식 클래스의 기본생성자(또는 생성자)는 반드시 부모 클래스의 호출(및 생성)부터 시작한 후 진행되어야 한다.

	public Point3D() {
//		super(); // 기본생성자에서도 호출된다. super(); 만약 없애도 생성함
//		System.out.println("Point3D() 수행중");

		this(10, 20, 30);
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
//		System.out.println("Point3D(x,y,z) 수행중");
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	// 오버라이딩 (어노테이션을 이용해 부모클래스 상속을 명시함. 개발의 편의 / 함수명 알림
	@Override
	public void print() {
		super.print(); // 부모클래스의 기존 print 매서드를 호출하는 것. 부모 클래스 접근시 super 키워드 사용
		System.out.println("z = " + getZ());
	}
}