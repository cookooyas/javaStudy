package oop18.generic02;

class A{
	public <T> void method(T t) {
//		System.out.println(t.length()); // String클래스 내부 메서드인 length는 이용 불가능!!
		System.out.println(t.equals("hi"));
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.method("안녕");
	}
}
