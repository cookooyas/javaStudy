package oop01.class02;

import java.util.Scanner;

public class CalculateArea {
	public static void main(String[] args) {
		String[] types = { "원", "사각형", "삼각형" };
		int area = -1;
		int type;
		Scanner sc = new Scanner(System.in);

		System.out.print("넓이를 계산할 도형은? 1. 원 2. 사각형 3. 삼각형 > ");
		type = sc.nextInt() - 1;

		switch (type) {
		case 0:
			area = circleArea(sc);
			break;
		case 1:
			area = squareArea(sc);
			break;
		case 2:
			area = triangleArea(sc);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 실행해 주세요.");
			break;
		}
		if (area >= 0)
			System.out.print(types[type] + "의 넓이는 " + area + "입니다.");
		sc.close();

	}

	private static int triangleArea(Scanner sc) {
		System.out.print("밑변 길이를 입력하세요 > ");
		int b = sc.nextInt();
		System.out.print("높이 길이를 입력하세요 > ");
		int h = sc.nextInt();
		return (b * h / 2);

	}

	private static int squareArea(Scanner sc) {
		System.out.print("밑변 길이를 입력하세요 > ");
		int b = sc.nextInt();
		System.out.print("높이 길이를 입력하세요 > ");
		int h = sc.nextInt();
		return (b * h);

	}

	private static int circleArea(Scanner sc) {
		System.out.print("반지름을 입력하세요 > ");
		int r = sc.nextInt();
		return (int) (r * r * 3.14);
	}
}
