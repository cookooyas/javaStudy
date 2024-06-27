package oop21.byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputOutputStream {
	public static void main(String[] args) {
		File img = new File("src/oop21/byteStream/다운로드.jpg");
		File img2 = new File("src/oop21/byteStream/다운로드1.jpg");
		File img3 = new File("src/oop21/byteStream/다운로드2.jpg");

		long start, end, time1, time2;

		start = System.nanoTime();
		try (InputStream is = new FileInputStream(img); OutputStream os = new FileOutputStream(img2)) {
			int data;
			while ((data = is.read()) != -1) {
				os.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("buffer x : " + time1);

		start = System.nanoTime();
		try (InputStream is = new FileInputStream(img);
				BufferedInputStream bis = new BufferedInputStream(is);
				OutputStream os = new FileOutputStream(img2);
				BufferedOutputStream bos = new BufferedOutputStream(os);) {
			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("buffer o : " + time2);
		System.out.println(time1/time2);
	}
}
