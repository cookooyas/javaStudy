package oop01.class01;

public class ATest {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m);
		a.m = 5;
		System.out.println(a.m);
		a.print();
	}
}
