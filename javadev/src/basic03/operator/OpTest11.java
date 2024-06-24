package basic03.operator;

public class OpTest11 {
	public static void main(String[] args) {
		/*
		 * Q1. 난수 발생 : 4 ~ 15사이의 정수 발생 
		 * Q2. 난수 발생 : 600 ~ 2300 사이의 정수 발생
		 */

		// Q1
		System.out.println(15 - (int) (Math.random() * 12));

		// Q2
		System.out.println((23 - (int) (Math.random() * 18)) * 100);
	}
}
