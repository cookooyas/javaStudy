package basic03.operator;

// 삼항연산자, Scanner 클래스를 이용해 입력받은 수가 홀수인지 짝수인지 판별하시오.

import java.util.Scanner;

public class OpTest09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
		// 만약에 n%2==1로 삼항연산자를 걸게되면, 음수에 대해서 나머지를 구할 때, 음수가 나와서 그 이외의 값으로 걸러지게 된다.
		// 주의할것!
		sc.close();
	}
}
