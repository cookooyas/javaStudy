package basic02.datatype;

public class OperationBetweenDataType {
	public static void main(String[] args) {
		int v1 = 3 + 5;
		int v2 = 8 / 5;
		float v3 = 3.0f + 4.0f;
		double v4 = 8.0 + 5.0;
		byte data1 = 3;
		byte data2 = 5;
		// byte v5 = data1 + data2; // 해당 연산에서 byte+byte=int임으로 타입 오류
		int v5 = data1 + data2;

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println();

		// int v6=5+3.5; // 해당 연산은 타입 오류
		double v6 = 5 + 3.5;
		int v7 = 5 + (int) 3.5;
		double v8 = 5 / 2.0;
		byte data3 = 3;
		short data4 = 5;
		int v9 = data3 + data4;
		double v10 = data3 + data4;

		System.out.println(v6);
		System.out.println(v7);
		System.out.println(v8);
		System.out.println(v9);
		System.out.println(v10);
	}
}
