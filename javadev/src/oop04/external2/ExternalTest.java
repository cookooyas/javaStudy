package oop04.external2;

//class A { // 외부 클래스, public이 없기에 외부에서 접근(import) 불가능
//	int m = 3;
//	int n = 4;
//
//	void print() {
//		System.out.println(m + ", " + n);
//	}
//}

public class ExternalTest {
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}
