package oop21.files;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArrayToFromString {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] arr1 = "안녕".getBytes();
		byte[] arr2 = "땡큐".getBytes(Charset.defaultCharset());
		byte[] arr3 = "베리".getBytes(Charset.forName("MS949"));
		byte[] arr4 = "감사".getBytes("UTF-8");

		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		System.out.println(arr4.length);

		String str1 = new String(arr1);
		String str2 = new String(arr2, Charset.defaultCharset());
		String str3 = new String(arr3, Charset.forName("MS949"));
		String str4 = new String(arr4, "UTF-8");
		String str5 = new String(arr3, "UTF-8");
		String str6 = new String(arr4, "MS949");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		/*
		 * 6 6 4 6 안녕 땡큐 베리 감사 ���� 媛먯궗
		 */

	}
}
