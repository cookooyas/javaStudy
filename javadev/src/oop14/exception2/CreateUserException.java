package oop14.exception2;

class MyException extends Exception {
	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}
}

class MyRTException extends RuntimeException {
	public MyRTException() {
		super();
	}

	public MyRTException(String message) {
		super(message);
	}
}

class A3 {
	MyException me1 = new MyException();
	MyException me2 = new MyException("MyException");

	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("MyRTException");

	void abc_1(int num) {
		try {
			if (num > 70)
				System.out.println("정상작동");
			else
				throw me1;
		} catch (MyException e) {
			System.out.println("예외처리1");
		}
	}

	void bcd_1() {
		abc_1(65);
	}

	void abc_2(int num) throws MyException {

		if (num > 70)
			System.out.println("정상작동");
		else
			throw me1;
	}

	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("예외처리2");
		}

	}
}

public class CreateUserException {
	public static void main(String[] args) {
		A3 a = new A3();
		a.bcd_1();
		a.bcd_2();
	}
}
