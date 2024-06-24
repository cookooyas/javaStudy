package oop14.exception2;

// 하위 메서드에 직접 예외를 처리할 때
class A1 {
	void abc() {
		bcd();
	}

	private void bcd() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			System.out.println("호출 받은 함수의 내부에서 직접 예외처리");
		} catch (InterruptedException e) {

		}
	}
}

// 예외를 호출 메서드로 전가할 때
class B1 {
	void abc() {
		try {
			bcd();
			System.out.println("호출한 함수에게 예외 처리 책임 전가됨");
		} catch (InterruptedException e) {

		}
	}

	private void bcd() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
	}
}

public class ThrowsException1 {
	public static void main(String[] args) {
		A1 a = new A1();
		B1 b = new B1();

		a.abc();
		b.abc();
	}
}
