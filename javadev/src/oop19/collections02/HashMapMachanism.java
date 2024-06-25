package oop19.collections02;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class A {
	int d;

	public A(int d) {
		this.d = d;
	}
}

class B {
	int d;

	public B(int d) {
		this.d = d;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof B) {
			this.d = ((B) obj).d;
			return true;
		}
		return false;
	}
}

class C {
	int d;

	public C(int d) {
		this.d = d;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof C) {
			this.d = ((C) obj).d;
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(d);
	}
}

public class HashMapMachanism {
	public static void main(String[] args) {
		Map<A, String> hm1 = new HashMap<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode() + " : " + a2.hashCode());
		hm1.put(a1, "first");
		hm1.put(a2, "second");

		System.out.println(hm1.size());
		System.out.println();

		Map<B, String> hm2 = new HashMap<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode() + " : " + b2.hashCode());
		hm2.put(b1, "first");
		hm2.put(b2, "second");

		System.out.println(hm2.size());
		System.out.println();

		Map<C, String> hm3 = new HashMap<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + " : " + c2.hashCode());
		hm3.put(c1, "first");
		hm3.put(c2, "second");

		System.out.println(hm3.size());
		System.out.println();

	}
}
