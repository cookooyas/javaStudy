package oop18.generic01;

class MyClass<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}

public class SingleGenericArgument {
	public static void main(String[] args) {
		MyClass<String> mc1=new MyClass<String>();
		mc1.set("hi");
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		System.out.println(mc2.get());
	}
}
