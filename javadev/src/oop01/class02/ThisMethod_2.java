package oop01.class02;

class A8 {
	int m1, m2, m3, m4;

	A8() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	A8(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	A8(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}

	void print() {
		System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
	}
}

class B8 {
	int m1, m2, m3, m4;

	B8() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	B8(int a) {
		this();
		m1 = a;
	}

	B8(int a, int b) {
		this(a);
		m2 = b;
	}

	void print() {
		System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
	}
}

public class ThisMethod_2 {
	public static void main(String[] args) {
		A8 a1 = new A8();
		A8 a2 = new A8(10);
		A8 a3 = new A8(10, 20);

		a1.print();
		a2.print();
		a3.print();
		System.out.println();

		B8 b1 = new B8();
		B8 b2 = new B8(10);
		B8 b3 = new B8(10, 20);
		b1.print();
		b2.print();
		b3.print();
	}
}
