package oop21.byteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		File outp = new File("src/oop21/byteStream/outTest.txt");
		OutputStream os1 = new FileOutputStream(outp);
		os1.write('J');
		os1.write('J');
		os1.write('J');
		os1.write('J');
		os1.write('\r');
		os1.write('\n');
		os1.flush();
		os1.close();

		OutputStream os2 = new FileOutputStream(outp, true);
		byte[] arr1 = "Hello!".getBytes();
		os2.write(arr1);
		os2.write('\n');
		os2.flush();
		os2.close();

		OutputStream os3 = new FileOutputStream(outp, true);
		byte[] arr2 = "Better the last smile than the first laughter".getBytes();
		os3.write(arr2, 7, 8);
		os3.flush();
		os3.close();

	}
}
