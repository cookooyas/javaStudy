package basic04.control;
/*
 * score(if)
 * 0~100사이의 점수를 입력 받아서
 * 90 : A, 80 : B, 70 : C, 60: D, else : F
 */

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		char rank;
		if (score >= 90)
			rank = 'A';
		else if (score >= 80)
			rank = 'B';
		else if (score >= 70)
			rank = 'C';
		else if (score >= 60)
			rank = 'D';
		else
			rank = 'F';

		System.out.println("당신의 성적은 \"" + rank + "\"입니다.");
		sc.close();
	}
}
