package oop13.exception1;

class A7 {
}

class B extends A7 {
}

public class UncheckedException {
	public static void main(String[] args) {
		// 아래의 예외들은 작성시에는 문제가 없다.
		// 하지만 실행 단계에서 문제가 발생한다.

		// 1. Arithmetic Exception
		System.out.println(3 / 0);

		// 2. Class Cast Exception
		A7 a = new A7();
		B b = (B) a;

		// 3. Array IndexOf Bounds Exception
		int[] arr = { 1, 2, 3 };
		System.out.println(arr[3]);

		// 4. Number Format Exception
		int num = Integer.parseInt("10!");

		// 5. Null Pointer Exception
		String str = null;
		System.out.println(str.charAt(2));
	}
}
