package practice;

public class C3Q9 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		System.out.println((a > b) ? "안녕하세요" : "반갑습니다"); // a>b : false -> "반갑습니다"
		System.out.println((a < b) ? (b > c) ? "타입 A" : "타입 B" : (b > c) ? "타입 C" : "타입 D");
		// a<b : true -> b>c : false -> "타입 B"
	}
}
