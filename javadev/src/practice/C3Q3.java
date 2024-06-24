package practice;

public class C3Q3 {
	public static void main(String[] args) {
		System.out.println(5 & 3); // 0101 & 0011 : 0001 -> 1
		System.out.println(5 | 3); // 0101 | 0011 : 0111 -> 7
		System.out.println(5 ^ 3); // 0101 ^ 0011 : 0110 -> 6
		System.out.println(~5); // ~0101 : 1010 -> -(4+1+1) : -6
	}
}
