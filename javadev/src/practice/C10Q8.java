package practice;

class A{
	int m =2;
	static int n = 4;
	void a() {
		System.out.println(1);
	}
	static void b() {
		System.out.println("A");
	}
}
class B extends A{
	int m =6;
	static int n = 8;
	public void c() {
		System.out.println(super.m+super.n);
		System.out.println(m+n);
	}
	void a() {
		System.out.println(2);
	}
	static void b() {
		System.out.println("B");
	}
}
class C extends B{
	void a() {
		System.out.println(3);
	}
	static void b() {
		System.out.println("C");
	}
}

public class C10Q8 {
	public static void main(String[] args) {
		A ab = new B();
		B bb = new B();
		
		System.out.println(ab.m+","+ab.n);
		System.out.println(bb.m+","+bb.n);
		
		bb.c();
		ab.a();
		
		A ac = new C();
		ac.a();
		ab.b();
		A.b();
		bb.b();
		ab.b();
		B.b();
		ac.b();
		C.b();
	}
}
