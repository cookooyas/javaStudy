package oop21.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_1 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		int data;
		while ((data = is.read()) != '\r') {
			System.out.println("읽은 데이터 : " + (char) data + ", 남은 바이트 수 : " + is.available());
		}
		System.out.println(data); // 현재 13 (='\r') 까지만 읽음. 하지만 윈도우에서 엔터는 '\r'+'\n'이기에 아직 \n이 남아있음
		System.out.println(is.read()); // 따라서 한번 더 출력해줘서 \n을 빼내야함.
	}
}
