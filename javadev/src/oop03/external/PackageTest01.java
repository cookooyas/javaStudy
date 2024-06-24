package oop03.external;

public class PackageTest01 {
	public static void main(String[] args) {
		basic.A a = new basic.A(); // 임포트 문 없이 클래스를 사용하는 방법

		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
