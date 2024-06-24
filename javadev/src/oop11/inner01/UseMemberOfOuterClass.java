package oop11.inner01;
class A1 {
	int a=3;
	int b =4;
	void abc() {
		System.out.println("A클래스(아우터클래스) 메서드 abc()");
	}
	// 이너 클래스는 아우터 클래스의 접근지정자와 무관하게
	// 모든 멤버(변수, 함수 등)에 접근이 가능하다
	class B1{
		int a=5;
		int b=6;
		void abc() {
			System.out.println("B클래스(이너클래스) 메서드 abc()");
		}
		void innerFunc() {
			System.out.println(a);
			System.out.println(b);
			abc();
		}
		void outerFunc() {
			System.out.println(A1.this.a);
			System.out.println(A1.this.b);
			A1.this.abc();
		}
	}
}
public class UseMemberOfOuterClass {
	public static void main(String[] args) {
		A1 a = new A1();
		A1.B1 b= a.new B1();
		
		b.innerFunc();
		b.outerFunc();
	}
}
