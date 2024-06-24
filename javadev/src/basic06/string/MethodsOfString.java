package basic06.string;

import java.util.Arrays;

public class MethodsOfString {
	public static void main(String[] args) {
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());

		System.out.println(str1.replace("Study", "공부"));
		System.out.println(str1.substring(0, 5)); // 0 "이상" 5 "미만"의 문자 인덱스 추출

		String[] strArray = "abc/def-ghi jkl".split("/|-| "); // 여기서 split 내 |는 또는 을 의미함
		System.out.println(Arrays.toString(strArray));

		System.out.println("      abc        ".trim());

		System.out.println();

		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("Java");

		System.out.println(str2 == str3);
		System.out.println(str2 == str4);
		System.out.println(str4 == str3);

		System.out.println(str2.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str4.equals(str3));
	}
}
