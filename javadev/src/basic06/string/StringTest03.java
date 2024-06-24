package basic06.string;

import java.util.Arrays;

public class StringTest03 {
	public static void main(String[] args) {
		// length()
		String str1 = "Hello Java!";
		System.out.println(str1.length());
		System.out.println();

		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str2.length());
		System.out.println();

		// charAt() : 문자열에서 특정 인덱스에 위치해 있는 문자 검색

		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));

		// indexOf() : 문자열에서 특정 문자나 문자열을 앞에서부터 인덱스 값을 알아내기 위해 검색
		// lastIndexOf() : ... 뒤에서 부터 검색에서 인덱스 알아내기 위해 검색

		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.indexOf("a", 8)); // 8번째 인덱스 이후의 검색
		System.out.println(str1.lastIndexOf("a", 8)); // 8번째부터 이전 순으로 검색

		System.out.println(str1.indexOf("Java")); // 문자열의 경우 첫 문자의 인덱스를 반환
		System.out.println(str1.lastIndexOf("Java")); // 마찬가지로 문자열의 첫 문자의 인덱스를 반환

		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));

		System.out.println(str1.indexOf("Bye")); // 검색한 문자(또는 문자열)가 없다면 -1이 반환된다.
		System.out.println(str1.lastIndexOf("고맙습니다"));

		System.out.println();

		// String.valueOf() : 기본 자료형 -> 문자열로 변환

		String str3 = String.valueOf(2.3); // double형 2.3이 문자열로 변환
		System.out.println(str3);

		String str4 = String.valueOf(false); // boolean형 false가 문자열로 변환
		System.out.println(str4);

		// concat() : 문자열 합치기 (앞 문자 뒤에 concat한 문자열이 붙음)
		String str5 = str3.concat(str4);
		System.out.println(str5);

		// concat, String.valueOf의 결합
		String str6 = "안녕" + 3;
		System.out.println(str6);
		String str7 = "안녕".concat(String.valueOf(3));
		System.out.println(str7);
		
		// getBytes() : 문자열 -> byte[]
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		byte[] arr1 = str8.getBytes();
		byte[] arr2 = str9.getBytes();

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2)); 	// 한글을 바이트 변환하면 UTF-8형식으로 변환해 담는다.
													// https://namu.wiki/w/%ED%98%84%EB%8C%80%20%ED%95%9C%EA%B8%80%EC%9D%98%20%EB%AA%A8%EB%93%A0%20%EA%B8%80%EC%9E%90/%EC%9C%A0%EB%8B%88%EC%BD%94%EB%93%9C
													// 해당 사이트에서 찾아본다면, 예를들어 "안" 은 C548이며, 이를 바이트로 변환하면,
													// 1100 / 0101 / 0100 / 1000 이다.
													// 이를 3바이트 변환하게 된다면 
													// "1110" + 1100 / "10" + 1010101 / "10" + 001000 다음과 같이 변형시킨다.
													// 전에 있었던 이진코드 읽는법을 이용하면 된다.
													// 11101100의 경우 이진코드를 읽게 되면 -(2^4+2^1+2^0+1)= -20
													// 10010101의 경우 이진코드를 읽게 되면 -(2^6+2^5+2^3+2^1+1)=-107
													// 10001000의 경우 이진코드를 읽게 되면 -(2^6+2^5+2^4+2^2+2^1+2^0+1)= -120..?
													// 아무튼 이런식으로 3바이트의 코드로 문자를 저장하게 된다.
		
		char[] arr3 = str8.toCharArray();
		char[] arr4 = str8.toCharArray();
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
	}

}
