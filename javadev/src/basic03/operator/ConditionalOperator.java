package basic03.operator;

public class ConditionalOperator {
	public static void main(String[] args) {
		int v1 = (3 > 5) ? 6 : 9;
		System.out.println(v1);

		int v2 = (5 > 3) ? 10 : 20;
		System.out.println(v2);

		int v3 = 3;
		System.out.println((v3 % 2 == 0) ? "짝수" : "홀수");

		if (v3 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}
}
