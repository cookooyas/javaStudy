package oop18.generic02;

class A2 {
	<T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}
}

interface MyInterface{
	public abstract void print();
}

class B2{
	public <T extends MyInterface> void method(T t) {
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A2 a = new A2();
		a.method1(5.7);// = a.<Double>method1(5.7);
		
		B2 b = new B2();
		b.method(new MyInterface() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("print()함수 시행");
			}
		});
	}
}
