package basic04.control;

public class DoWhileConstrolStatement {
	public static void main(String[] args) {
		int a;
		a = 0;
		while (a < 0) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 0);
		System.out.println();
		a = 0;
		while (a < 1) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 1);
		System.out.println();
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 10);
	}
}
