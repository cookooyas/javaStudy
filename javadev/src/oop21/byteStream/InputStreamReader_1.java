package oop21.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReader_1 {
	public static void main(String[] args) {
		File f = new File("src/oop21/byteStream/ANSItest.txt");
		try (Reader reader = new FileReader(f);) {
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {

		}
		System.out.println();
		try (InputStream is = new FileInputStream(f); InputStreamReader isr = new InputStreamReader(is, "MS949");) {
			int data;
			while ((data = isr.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println("\n" + isr.getEncoding());
		} catch (IOException e) {

		}
	}
}
