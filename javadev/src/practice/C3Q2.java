package practice;

public class C3Q2 {
	public static void main(String[] args) {
		int a = 5;
		int b = a++; // b=a, a+=1
		System.out.println(a); // 6
		System.out.println(b); // 5
		System.out.println(++a); // 7
		System.out.println(++b); // 6
		System.out.println(a++ + --b); // b-=1 -> 7+5 : 12 -> a+=1
		System.out.println(a + b); // 8+5 : 13 
	}
}
