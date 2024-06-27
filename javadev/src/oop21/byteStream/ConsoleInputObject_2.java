package oop21.byteStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ConsoleInputObject_2 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in; //H e l l o \r \n
		int data;
		while ((data = is.read()) != '\r') {
			System.out.println((char) data);
		}
		is.read();
		System.out.println();
		System.out.println();

		byte[] arr1 = new byte[100];
		int cnt1 = is.read(arr1);
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < cnt1; i++) {
			System.out.print((char) arr1[i]);
		}
		System.out.println(": count1 = " + cnt1);
		System.out.println();
		byte[] arr2 = new byte[100];
		int offset = 5;
		int len = 5;
		int cnt2 = is.read(arr2, offset, len); // (o) (o) (o) w h a t
		for (int i = 0; i < offset + cnt2; i++) {
			System.out.print((char) arr2[i]);
		}
		System.out.println(": count2 = " + cnt2);
	}
}
