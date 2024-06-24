package basic07.method;

import java.util.Scanner;

public class ScissorsTest {
	public static void main(String[] args) {
		String[] caption = { "가위", "바위", "보" };
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력 : ");
		int you = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1;
			System.out.println("You : " + caption[you - 1]);
			System.out.println("Com : " + caption[com - 1]);
			System.out.println(getMessage(you, com));
			System.out.println(getMessage2(you, com));
		sc.close();
	}

	private static String getMessage2(int you, int com) {
		// TODO Auto-generated method stub
		switch((you-com+3)%3) {
		case 1:
			return "승리";
		case 2:
			return "패배";
		case 0:
			return "무승부";
		default:
			return "오류";
		}
	}
	private static String getMessage(int you, int com) {
		// TODO Auto-generated method stub
		String s="";
		if (you == 1) {
			s = com == 1 ? "무승부" : com == 2 ? "패배" : "승리";
		} else if (you == 2) {
			s = com == 2 ? "무승부" : com == 3 ? "패배" : "승리";
		} else if (you == 3) {
			s = com == 3 ? "무승부" : com == 1 ? "패배" : "승리";
		}
		return s + "입니다.";
	}
	
	
}
