package oop21.byteStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriter {
	public static void main(String[] args) {
		File f = new File("src/oop21/byteStream/ReaderWriterFile.txt");
		try(
				Writer writer = new FileWriter(f);
				){
			writer.write("안녕하세요!\n".toCharArray());
			writer.write("Hello");
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다.",2,3);
		}catch(IOException e){
			
		}
		try(
				Reader reader = new FileReader(f);
				){
			int data;
			while((data = reader.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(IOException e){
			
		}
	}
}
