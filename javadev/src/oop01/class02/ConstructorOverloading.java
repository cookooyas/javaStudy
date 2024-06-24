package oop01.class02;

class A9 {
	A9() {
		System.out.println("1st");
	}

	A9(int a) {
		System.out.println("2nd");
	}

	A9(int a, int b) {
		System.out.println("3rd");
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		A9 a1 = new A9();
		A9 a2 = new A9(3);
		A9 a3 = new A9(3, 5);
	}
}
