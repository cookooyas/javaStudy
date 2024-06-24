package basic03.operator;

public class OpTest04 {
	public static void main(String[] args) {
		// 산술연산자(+-*/%)가 논리연산자보다 항상 먼저 계산된다.
		System.out.println(5 * 10 >= 20); // true
		System.out.println(50 >= 100 - 60); // true
	}
}
