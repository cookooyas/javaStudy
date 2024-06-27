package oop21.byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_2 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		byte[] arr1 = "안녕하세요".getBytes();
		os.write(arr1);
		os.write('\n');
		os.flush();

		byte[] arr2 = "반갑습니다.".getBytes();
		os.write(arr2, 3, 6);
		os.flush();
	}
}
