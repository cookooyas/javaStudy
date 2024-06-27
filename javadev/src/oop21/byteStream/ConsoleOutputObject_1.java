package oop21.byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');

		os.write('\r');
		os.write('\n');
		os.flush();

		byte[] arr1 = "Hello!".getBytes();
		os.write(arr1);
		os.write('\n');
		os.flush();

		byte[] arr2 = "hihi I am a dddadfa".getBytes();
		os.write(arr2, 7, 8);
		os.flush();
	}
}
