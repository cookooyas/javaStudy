package basic02.datatype;

public class FloatVsDouble {
	public static void main(String[] args) {
		// float의 정밀도
		float f1 = 1.0000001f;
		System.out.println(f1); // 1.0000001
		float f2 = 1.000_000_01f; // 소수점이 길어 가독성이 떨어질 경우 언더바(_)를 이용하여 끊어읽을 수 있다.
		System.out.println(f2); // 1.0

		// double의 정밀도
		double d1 = 1.000_000_000_000_001;
		System.out.println(d1);// 1.000000000000001
		double d2 = 1.000_000_000_000_0001;
		System.out.println(d2);// 1.0
	}
}
