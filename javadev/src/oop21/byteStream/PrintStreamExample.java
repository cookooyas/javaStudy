package oop21.byteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) {
		File f1 = new File("src/oop21/byteStream/printStream1.txt");
		File f2 = new File("src/oop21/byteStream/printStream2.txt");
		try (OutputStream os = new FileOutputStream(f1); PrintStream ps = new PrintStream(os);) {
			ps.println(5.4);
			ps.print(3 + "안녕");
			ps.printf("%d ", 7);
			ps.println();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error1");
		}
		try (PrintStream ps = new PrintStream(f2);) {
			ps.println(5.4);
			ps.print(3 + "안녕");
			ps.printf("%d ", 7);
			ps.println();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error2");
		}
		try (OutputStream os = System.out; PrintStream ps = new PrintStream(os);) {
			ps.println(5.4);
			ps.print(3 + "안녕");
			ps.printf("%d ", 7);
			ps.println();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error3");
		}
	}
}
