package oop21.byteStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		File f = new File("src/oop21/byteStream/bufferedReaderWriter.txt");
		try (Writer w = new FileWriter(f); BufferedWriter bw = new BufferedWriter(w);) {
			bw.write("안녕하세요!\n".toCharArray());
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("반갑습니다.", 2, 3);
			bw.flush();
		} catch (IOException e) {
		}
		try (Reader reader = new FileReader(f); BufferedReader br = new BufferedReader(reader);) {
			int data;
			while ((data = br.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {

		}
	}
}
