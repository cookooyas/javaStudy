package basic03.operator;

public class LogicalOperator {
	public static void main(String[] args) {
		// 논리 연산자
		// @AND(&&)
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true && (5 < 3));
		System.out.println((5 <= 5) && (7 > 2));
		System.out.println();

		// @OR(||)
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(true || (5 < 3));
		System.out.println((5 <= 5) || (7 > 2));
		System.out.println();

		// @NOT(!)
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5 < 3));
		System.out.println((5 <= 5) || !(7 > 2));

		// 비트 연산자로 논리 연산 수행
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(true | (5 < 3));
		System.out.println((5 <= 5) | (7 > 2));
		System.out.println();

		// @쇼트 서킷 사용 여부(논리연산자는 O, 비트연산자는 X)
		// 쇼트 서킷을 사용하게 되면 비교할 여지가 없는 경우,
		// 첫 항에서 이미 true/false 가 결정되는 경우에 뒷 항은 읽지도 않고 반환한다.
		int v1 = 3;
		System.out.println(false && ++v1 > 6); // 이미 첫 항이 false기에 AND연산자의 특성상 반드시 false를 반환한다.
		System.out.println(v1); // 따라서 v1에는 ++ 증감연산자가 적용되지 않았기에 v1은 그대로 3이다.

		int v2 = 3;
		System.out.println(false & ++v2 > 6); // 비트연산자는 쇼트서킷이 없어 모든 항을 검사한다.
		System.out.println(v2); // false임을 확인하는 건 같지만, v2에 증감연산자도 적용되어 4가 되었다.

		int v3 = 3;
		System.out.println(true || ++v3 > 6);
		System.out.println(v3);

		int v4 = 3;
		System.out.println(true | ++v4 > 6);
		System.out.println(v4);

	}
}
