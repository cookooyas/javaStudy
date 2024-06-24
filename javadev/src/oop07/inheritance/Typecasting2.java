package oop07.inheritance;

class A2 {
	int m =3;
	void abc() {
		System.out.println("A클래스");
	}
}

class B2 extends A2{
	int n =4;
	void bcd() {
		System.out.println("B클래스");
	}
}

public class Typecasting2 {
	public static void main(String[] args) {
		A2 aa = new A2();
		System.out.println(aa.m);
		aa.abc();
		B2 bb = new B2();
		System.out.println(bb.n);
		System.out.println(bb.m);
		
		bb.abc();
		bb.bcd();
		
		A2 ab = new B2();
		System.out.println(ab.m);
		ab.abc();
		
	}
}
