package inheritance.copy;

class A {
}


class B extends A {
}


class C extends B {
}


class D extends B {

}


public class Typecating {
  public static void main(String[] args) {

    A ac = (A) new C();
    B bc = new C();
    B bb = new B();
    // A a = new bb;
    A aa = new A();
    B b = (B) aa;
    // C c = aa;

    A ab = new B();
    // B b = (B)ab;

    // C c = (C)ab;

  }
}
