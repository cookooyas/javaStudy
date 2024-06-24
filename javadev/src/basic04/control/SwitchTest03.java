package basic04.control;

import java.util.Scanner;

// IfTest02의 내용을 switch-case로 변환
public class SwitchTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("니 점수를 입력하세요 : ");
		int n = sc.nextInt();
		char s = switch (n > 100 ? -1 : n < 0 ? -1 : n / 10) {
		case 9, 10 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		case -1 -> '?';
		default -> 'F';
		};
		System.out.println("니 성적은 \"" + s + "\"입니다.");
		sc.close();
	}
}
