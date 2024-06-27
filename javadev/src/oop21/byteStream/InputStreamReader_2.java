package oop21.byteStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_2 {
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in,"UTF-8");
			int data;
			while((data=isr.read())!='\r') {
				System.out.print((char)data);
			}
			System.out.println('\n'+isr.getEncoding());
		}
		
		catch(IOException e) {}
		try {
			InputStreamReader isr = new InputStreamReader(System.in,"MS949");
			int data;
			while((data=isr.read())!='\r') {
				System.out.print((char)data);
			}
			System.out.println('\n'+isr.getEncoding());
		}
		
		catch(IOException e) {}
		
	}
}
