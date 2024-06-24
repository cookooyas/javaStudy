package basic04.control;

public class BreakControlKeyword {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;
		}
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		POS1: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 2) {
					break POS1; // 브레이크에 레이블을 명시해 탈출하는 방법
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 2) {
					i = 100; // i를 강제적으로 수정해 다음 상위 루프가 돌지 못해 탈출하는 방법
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}
