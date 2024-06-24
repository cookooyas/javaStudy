package basic04.control;

public class DoWhileTest01 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		do {
			sum += i;
			i += 3;
		} while (i <= 1000);
		System.out.println(sum);
	}
}
