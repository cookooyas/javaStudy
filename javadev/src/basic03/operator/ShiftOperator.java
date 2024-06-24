package basic03.operator;

public class ShiftOperator {
	public static void main(String[] args) {
		// 산술 시프트
		// @ <<
		System.out.println(3<<1);	// 0000000000000011 => 0000000000000110 = 6
		System.out.println(-3<<1);	// 1111111111111101 => 1111111111111010 = -6
		System.out.println(3<<2);	// 0000000000000011 => 0000000000001100 = 12
		System.out.println(-3<<2);	// 1111111111111101 => 1111111111110100 = -12
		System.out.println();
		
		// @ >>
		System.out.println(5>>1);
		System.out.println(-5>>1);
		System.out.println(5>>2);
		System.out.println(-5>>2);
		System.out.println();
		
		// 논리시프트 >>>
		System.out.println(3>>>1);
		System.out.println(-3>>>31);
	}
}
