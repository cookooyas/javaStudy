package oop19.lambda01;

interface A3 {
	void abc();
}

class B3 {
	void bcd() {
		System.out.println("메서드");
	}
}

public class RefOfInstanceMethod_Type1_1 {
	public static void main(String[] args) {
		A3 a1 = new A3() {
			@Override
			public void abc() {
				B b = new B();
			}
		};
		A3 a2 = () -> {
			B3 b = new B3();
			b.bcd();
		};
		B3 b = new B3();
		A3 a3 = b::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
