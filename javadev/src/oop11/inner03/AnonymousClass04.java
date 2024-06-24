package oop11.inner03;

interface A5{
	public abstract void abc();
}

class C5{
	void cde(A5 a) {
		a.abc();
	}
}

public class AnonymousClass04 {
	public static void main(String[] args) {
		C5 c = new C5();
		A5 a= new A5() {
			public void abc() {
				System.out.println("입력 매개변수 전달");
			}
		};
		c.cde(a);
		
		c.cde(new A5() {
			public void abc() {
				System.out.println("입력 매개변수 전달");
			}
		});
	}
}
