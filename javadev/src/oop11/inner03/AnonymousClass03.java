package oop11.inner03;

interface A4{
	public abstract void abc();
}

class B4 implements A4{
	public void abc() {
		System.out.println("입력 매개변수 전달");
	}
}

class C4{
	void cde(A4 a) {
		a.abc();
	}
}

public class AnonymousClass03 {
public static void main(String[] args) {
	C4 c = new C4();
	A4 a = new B4();
	
	c.cde(a);
	c.cde(new B4());
}
}
