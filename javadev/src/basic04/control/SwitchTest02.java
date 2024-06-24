package basic04.control;
/*
 * Q. switch-case 문을 이용해 1.남 2.여 3.남 4.여 default:에러 를 출력하시오
 */

import java.util.Scanner;

public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 뒷자리 첫번째 숫자 입력 : ");
		int n = sc.nextInt();

		// 방법은 다양하다.
		// 1. 각 case를 여러번 쓴다(비효율)
		// 2. 	case 1:
		// 		case 3:
		// 		{ 수행 문 }
		// 해당 방법으로 case1, case3인 경우 수행문이 작동한다.
		// 3. case 1, 3: 과 같은 방법으로 case1, case3에 대한 수행을 동시에 처리한다.

		// 방법 a. 입력받은 숫자에 따라 각 case에서 출력문을 수행하는 방법.
		switch (n > 4 ? -1 : n > 0 ? n % 2 : -1) {
		case 0:
			System.out.println("여");
			break;
		case 1:
			System.out.println("남");
			break;
		default:
			System.out.println("에러");
			break;
		}

		// 방법 b. 입력받은 숫자에 따라 각 case에서 반환하는 결과를 변수로 받는 방법

		String str = switch (n) {
		case 1, 3 -> "남자";
		case 2, 4 -> "여자";
		default -> "에러";
		};
		System.out.println(str);

		sc.close();
	}
}
