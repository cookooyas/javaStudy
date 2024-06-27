package oop21.byteStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
	public static void main(String[] args) {
		File printWriter1 = new File("src/oop21/byteStream/printWriter1.txt");
		File printWriter2 = new File("src/oop21/byteStream/printWriter2.txt");
		File printWriter3 = new File("src/oop21/byteStream/printWriter3.txt");

		try (PrintWriter pw = new PrintWriter(printWriter1);) {
			pw.println("PrintWriter 예제1");
			pw.println(13);
			pw.println(5.8);
			pw.print("하이요~");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch (IOException e) {
		}

		try (PrintWriter pw = new PrintWriter(printWriter2);) {
			pw.println("PrintWriter 예제2");
			pw.println(13);
			pw.println(5.8);
			pw.print("하이요~");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch (IOException e) {
		}

		try (PrintWriter pw = new PrintWriter(printWriter3);) {
			pw.println("PrintWriter 예제3");
			pw.println(13);
			pw.println(5.8);
			pw.print("하이요~");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch (IOException e) {
		}

		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("PrintWriter 예제4");
		pw.println(13);
		pw.println(5.8);
		pw.print("하이요~");
		pw.println("반갑습니다.");
		pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
	}
}
