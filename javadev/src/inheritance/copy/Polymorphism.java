package inheritance.copy;

class A1 {
}


class B1 extends A1 {
}


class C1 extends B1 {
}


class D1 extends B1 {
}


public class Polymorphism {

  public static void main(String[] args) {
    A1 a1 = new A1();
    A1 a2 = new B1();
    A1 a3 = new C1();
    A1 a4 = new D1();

    // B b1 = new A();
    B1 b2 = new B1();
    B1 b3 = new C1();
    B1 b4 = new D1();

    // C c1 = new A();
    // C c2 = new B();
    C1 c3 = new C1();
    // C c4 = new D();


    // D d1 = new A();
    // D d2 = new B();
    // D d3 = new C();
    D1 d4 = new D1();
  }
}
