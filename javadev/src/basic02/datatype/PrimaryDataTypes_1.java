package basic02.datatype;

public class PrimaryDataTypes_1 {
	public static void main(String[] args) {
		// boolean
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();

		// 정수
		byte v1 = 10;
		short v2 = -10;
		int v3 = 100;
		long v4 = -100L; // 자동형변환 가능
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println();

		// 실수
		float v5 = 1.2F;
		double v6 = -1.5;
		double v7 = 5; // 자동형변환 가능
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);

	}
}
