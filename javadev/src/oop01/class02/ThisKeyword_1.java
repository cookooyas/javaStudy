package oop01.class02;
class A4 {
	int m;
	int n;

	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;
		this.n = b;
	}

	void work() {
		this.init(2, 3);
	}
}

public class ThisKeyword_1 {
	public static void main(String[] args) {

		A4 a = new A4();
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
	}
}
