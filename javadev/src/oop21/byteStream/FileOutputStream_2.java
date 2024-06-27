package oop21.byteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_2 {
	public static void main(String[] args) throws IOException {
		File outp = new File("src/oop21/byteStream/outTest2.txt");
		OutputStream os2 = new FileOutputStream(outp, true);
		byte[] arr1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
		os2.write(arr1);
		os2.write('\n');
		os2.flush();
		os2.close();
		OutputStream os3 = new FileOutputStream(outp, true);
		byte[] arr2 = "반갑습니다.".getBytes(Charset.defaultCharset());
		os3.write(arr2, 6, 6);
		os3.flush();
		os3.close();
	}
}
