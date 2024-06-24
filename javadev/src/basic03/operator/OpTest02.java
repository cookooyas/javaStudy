package basic03.operator;

import java.util.Scanner;
// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html
// 클래스에 커서 클릭하고 shift+F2
// **팁: ctrl+shift+알파벳o 를 눌리면 해당 소스코드에 필요한 클래스를 자동으로 임포트 해준다
//window preference java editor save_actions 에서 설정할 수도 있음. 하지만 같은 이름의 모듈 클래스를 불러올때 오류 발생

public class OpTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in은 기본 표준 입력장치 (여기서는 키보드)

		System.out.print("정수 a값 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 b값 입력 : ");
		int b = sc.nextInt();

		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		sc.close(); // 마지막에 다 사용된 자원은 메모리에서 해제 해준다.
	}
}
