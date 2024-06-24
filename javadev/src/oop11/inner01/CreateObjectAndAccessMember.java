package oop11.inner01;

class A {
	public int a=3;
	protected int b =4;
	int c=5;
	private int d=6;
	void abc() {
		System.out.println("A클래스 메서드 abc()");
	}
	// 이너 클래스는 아우터 클래스의 접근지정자와 무관하게
	// 모든 멤버(변수, 함수 등)에 접근이 가능하다
	class B{
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			abc();
		}
	}
}
