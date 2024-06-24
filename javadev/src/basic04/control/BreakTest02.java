package basic04.control;

import java.util.Scanner;

/*
 * 업다운 숫자 맞추기 1~100
 */
public class BreakTest02 {
	public static void main(String[] args) {
		int ans = (int) (Math.random() * 100 + 1);
		int cnt = 0;
		int guess;
		Scanner sc = new Scanner(System.in);
		do {
			cnt++;
			System.out.print(cnt + "트.");
			System.out.print("숫자를 입력하세요 : ");
			guess = sc.nextInt();
			if (guess < ans)
				System.out.println("up!");
			else if (guess > ans)
				System.out.println("down!");
			else {
				System.out.println("정답!");
				System.out.println("답 : " + ans + "\t시도 횟수 : " + cnt);
				break;
			}
		} while (true);
		sc.close();
	}
}
