package basic03.operator;

import java.util.Scanner;

public class OpTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 뒷자리 첫번째 수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println(a == 1 || a == 3 ? "man" : a == 2 || a == 4 ? "woman" : "error");
		sc.close();
	}
}
