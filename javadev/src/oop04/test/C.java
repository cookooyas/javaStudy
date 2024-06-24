package oop04.test;

import oop05.modifier01.A;

public class C {
	public void print() {
		A a = new A();
		System.out.print(a.a + " ");
//		System.out.print(a.b + " "); // protected 접근 지정자로 지정된 필드는 외부 패키지에서 접근 불가능
//		System.out.print(a.c + " "); // default 접근 지정자로 지정된 필드는 외부 패키지에서 접근 불가능
//		System.out.print(a.d+" "); // private 접근 지정자로 지정된 필드는 접근 불가능
		System.out.println();
	}
}
