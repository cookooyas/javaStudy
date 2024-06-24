package basic04.control;

import java.util.Scanner;

/*
 * Q. 향상된 switch case문으로 계절 출력.
 * 출력 : 현재월을 입력하세요 : (입력받음) -> 11,12,1 겨울 2,3,4 봄 5,6,7 여름 8,9,10 가을
 */

public class SwitchTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇월임? : ");
		int n = sc.nextInt();
		System.out.println();
		String str = switch (n == 1 ? (n + 10) / 3 : (n - 2) / 3) {
		case 0 -> "봄";
		case 1 -> "여름";
		case 2 -> "가을";
		case 3 -> "겨울";
		default -> "에러";
		};
		System.out.println("현재 계절은 " + str + "입니다.");
		sc.close();
	}
}
