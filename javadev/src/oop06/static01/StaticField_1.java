package oop06.static01;
class A{
	int m =3;
	static int n=4;
}
public class StaticField_1 {
public static void main(String[] args) {
	A a1 = new A();
	System.out.println(a1.m);
	System.out.println(A.n);
	
	A a2 = new A();
	System.out.println(a2.n);
}
}
