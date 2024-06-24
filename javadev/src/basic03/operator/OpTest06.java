package basic03.operator;

public class OpTest06 {
	public static void main(String[] args) {
		// 증감연산자(++, --)는 붙는 위치에 따라 연산이 달라진다.
		// 만약 변수 앞에 증감연산자를 붙일 경우 해당 연산(+1, -1)이 먼저 발생한다.
		// 이후에 다른 연산을 처리한다.
		int a = 5;
		int b = ++a;
		// a+=1
		// b=a
		System.out.println("a => "+a);
		System.out.println("b = ++a => "+b);
		System.out.println();

		// 만약 변수 뒤에 증감연산자를 붙일 경우, 다른 연산이 먼저 발생한다.
		// 이후 해당 변수에 증감연산자가 작용한다.
		a = 5;
		b = a++;
		// b=a
		// a+=1
		System.out.println("a => "+a);
		System.out.println("b = a++ => "+b);
		System.out.println();
	}
}
