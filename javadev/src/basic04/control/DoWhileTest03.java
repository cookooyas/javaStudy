package basic04.control;

import java.util.Scanner;

/*
 * 숫자야구게임
 * 숫자가 같고 자리수도 일치하면 strike
 * 숫자는 같지만 자리수가 다르면 B
 * 
 */
public class DoWhileTest03 {
	public static void main(String[] args) {
		// 변수 선언
		int c1, c2, c3; // 중복되지 않는 무작위 수(정답)
		int strike = 0; // strike 값
		int ball = 0; // ball 값
		int cnt = 0; // 총 횟수
		int h1, h2, h3; // 입력할 값
		Scanner sc = new Scanner(System.in);

		c1 = (int) (Math.random() * 10);

		do {
			c2 = (int) (Math.random() * 10);
		} while (c1 == c2);

		do {
			c3 = (int) (Math.random() * 10);
		} while (c1 == c3 || c2 == c3);

		do {
			strike = 0;
			ball = 0;
			cnt++;
			
			System.out.println(cnt + "번째 시도입니다.");
			System.out.print("숫자 세개를 띄어쓰기로 순서대로 입력( ex. 1 2 3 ) : ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();

			if (h1 == c1)
				strike++;
			else if (h1 == c2 || h1 == c3)
				ball++;

			if (h2 == c2)
				strike++;
			else if (h2 == c1 || h2 == c3)
				ball++;

			if (h3 == c3)
				strike++;
			else if (h3 == c1 || h3 == c2)
				ball++;

			System.out.println("======================================");
			System.out.println("결과 : " + strike + "스트라이크 " + ball + "볼.");
			System.out.println("======================================");
			
		} while (strike != 3);
		
		System.out.println();
		System.out.println("축하합니다! 정답입니다.");
		System.out.println("정답 : " + c1 + c2 + c3);
		System.out.println("총 도전횟수 : " + cnt + "회");
		
		sc.close();
	}
}
