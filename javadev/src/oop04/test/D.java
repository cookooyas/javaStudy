package oop04.test;

import oop05.modifier01.A;

public class D extends A{
	public void print() {
		System.out.print(a + " ");
		System.out.print(b + " "); // protected 접근 지정자로 지정된 필드는 외부 패키지의 자식 클래스에서 접근 가능
//		System.out.print(c + " "); // default 접근 지정자로 지정된 필드는 외부 패키지의 자식 클래스에서도 접근 불가능
//		System.out.print(d+" "); // private 접근 지정자로 지정된 필드는 외부 패키지의 자식 클래스에서도 접근 불가능
		System.out.println();
	}
}
