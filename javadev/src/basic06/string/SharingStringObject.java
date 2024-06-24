package basic06.string;

public class SharingStringObject {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");

		// 스택 메모리 값 비교
		// 문자열 자체 비교 : equals
		System.out.println(str1 == str2);
		System.out.println(str3 == str2);
		System.out.println(str4 == str3);
		System.out.println(str1 == str4);
	}
}
