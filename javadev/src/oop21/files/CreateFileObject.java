package oop21.files;

// 잔디누락
import java.io.File;
import java.io.IOException;

public class CreateFileObject {
	public static void main(String[] args) throws IOException {
		File tmpDir = new File("C:\\dev");
		if (!tmpDir.exists())tmpDir.mkdir();
		System.out.println(tmpDir.exists());
		
		File nf = new File("C:\\dev\\nf.txt");
		if(!nf.exists()) nf.createNewFile();
		System.out.println(nf.exists());

		File nf2 = new File("C:\\dev\\nf.txt");
		File nf3 = new File("C:/dev/nf.txt");
		File nf4 = new File("C:"+File.separator+"dev"+File.separator+"nf.txt");

		System.out.println(nf2.exists());
		System.out.println(nf3.exists());
		System.out.println(nf4.exists());
		
		File nf5 = new File("C:\\dev\\nf.txt");
		File nf6 = new File("C:\\dev\\sw\\nf.txt");
		System.out.println(nf5.getAbsolutePath());
		System.out.println(nf6.getAbsolutePath());
		
		System.out.println(System.getProperty("user.dir"));
		File nf7 = new File("nf.txt");
		File nf8 = new File("sw\\nf.txt");
		System.out.println(nf7.getAbsolutePath());
		System.out.println(nf8.getAbsolutePath());
		
		
	}
}
