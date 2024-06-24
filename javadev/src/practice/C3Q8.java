package practice;

public class C3Q8 {
	public static void main(String[] args) {
		int a = 3;	// 0011
		a <<= 1;	// 0011 << 1  =  0110
		System.out.println(a); // 6
		a &= 5;		// 0110 & 0101 = 0100
		System.out.println(a); // 4
		a -= 1;		// 0100 - 0001 = 0011 = 3
		System.out.println(a *= 2); // 6
	}
}
