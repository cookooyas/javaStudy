package oop11.inner03;

class A3 {
	C1 c = new C1() {
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
	void abc() {
		c.bcd();
	}
}

interface C1 {
	public abstract void bcd();
}

public class AnonymousClass02 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.abc();
	}
}
