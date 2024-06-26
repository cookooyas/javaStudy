package oop21.files;

//잔디누락
import java.io.File;

public class FileMethods {
	public static void main(String[] args) {
		File tmpDir = new File("C:\\dev");
		if (tmpDir.exists())
			tmpDir.mkdir();

		File file = new File("C:\\dev");
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("폴더? : " + file.isDirectory());
		System.out.println("파일? : " + file.isFile());
		System.out.println("파일/폴더 이름 : " + file.getName());
		System.out.println("부모 폴더 : " + file.getParent());

		File f1 = new File("C:\\dev\\aa");
		System.out.println(f1.mkdir());
		File f2 = new File("C:\\dev\\aa\\bb");
		System.out.println(f2.mkdir());
		System.out.println(f2.mkdirs());
		File[] fn = file.listFiles();
		for (File name : fn) {
			System.out.println((name.isDirectory() ? "폴더" : "파일") + name.getName());
		}
	}
}
