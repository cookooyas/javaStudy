package oop18.generic03;

class Parent2 {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent2 {

}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.<Integer>print(10);
		p.print(20);

		Child c = new Child();
		c.<Double>print(2.1);
		c.print(400.2);
	}
}
