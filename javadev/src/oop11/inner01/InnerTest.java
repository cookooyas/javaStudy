package oop11.inner01;

public class InnerTest {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); // a 객체에서 내부적인 참조 가능
		b.bcd();
	}
}
