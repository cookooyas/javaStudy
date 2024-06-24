package basic04.control;

public class OverlappedControlStatement {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 3;
		if (v1 > 5) {
			if (v2 > 2) {
				System.out.println("실행1");
			} else
				System.out.println("실행2");
		} else
			System.out.println("실행3");

		System.out.println();

		int v3 = 2;
		switch (v3) {
		case 1:
			for (int k = 0; k < 10; k++) {
				System.out.print(k + " ");
			}
			break;

		case 2:
			for (int k = 10; k > 0; k--)
				System.out.print(k + " ");
			break;

		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + " " + j);
				if (i == j)
					System.out.println("i=j");
			}
		}
	}
}
