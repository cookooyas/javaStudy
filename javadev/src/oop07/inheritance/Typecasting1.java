package oop07.inheritance;

class A1 {
}

class B1 extends A1 {
}

class C1 extends B1 {
}

class D1 extends B1 {
}

public class Typecasting1 {
	public static void main(String[] args) {
		A1 ac = (A1) new C1();
		B1 bc = (B1) new C1();
		B1 bb = new B1();
		A1 a = (A1) bb;

		A1 aa = new A1();

		A1 ab = new B1();

		B1 b = (B1) ab;

		B1 bd = new D1();
		D1 d = (D1) bd;
		A1 ad = new D1();
		B1 b1 = (B1) ad;
		D1 d1 = (D1) ad;
	}
}
