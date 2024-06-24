package basic03.operator;

public class ArithmeticOperator {
	public static void main(String[] args) {
		// 산술연산자
		System.out.println(2 + 3);
		System.out.println(8 - 5);
		System.out.println(7 * 2);
		System.out.println(7 / 2);
		System.out.println(8 % 5);
		System.out.println();

		// 증감연산자_1
		int v1 = 3;
		v1++;
		System.out.println(v1);

		int v2 = 3;
		++v2;
		System.out.println(v2);
		System.out.println();

		// 증감연산자_2
		int v3 = 3;
		int v4 = v3++;
		System.out.println(v3);
		System.out.println(v4);
		System.out.println();

		int v5 = 3;
		int v6 = ++v5;
		System.out.println(v5);
		System.out.println(v6);
		System.out.println();

		// 증감연산자_3
		int v7 = 3;
		int v8 = 4;
		int v9 = 2 + v7-- + ++v8;
		System.out.println(v7);
		System.out.println(v8);
		System.out.println(v9);

	}
}
