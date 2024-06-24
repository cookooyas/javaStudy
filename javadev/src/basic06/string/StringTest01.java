package basic06.string;

public class StringTest01 {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		System.out.println(str1.toString());
		System.out.println(str1);
		System.out.println(str1.hashCode()); // 주소

		String str2 = "안녕하세요";
		System.out.println(str2);
	}
}
