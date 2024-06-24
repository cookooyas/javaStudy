package basic04.control;

public class BreakTest01 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (true) { // 무한 루프
			sum += i;
			if (sum >= 100)
				break;
			i++;
		}
		System.out.print("1 부터 "+i+" 까지의 정수 합계는 ");
		System.out.println(sum);
	}
}
