package oop21.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_3 {
	public static void main(String[] args) throws IOException {
		File inp = new File("src/oop21/byteStream/test2.txt");
		InputStream is2 = new FileInputStream(inp);
		byte[] arr1 = new byte[9];
		int cnt1;
		while ((cnt1 = is2.read(arr1)) != -1) {
			String str = new String(arr1, 0, cnt1, Charset.forName("UTF-8"));
			System.out.print(str);
			System.out.println(": count1 = " + cnt1);
		}
		is2.close();
		System.out.println();
		System.out.println();

		InputStream is3 = new FileInputStream(inp);
		byte[] arr2 = new byte[9];
		int offset = 3, length = 6;
		int cnt2 = is3.read(arr2, offset, length);
		String str = new String(arr2, 0, offset + cnt2, Charset.defaultCharset());
		System.out.println(str);
		is3.close();
	}
}
