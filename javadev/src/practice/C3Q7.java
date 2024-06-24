package practice;

public class C3Q7 {
	public static void main(String[] args) {
		int a = 4, b = 5, c = 6;
		System.out.println(false && a-- > 6); // false -> &&연산자의 쇼트서킷
		System.out.println(true | b++ > 6); // b++ > 6 (b+=1) -> 5>6 : false -> true | false : true
		System.out.println(a); // 4
		System.out.println(b); // 6
		System.out.println(c); // 6
	}
}
