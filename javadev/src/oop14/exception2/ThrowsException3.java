package oop14.exception2;

class A2{
	void abc() {
		bcd();
		System.out.println("종료");
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		}catch(InterruptedException| ClassNotFoundException e) {
			// 예외 처리문
		}
	}
}

class B2{
	void abc() {
		try {
			bcd();
			System.out.println("종료");
		}catch(InterruptedException| ClassNotFoundException e) {
			//예외 처리문
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException{
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}

public class ThrowsException3 {
	public static void main(String[] args) {
		A2 a = new A2();
		B2 b = new B2();
		
		a.abc();
		b.abc();
	}
}
