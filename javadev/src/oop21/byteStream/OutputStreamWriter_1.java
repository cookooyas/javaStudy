package oop21.byteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_1 {
	public static void main(String[] args) {
		File ow1 = new File("src/oop21/byteStream/OutputStreamWriter1.txt");
		try (Writer writer = new FileWriter(ow1);) {
			writer.write("OutputStreamWriter1 예제파일입니다.\n");
			writer.write("한글과 영문이 모두 포함돼 있습니다.");
			writer.write("\n");
			writer.write("Good Bye!!\n\n");
			writer.flush();
		} catch (IOException e) {
		}

		File ow2 = new File("src/oop21/byteStream/OutputStreamWriter2.txt");
		try (OutputStream os = new FileOutputStream(ow2, false);
				OutputStreamWriter osw = new OutputStreamWriter(os, "MS949");) {
			osw.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			osw.write("한글과 영문이 모두 포함돼 있습니다.");
			osw.write("\n");
			osw.write("Good Bye!!\n\n");
			osw.flush();
		} catch (IOException e) {
		}
	}

}
