package oop11.inner02;

class A1{
	int a=3;
	static int b=4;
	void m1() {
		System.out.println("instance method");
	}
	static void m2() {
		System.out.println("static method");
	}
	
	static class B{
		void bcd() {
			//System.out.println(a); // a는 아우터 클래스의 정적 멤버가 아님으로 사용할 수 없다.
			System.out.println(b);
			//m1() // m1은 아우터 클래스의 정적 멤버가 아님으로 사용할 수 없다.
			m2();
		}
	}
}
public class CreateObjectAndAccessMember {
	public static void main(String[] args) {
		A1.B b=new A1.B(); // 클래스 A1의 생성과는 무관하게 바로 정적 이너 클래스의 객체를 생성할 수 있다.
		b.bcd();
//		A1.B.bcd(); // 객체는 생성해야한다. -> 이러한 이유로 느슨한 '결합관계'라고도 한다.
	}
}
