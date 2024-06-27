package oop21.byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CombineFilterStream {
	public static void main(String[] args) {
		File data = new File("src/oop21/byteStream/data2.data");
		try (OutputStream os = new FileOutputStream(data);
				BufferedOutputStream bos = new BufferedOutputStream(os);
				DataOutputStream dos = new DataOutputStream(bos);) {
			dos.writeInt(22);
			dos.writeDouble(3.3324);
			dos.writeChar('a');
			dos.writeChar('1');
			dos.writeChar('2');
			dos.writeChar('3');
			dos.writeChar('4');
			dos.writeUTF("이게 뭐여");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (InputStream is = new FileInputStream(data);
				BufferedInputStream bis = new BufferedInputStream(is);
				DataInputStream dis = new DataInputStream(bis);) {
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
