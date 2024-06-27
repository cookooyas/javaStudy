package oop21.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_2 {
	public static void main(String[] args) throws IOException {
		File inp = new File("src/oop21/byteStream/FileInputStream1.txt");
		InputStream is1 = new FileInputStream(inp);
		int data;
		while((data=is1.read())!=-1) {
			System.out.print((char)data);
		}
		is1.close();
		System.out.println();
		System.out.println();
		
		InputStream is2 = new FileInputStream(inp);
		byte[] arr1 = new byte[9];
		int cnt1;
		while((cnt1 = is2.read(arr1))!=-1) {
			for(int i =0;i<cnt1;i++) {
				System.out.print((char)arr1[i]);
			}
			System.out.println(": count1 = "+cnt1);
		}
		is2.close();
		System.out.println();
		System.out.println();
		InputStream is3 = new FileInputStream(inp);
		byte[] arr2 = new byte[9];
		int offset =3;
		int length =6;
		int cnt2 = is3.read(arr2,offset,length);
		for(int i =0;i<offset+cnt2;i++) {
			System.out.print((char)arr2[i]);
		}
		is3.close();
	}
}
