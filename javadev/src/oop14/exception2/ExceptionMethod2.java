package oop14.exception2;

class A4 {
	void abc() throws NumberFormatException {
		bcd();
	}

	void bcd() throws NumberFormatException {
		cde();
	}

	void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");
	}
}

public class ExceptionMethod2 {
	public static void main(String[] args) {
		A4 a = new A4();
		try {
			a.abc();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}

// 실행 결과 : 첫줄부터 순서대로 확인해보면 parseInt에서 예외가 발생했고, cde->bcd->abc 순서로 예외를 throw함을 알 수 있다.
/*

java.lang.NumberFormatException: For input string: "10A"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:662)
	at java.base/java.lang.Integer.parseInt(Integer.java:778)
	at oop14.exception2.A4.cde(ExceptionMethod2.java:13)
	at oop14.exception2.A4.bcd(ExceptionMethod2.java:9)
	at oop14.exception2.A4.abc(ExceptionMethod2.java:5)
	at oop14.exception2.ExceptionMethod2.main(ExceptionMethod2.java:21)

*/