package basic02.datatype;

public class TypeCasting_2 {
	public static void main(String[] args) {
		
		// 자동 타입 변환
		float v1=3; // 업캐스팅
		long v2=5; // 업캐스팅
		double v3=7; // 업캐스팅
		byte v4=9;
		short v5=11;

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println();
		
		// 수동 타입 변환
		byte v6=(byte)128; // 다운캐스팅
		int v7=(int)3.5; // 다운캐스팅
		float v8=(float)7.5; // 다운캐스팅

		System.out.println(v6);
		System.out.println(v7);
		System.out.println(v8);
	}
}
