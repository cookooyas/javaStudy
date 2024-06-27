package oop21.byteStream;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject_3 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		byte[] arr1 = new byte[100];
		int cnt1 = is.read(arr1);
		String str1 = new String(arr1, 0, cnt1, Charset.forName("UTF-8"));
		System.out.println(str1);
		byte[] arr2 = new byte[100];
		int cnt2 = is.read(arr2, 3, 6);
		String str2 = new String(arr2, 0, 3 + cnt2, Charset.defaultCharset());
		System.out.println(str2);
	}
}
