package basic02.datatype;

public class PrimaryDataTypes_2 {
	public static void main(String[] args) {
		// 문자 저장방법
		char v1 = 'A';
		char v2 = '가';
		char v3 = '3';

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println();

		// 정수로 저장하는 방법
		char v4 = 65;
		char v5 = 0xac00;
		char v6 = 51;

		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println();

		// 유니코드로 직접 입력
		char v7 = '\u0041';
		char v8 = '\uac00';
		char v9 = '\u0033';

		System.out.println(v7);
		System.out.println(v8);
		System.out.println(v9);
	}
}
