package basic04.control;

/*
 * Q. 1~1000까지의 수 중 3의 배수들의 합계 for문을 이용
 */
public class ForTest03 {
	public static void main(String[] args) {
		int sum = 0;
		// 방법 1
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);

		// 방법 2
		sum = 0;
		for (int i = 0; i <= 1000; i += 3) {
			sum += i;
		}
		System.out.println(sum);
	}
}
