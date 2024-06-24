package basic04.control;

public class IfControlStatement {
	public static void main(String[] args) {
		int v1 = 5;
		if (v1 > 3)
			System.out.println("실행 1");
		if (v1 < 5)
			System.out.println("실행 2");
		boolean b1 = true;
		boolean b2 = false;
		if (b1)
			System.out.println("실행 3");
		if (b2)
			System.out.println("실행 4");

		int v2 = 5;
		if (v2 > 3)
			System.out.println("실행 5");
		else
			System.out.println("실행 6");

		System.out.println(v2 > 3 ? "실행5" : "실행6");
		System.out.println();

		int v3 = 85;
		if (v3 >= 90)
			System.out.println("A");
		else if (v3 >= 80)
			System.out.println("B");
		else if (v3 >= 70)
			System.out.println("C");
		else if (v3 >= 60)
			System.out.println("D");
		else
			System.out.println("F");

		if (v3 >= 70)
			System.out.println("C");
		else if (v3 >= 80)
			System.out.println("B");
		else if (v3 >= 90)
			System.out.println("A");
		else
			System.out.println("F");

		if (v3 >= 70 && v3 < 90)
			System.out.println("A");
		else
			System.out.println("F");

	}
}
