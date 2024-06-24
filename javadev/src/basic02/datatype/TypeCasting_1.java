package basic02.datatype;

public class TypeCasting_1 {
	public static void main(String[] args) {
		// 방법 1: 자료형
		int v1=(int)1.6;
		long v2=(long)2;
		float v3=(float)5.8;
		double v4=(double)4.4;

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println();
		
		// 방법 2: L, F
		long v5=10l;
		float v6=1.4f;

		System.out.println(v5);
		System.out.println(v6);
				
	}
}
