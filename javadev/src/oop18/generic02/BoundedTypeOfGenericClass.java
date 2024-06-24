package oop18.generic02;

class A1 {
}

class B1 extends A1 {
}

class C1 extends B1 {
}
// 상속관계도: A <- B <- C 

class D1<T extends B1> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class BoundedTypeOfGenericClass {
	public static void main(String[] args) {
		//	D1<A1> d1 = new D1<>();
		D1<B1> d2 = new D1<>();
		D1<C1> d3 = new D1<>();
		D1 d4 = new D1(); // 이 코드는 D1<B1> d4 = new D1<>();와 같다.

		d2.set(new B1());
		d2.set(new C1());

		// d3.set(new B1)); // d3 객체는 생성시 제네릭 타입 C를 지정했음으로 불가능한 호출이다.
		d4.set(new C1());
	}
}
