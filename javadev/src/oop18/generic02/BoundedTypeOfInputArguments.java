package oop18.generic02;

class A3{}
class B3 extends A3{}
class C3 extends B3{}
class D3 extends C3{}

class Goods<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}

class Test{
	void method1(Goods<A3> g) {}
	void method2(Goods<?> g) {}
	void method3(Goods<? extends B3> g) {}
	void method4(Goods<? super B3> g) {}
}

public class BoundedTypeOfInputArguments {
	public static void main(String[] args) {
		Test t = new Test();
		
		// case1 : 정의된 클래스(A3)만 이용가능
		t.method1(new Goods<A3>());
//		t.method1(new Goods<B3>());
//		t.method1(new Goods<C3>());
//		t.method1(new Goods<D3>());
		
		// case2 : 어떤 클래스이든 (상위 클래스 이내라면) 이용가능
		t.method2(new Goods<A3>());
		t.method2(new Goods<B3>());
		t.method2(new Goods<C3>());
		t.method2(new Goods<D3>());
		
		// case3 : 본인 + 자식 클래스까지만 이용가능
//		t.method3(new Goods<A3>());
		t.method3(new Goods<B3>());
		t.method3(new Goods<C3>());
		t.method3(new Goods<D3>());
		
		// case4 : 본인 + 부모 클래스까지만 이용가능
		t.method4(new Goods<A3>());
		t.method4(new Goods<B3>());
//		t.method4(new Goods<C3>());
//		t.method4(new Goods<D3>());
	}
}
