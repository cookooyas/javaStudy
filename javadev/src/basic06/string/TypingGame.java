package basic06.string;
/*
 * 콘솔에 시작어 : Game START~~~~!
 * 제시어가 나오게 되면 똑같이 단어를 입력하면 통과된다.
 * 다 맞추면 게임 끝. 시간을 측정한다.
 * 
 */

import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] keywords = { "oop", "primitive type", "for", "while", "Scanner", "constructor", "instance", "class",
				"inheritance", "information hiding" };

		int[] item = new int[5];
		for (int i = 0; i < item.length; i++) {
			item[i] = (int) (Math.random() * keywords.length);
			for (int j = 0; j < i; j++) {
				if (item[i] == item[j]) {
					i--; // 만약 아이템 내부에 이미 해당 값이 존재한다면 i를 1 빼줘서 한번더 글자를 추출케 한다.
					break;
				}
			}
		}

		System.out.println("Game START!");

		long startTime = System.currentTimeMillis(); // 시간 측정 시작
		for (int i = 0; i < item.length; i++) {
			System.out.print(keywords[item[i]] + "☞");
			String input = sc.nextLine();
			if (!input.equals(keywords[item[i]])) {
				System.out.println("miss!");
				i--; // 틀렸을 경우 i를 1 빼줘서 다시 같은 루프(같은 키워드)를 출력하게 되는 원리.
			}
		}
		long endTime = System.currentTimeMillis(); // 시간 측정 끝

		System.out.println("총 소요 시간은 " + (endTime - startTime) / 1000.0 + "초 입니다.");

		sc.close();
	}
}
