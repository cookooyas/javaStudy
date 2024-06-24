package oop06.static01;

class AA {
	void abc() {
		System.out.println("인스턴스");
	}

	static void bcd() {
		System.out.println("스태틱");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		AA a1 = new AA();
		a1.abc();
		AA.bcd();

		AA a2 = new AA();
		a2.bcd();
	}
}
