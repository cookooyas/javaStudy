package oop11.inner03;

class A{
	C c = new B();
	void abc() {
		c.bcd();
	}
	class B implements C{
		public void bcd() {
			System.out.println("이너 클래스");
		}
	}
}

interface C{
	public abstract void bcd();
}

public class AnonymousClass01 {
public static void main(String[] args) {
	A a = new A();
	a.abc();
}
}
